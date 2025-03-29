package com.webproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
