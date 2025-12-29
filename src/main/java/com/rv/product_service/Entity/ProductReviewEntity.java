package com.rv.product_service.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity
@Table(name = "product_review_entity")
public class ProductReviewEntity {

    @Id
    @Column(name = "product_id")
    private int reviewId;
    @Column(name = "author")
    private String author;
    @Column(name = "description")
    private String description;
    @Column(name = "content")
    private String content;
}
