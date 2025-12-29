package com.rv.product_service.Service;

import com.rv.product_service.Controller.Product;
import com.rv.product_service.Entity.ProductEntity;
import com.rv.product_service.Entity.ProductReviewEntity;
import com.rv.product_service.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.random.RandomGenerator;

@RestController
public class ProductServiceImpl implements Product {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductEntity getProduct(int productId) {
        ProductEntity product = productRepository.findById(productId)
                .orElse(new ProductEntity(0, "Product Doesn't Exist", 0, null));
        return new ProductEntity(product.getProductId(), product.getName(), product.getWeight(), product.getExpiry());
    }

    @Override
    public ProductEntity updateProduct(int productId) {
        return productRepository.findById(productId)
                .map(existingProduct -> {
                    ProductEntity updatedProduct = new ProductEntity(productId, "UpdatedProduct " + productId, 100, LocalDateTime.now());
                    return productRepository.save(updatedProduct);
                })
                .orElse(new ProductEntity(0, "Product Doesn't Exist", 0, null));
    }

    @Override
    public ProductEntity insertProduct(int productId) {
        ProductEntity product = new ProductEntity(productId, "Product " + productId, RandomGenerator.getDefault().nextInt(), LocalDateTime.now());
        productRepository.save(product);
        return new ProductEntity(productId,"Product",100,LocalDateTime.now());
    }

    @Override
    public ProductEntity deleteProduct(int productId) {
        return productRepository.findById(productId)
                .map(existingProduct -> {
                    productRepository.deleteById(productId);
                    return new ProductEntity(0, "Product Deleted", 0, null);
                })
                .orElse(new ProductEntity(0, "Product Doesn't Exist", 0, null));
    }


}