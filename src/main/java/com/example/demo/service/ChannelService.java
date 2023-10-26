package com.example.demo.service;

import com.example.demo.service.dto.ChannelDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

/**
 * Service Interface for managing {@link com.example.demo.domain.Channel}.
 */
public interface ChannelService {

    /**
     * Save a channel.
     *
     * @param channelDTO the entity to save.
     * @return the persisted entity.
     */
    ChannelDTO save(ChannelDTO channelDTO);

    /**
     * Get all the channels.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<ChannelDTO> findAll(Pageable pageable);

    /**
     * Get all the channels with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    Page<ChannelDTO> findAllWithEagerRelationships(Pageable pageable);


    /**
     * Get the "id" channel.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<ChannelDTO> findOne(Long id);

    /**
     * Delete the "id" channel.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
