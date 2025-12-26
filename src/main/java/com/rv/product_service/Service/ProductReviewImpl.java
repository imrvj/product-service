package com.rv.product_service.Service;

import com.rv.product_service.Controller.ProductReview;
import com.rv.product_service.Entity.ProductReviewEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductReviewImpl implements ProductReview {
    @Override
    public ProductReviewEntity getReview(int productId) {
        return new ProductReviewEntity(productId,"authorName","Description Some","Some Big content to Display here");
    }
}
