package com.rv.product_service.Service;

import com.rv.product_service.Controller.UserDetails;
import com.rv.product_service.Entity.UserDetailsEntity;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserDetailImpl implements UserDetails {
    @Override
    public UserDetailsEntity getUser(int userId) {
        // Call external API
        RestTemplate restTemplate = new RestTemplate();
        String externalUrl = "https://jsonplaceholder.typicode.com/posts/" + userId;
        
        try {
            String response = restTemplate.getForObject(externalUrl, String.class);
            System.out.println("External API Response: " + response);
        } catch (Exception e) {
            System.out.println("Error calling external API: " + e.getMessage());
        }
        
        // Return your entity
        UserDetailsEntity user = new UserDetailsEntity(userId, "User description " + userId, "User content data");
        
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(user);
            System.out.println("JSON Response: " + json);
        } catch (Exception e) {
            System.out.println("Error converting to JSON: " + e.getMessage());
        }
        
        return user;
    }
}