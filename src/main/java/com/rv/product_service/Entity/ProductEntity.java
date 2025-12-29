package com.rv.product_service.Entity;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "product_entity")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    @Id
    @Column(name = "product_id")
    private int productId;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "weight")
    private int weight;
    
    @Column(name = "expiry")
    private String expiry;
}