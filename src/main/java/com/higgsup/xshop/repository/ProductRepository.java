package com.higgsup.xshop.repository;

import com.higgsup.xshop.entity.Category;
import com.higgsup.xshop.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductRepository extends JpaRepository<Product, Integer>,
    JpaSpecificationExecutor<Product> {

  Page<Product> findProductsByCategory(Category category, Pageable pageRequest);
}
