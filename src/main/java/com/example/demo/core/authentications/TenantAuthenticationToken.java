package com.example.demo.core.authentications;

import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class TenantAuthenticationToken extends UsernamePasswordAuthenticationToken {
    private final Object principal;
    private final int tenantId;

    //principal, token, authorities
    public TenantAuthenticationToken(Object principal, Object credentials, Collection<? extends GrantedAuthority> authorities, int tenantId) {
        super(principal, credentials, authorities);
        setAuthenticated(true);
        this.principal = principal;
        this.tenantId = tenantId;
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return this.principal;
    }

    public int getTenantId() {
        return this.tenantId;
    }

}
