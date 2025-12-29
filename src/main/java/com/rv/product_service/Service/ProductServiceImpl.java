package com.rv.product_service.Service;

import com.rv.product_service.Controller.Product;
import com.rv.product_service.Entity.ProductEntity;
import com.rv.product_service.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceImpl implements Product {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity getProduct(int productId) {

        return new ProductEntity(productId, "name-" + productId, 123,"12-10-34");
    }



}