package com.rv.product_service.Controller;

import com.rv.product_service.Entity.ProductReviewEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductReview {

    @GetMapping(value = "/review/{productId}",produces = "application/json")
    ProductReviewEntity getReview(@PathVariable int productId);
}
