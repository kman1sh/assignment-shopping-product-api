package com.manish.shoppingservice.service;

import com.manish.shoppingservice.model.Product;
import com.manish.shoppingservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repo;

    @Autowired
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }


    public void save(Product product) {
        repo.save(product);

    }

    public List<Product> getProduct(String pName, String color, String category) {

        if(pName !=null) {
            //find by product name
            return repo.findAllByName(pName);
        } else if(color !=null) {
            return repo.findAllByColor(color);
        } else if(category !=null) {
            return repo.findAllByCategories_name(category);
        } else {
            return new ArrayList<>();
        }
    }


}
