package com.tamla.ecomm.controller.api;


import com.tamla.ecomm.model.Product;
import com.tamla.ecomm.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Get a list of all the products.
     * To access the URL GET <b>http://yourserver/api/products</b>
     * @return JSON list of all products
     */
    @GetMapping(value = { "/products"})
    public List<Product> list() {
        return this.productService.findAllByOrderByProductName();
    }
}
