package com.rv.product_service.Entity;
import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductEntity {
    private int productId;
    private String name;
    private int weight;
    private String Expiry;
}