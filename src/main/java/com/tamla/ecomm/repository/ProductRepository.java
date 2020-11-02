package com.tamla.ecomm.repository;

import com.tamla.ecomm.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByProductId(Long productId);

    List<Product> findAllByOrderByProductName();

}
