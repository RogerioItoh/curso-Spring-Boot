package com.rogerioitoh.course_001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerioitoh.course_001.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {

}
