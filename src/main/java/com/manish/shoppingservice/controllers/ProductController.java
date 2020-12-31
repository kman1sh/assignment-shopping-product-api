package com.manish.shoppingservice.controllers;

import com.manish.shoppingservice.model.Product;
import com.manish.shoppingservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping("/product")
    public void addProduct(@RequestBody Product product) {
        productService.save(product);
    }


    @GetMapping("/search")
    public List<Product> getProduct(@RequestParam(required = false) String product, @RequestParam(required = false) String color, @RequestParam(required = false) String category) {
        return productService.getProduct(product, color, category);
    }
}
