package com.rv.product_service.Controller;

import com.rv.product_service.Service.ProductEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface Product {

    @GetMapping(value = "/product/{productId}", produces = "application/json")
    ProductEntity getProduct(@PathVariable int productId);
}
