package com.rv.product_service.Service;

import com.rv.product_service.Controller.ProductReview;
import com.rv.product_service.Entity.ProductReviewEntity;
import com.rv.product_service.Repository.ProductReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductReviewImpl implements ProductReview {

    @Autowired
    private ProductReviewRepository productReviewRepository;

    @Override
    public ProductReviewEntity getReview(int reviewId) {
        ProductReviewEntity productReviewEntity = productReviewRepository.findById(reviewId)
                .orElse(new ProductReviewEntity(0, "", "Review Not Found", ""));
        return new ProductReviewEntity(productReviewEntity.getReviewId(), productReviewEntity.getAuthor(), productReviewEntity.getDescription(), productReviewEntity.getContent());

    }

    @Override
    public ProductReviewEntity addReview(int reviewId) {
        ProductReviewEntity productReviewEntity = new ProductReviewEntity(reviewId, "Ranvijay Singh", "Some Description for Review", "Some long text here for content of review");
        productReviewRepository.save(productReviewEntity);
        return new ProductReviewEntity(productReviewEntity.getReviewId(), productReviewEntity.getAuthor(), productReviewEntity.getDescription(), productReviewEntity.getContent());
    }

    @Override
    public ProductReviewEntity deleteReview(int reviewId) {
        return productReviewRepository.findById(reviewId)
                .map(existingReview -> {
                    productReviewRepository.deleteById(reviewId);
                    return new ProductReviewEntity(reviewId, "RV", "Content Deleted", "Nothing Left");
                })
                .orElse(new ProductReviewEntity(reviewId, "RV", "Content Not Found", "Nothing Left to delete"));
    }
}
