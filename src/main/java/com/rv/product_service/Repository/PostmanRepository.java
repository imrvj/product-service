package com.rv.product_service.Repository;

import com.rv.product_service.Entity.PostmanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostmanRepository extends JpaRepository<PostmanEntity, Long> {
}
