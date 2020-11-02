package com.tamla.ecomm.service.impl;

import com.tamla.ecomm.model.Product;
import com.tamla.ecomm.repository.ProductRepository;
import com.tamla.ecomm.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findByProductId(Long productId) {
        return productRepository.findByProductId(productId);
    }

    @Override
    public List<Product> findAllByOrderByProductName() {
        return  productRepository.findAllByOrderByProductName();
    }
}
