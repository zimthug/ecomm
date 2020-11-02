package com.tamla.ecomm.service;

import com.tamla.ecomm.model.Product;

import java.util.List;

public interface ProductService {

    Product findByProductId(Long productId);

    List<Product> findAllByOrderByProductName();

}
