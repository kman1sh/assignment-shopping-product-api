package com.manish.shoppingservice.repository;

import com.manish.shoppingservice.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends CrudRepository<Category, Integer> {
}
