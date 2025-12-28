package com.rv.product_service.Controller;

import com.rv.product_service.Entity.ProductEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Tag(name = "Product", description = "Product management API")
public interface Product {

    @Operation(
        summary = "Get product by ID",
        description = "Retrieve a product by its unique identifier"
    )
    @ApiResponse(responseCode = "200", description = "Product found")
    @ApiResponse(responseCode = "404", description = "Product not found")
    @GetMapping(value = "/product/{productId}", produces = "application/json")
    ProductEntity getProduct(
        @Parameter(description = "Product ID", required = true) 
        @PathVariable int productId
    );
}
