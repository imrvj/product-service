package com.rv.product_service.Controller;

import com.rv.product_service.Entity.ProductEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Product", description = "Product management API")
public interface Product {

    @GetMapping(value = "/product/{productId}", produces = "application/json")
    ProductEntity getProduct(
            @PathVariable int productId
    );

    @PatchMapping(value = "/update/{productId}", produces = "application/json")
    ProductEntity updateProduct(
        @PathVariable int productId);

    @PostMapping(value = "/insert/{productId}", produces = "application/json")
    ProductEntity insertProduct(
            @PathVariable int productId);

    @DeleteMapping(value = "/delete/{productId}", produces = "application/json")
    ProductEntity deleteProduct(@PathVariable int productId);

}
