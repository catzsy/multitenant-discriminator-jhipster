package com.example.demo.service.mapper;


import com.example.demo.domain.*;
import com.example.demo.service.dto.ChannelDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link Channel} and its DTO {@link ChannelDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface ChannelMapper extends EntityMapper<ChannelDTO, Channel> {


    @Mapping(target = "removeUser", ignore = true)

    default Channel fromId(Long id) {
        if (id == null) {
            return null;
        }
        Channel channel = new Channel();
        channel.setId(id);
        return channel;
    }
}
