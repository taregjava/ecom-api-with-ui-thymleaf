package com.halfacode.repository;

import com.halfacode.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
    Page<Product> findByReferenceOrNameOrDescription(String text, String text1, String text2, Pageable pageable);
}
