package com.example.demo.service.impl;

import com.example.demo.service.ChannelService;
import com.example.demo.domain.Channel;
import com.example.demo.repository.ChannelRepository;
import com.example.demo.service.dto.ChannelDTO;
import com.example.demo.service.mapper.ChannelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Channel}.
 */
@Service
@Transactional
public class ChannelServiceImpl implements ChannelService {

    private final Logger log = LoggerFactory.getLogger(ChannelServiceImpl.class);

    private final ChannelRepository channelRepository;

    private final ChannelMapper channelMapper;

    public ChannelServiceImpl(ChannelRepository channelRepository, ChannelMapper channelMapper) {
        this.channelRepository = channelRepository;
        this.channelMapper = channelMapper;
    }

    @Override
    public ChannelDTO save(ChannelDTO channelDTO) {
        log.debug("Request to save Channel : {}", channelDTO);
        Channel channel = channelMapper.toEntity(channelDTO);
        channel = channelRepository.save(channel);
        return channelMapper.toDto(channel);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<ChannelDTO> findAll(Pageable pageable) {
        log.debug("Request to get all Channels");
        return channelRepository.findAll(pageable)
            .map(channelMapper::toDto);
    }


    public Page<ChannelDTO> findAllWithEagerRelationships(Pageable pageable) {
        return channelRepository.findAllWithEagerRelationships(pageable).map(channelMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<ChannelDTO> findOne(Long id) {
        log.debug("Request to get Channel : {}", id);
        return channelRepository.findOneWithEagerRelationships(id)
            .map(channelMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete Channel : {}", id);
        channelRepository.deleteById(id);
    }
}
