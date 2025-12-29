package com.rv.product_service.Service;

import com.rv.product_service.Controller.UserDetails;
import com.rv.product_service.Entity.UserDetailsEntity;
import com.rv.product_service.Repository.UserDetailsRepository;
import com.rv.product_service.dto.ExternalUserDto;
import com.rv.product_service.mapper.UserDetailsMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserDetailImpl implements UserDetails {
    
    @Autowired
    private UserDetailsRepository userDetailsRepository;
    
    @Override
    public UserDetailsEntity getUser(int userId) {
        //Automatically converts JSON response to Java object
        RestTemplate restTemplate = new RestTemplate();
        String externalUrl = "https://jsonplaceholder.typicode.com/posts/" + userId;
        
        try {
            // Get external API response as DTO
            ExternalUserDto externalDto = restTemplate.getForObject(externalUrl, ExternalUserDto.class);
            
            // Use MapStruct to convert DTO to Entity
            UserDetailsEntity user = UserDetailsMapper.INSTANCE.externalDtoToEntity(externalDto);
            
            // Save to database
            userDetailsRepository.save(user);
            
            return user;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new UserDetailsEntity(userId, "Error", "Failed to fetch data");
        }
    }
}