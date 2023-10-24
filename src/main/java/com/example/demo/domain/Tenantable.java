package com.example.demo.domain;

import com.example.demo.config.Constants;
import com.example.demo.core.listeners.TenantEntityListener;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.ParamDef;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@FilterDef(name = Constants.TENANT_FILTER_NAME,
    parameters = @ParamDef(name = Constants.TENANT_PARAMETER_NAME, type = Constants.TENANT_PARAMETER_TYPE),
    defaultCondition = Constants.TENANT_COLUMN_NAME + " = :" + Constants.TENANT_PARAMETER_NAME)
@Filter(name = Constants.TENANT_FILTER_NAME)
@EntityListeners(TenantEntityListener.class)
public class Tenantable extends AbstractAuditingEntity {
    @JsonIgnore
    @Column(nullable = false)
    private int tenantId;

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }
}
