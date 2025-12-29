package com.rv.product_service.Controller;

import com.rv.product_service.Entity.ProductReviewEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Tag(name = "Product Review", description = "Product review management API")
public interface ProductReview {

    @GetMapping(value = "/review/{reviewId}", produces = "application/json")
    ProductReviewEntity getReview(
        @PathVariable int reviewId
    );

    @PostMapping(value = "/insertReview/{reviewId}", produces = "application/json")
    ProductReviewEntity addReview  (@PathVariable int reviewId);

    @DeleteMapping(value = "/deleteReview/{reviewId}", produces = "application/json")
    ProductReviewEntity deleteReview(@PathVariable int reviewId);
}
