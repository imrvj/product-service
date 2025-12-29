package com.rv.product_service.mapper;

import com.rv.product_service.dto.ExternalUserDto;
import com.rv.product_service.Entity.UserDetailsEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDetailsMapper {
    UserDetailsMapper INSTANCE = Mappers.getMapper(UserDetailsMapper.class);
    
    @Mapping(source = "id", target = "userId")
    @Mapping(source = "title", target = "description")
    @Mapping(source = "body", target = "content")
    UserDetailsEntity externalDtoToEntity(ExternalUserDto dto);
}