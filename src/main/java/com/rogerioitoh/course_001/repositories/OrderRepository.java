package com.rogerioitoh.course_001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerioitoh.course_001.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
