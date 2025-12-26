package com.rv.product_service.Service;
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