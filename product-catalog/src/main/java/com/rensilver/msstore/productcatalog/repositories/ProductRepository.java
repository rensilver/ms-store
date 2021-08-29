package com.rensilver.msstore.productcatalog.repositories;

import com.rensilver.msstore.productcatalog.entities.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName(String name);
}
