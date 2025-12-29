package com.rv.product_service.mapper;

import com.rv.product_service.Entity.PostmanEntity;
import com.rv.product_service.dto.PostmanDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PostmanMapper {
    PostmanMapper INSTANCE = Mappers.getMapper(PostmanMapper.class);

    @Mapping(source = "headers.host", target = "hostpostman")
    @Mapping(source = "headers.postmanToken", target = "token")
    @Mapping(source = "headers.contentlength", target = "cookiePostman")
    @Mapping(source = "url", target = "urlPostman")
    PostmanEntity postmanDtoToEntity(PostmanDto dto);
}