package com.rv.product_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class HeadersDto {
    private String host;
    
    @JsonProperty("postman-token")
    private String postmanToken;
    @JsonProperty("content-length")
    private String contentlength;
}