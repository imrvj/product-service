package com.rv.product_service.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_details")
public class UserDetailsEntity {

    @Id
    @Column(name = "user_id")
    private int userId;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "content")
    private String content;
}
