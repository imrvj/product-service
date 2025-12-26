package com.rv.product_service.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductReviewEntity {

    private  int reviewId;
    private String author;
    private String description;
    private String content;
}
