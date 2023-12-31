package com.example.demo.repository;

import com.example.demo.domain.Channel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Spring Data  repository for the Channel entity.
 */
@Repository
public interface ChannelRepository extends JpaRepository<Channel, Long> {

    @Query(value = "select distinct channel from Channel channel left join fetch channel.users",
        countQuery = "select count(distinct channel) from Channel channel")
    Page<Channel> findAllWithEagerRelationships(Pageable pageable);

    @Query("select distinct channel from Channel channel left join fetch channel.users")
    List<Channel> findAllWithEagerRelationships();

    @Query("select channel from Channel channel left join fetch channel.users where channel.id =:id")
    Optional<Channel> findOneWithEagerRelationships(@Param("id") Long id);
}
