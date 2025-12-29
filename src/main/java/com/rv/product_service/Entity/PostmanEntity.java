package com.rv.product_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "postman_details")
public class PostmanEntity {

    @Column(name = "hostpostman")
    private String hostpostman;
    
    @Id
    @Column(name = "token")
    private String token;
    
    @Column(name = "cookiepostman")
    private String cookiePostman;
    
    @Column(name = "urlpostman")
    private String urlPostman;
}