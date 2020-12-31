package com.manish.shoppingservice.repository;

import com.manish.shoppingservice.model.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findAllByName(String pname);
    List<Product> findAllByColor(String color);
    List<Product> findAllByCategories_name(String cat);

}
