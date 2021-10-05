package com.rogerioitoh.course_001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerioitoh.course_001.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
