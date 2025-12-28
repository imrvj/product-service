package com.rv.product_service.Controller;

import com.rv.product_service.Entity.ProductReviewEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag(name = "Product Review", description = "Product review management API")
public interface ProductReview {

    @Operation(
        summary = "Get product review by product ID",
        description = "Retrieve product reviews for a specific product"
    )
    @ApiResponse(responseCode = "200", description = "Review found")
    @ApiResponse(responseCode = "404", description = "Review not found")
    @GetMapping(value = "/review/{productId}", produces = "application/json")
    ProductReviewEntity getReview(
        @Parameter(description = "Product ID to get reviews for", required = true)
        @PathVariable int productId
    );
}
