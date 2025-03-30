package com.webproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
