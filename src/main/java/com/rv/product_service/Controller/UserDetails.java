package com.rv.product_service.Controller;

import com.rv.product_service.Entity.PostmanEntity;
import com.rv.product_service.Entity.UserDetailsEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserDetails {

    @GetMapping(value = "/user/{userId}", produces = "application/json")
    UserDetailsEntity getUser(
            @PathVariable int userId
    );

    @GetMapping(value = "/getPostman", produces = "application/json")
    PostmanEntity getPostman(

    );
}
