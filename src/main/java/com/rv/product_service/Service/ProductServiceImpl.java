package com.rv.product_service.Service;

import com.rv.product_service.Controller.Product;
import com.rv.product_service.Entity.ProductEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceImpl implements Product {


    @Override
    public ProductEntity getProduct(int productId) {

        return new ProductEntity(productId, "name-" + productId, 123,"12-10-34");
    }
}