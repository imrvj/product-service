package com.rv.product_service.Service;

import com.rv.product_service.Controller.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class ProductServiceImpl implements Product {


    @Override
    public ProductEntity getProduct(int productId) {

        return new ProductEntity(productId, "name-" + productId, 123,"12-10-34");
    }
}