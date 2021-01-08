package com.storeapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.storeapp.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
