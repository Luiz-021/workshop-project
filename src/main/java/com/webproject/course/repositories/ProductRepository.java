package com.webproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
