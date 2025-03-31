package com.webproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.course.entities.OrderItem;
import com.webproject.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
