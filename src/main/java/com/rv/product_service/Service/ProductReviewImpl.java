package com.rv.product_service.Service;

import com.rv.product_service.Controller.ProductReview;
import com.rv.product_service.Entity.ProductEntity;
import com.rv.product_service.Entity.ProductReviewEntity;
import com.rv.product_service.Exception.NotFoundException;
import com.rv.product_service.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductReviewImpl implements ProductReview {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Override
    public ProductReviewEntity getReview(int productId) {
        if (productId>5000 ){
            throw new NotFoundException("No product found for productId: " + productId);
        }
        else if (productId<5)
        {
            ProductEntity product = new ProductEntity(productId, "Product " + productId, 100, "2024-12-31");
            productRepository.save(product);
            return new ProductReviewEntity(productId,"RV","Description less then 5","Some Big content to Display here");
        }
        else
        {
            ProductEntity product = new ProductEntity(productId, "Product " + productId, 150, "2024-12-31");
            productRepository.save(product);
            return new ProductReviewEntity(productId, "RV", "Description Not in Range", "Some Big content to Display here");
        }
    }

    @Override
    public ProductReviewEntity deleteReview(int productId) {
        productRepository.deleteById(productId);
        return null;
    }
}
