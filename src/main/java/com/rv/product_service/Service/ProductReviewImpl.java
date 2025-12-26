package com.rv.product_service.Service;

import com.rv.product_service.Controller.ProductReview;
import com.rv.product_service.Entity.ProductReviewEntity;
import com.rv.product_service.Exception.NotFoundException;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductReviewImpl implements ProductReview {
    @Override
    public ProductReviewEntity getReview(int productId) {
        if (productId>5 ){
            throw new NotFoundException("No product found for productId: " + productId);
        }
        else if (productId<5)
        {
            return new ProductReviewEntity(productId,"RV","Description less then 5","Some Big content to Display here");
        }
        else
        {
            return new ProductReviewEntity(productId, "RV", "Description Not in Range", "Some Big content to Display here");
        }
    }
}
