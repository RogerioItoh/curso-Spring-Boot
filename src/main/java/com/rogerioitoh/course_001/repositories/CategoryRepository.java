package com.rogerioitoh.course_001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerioitoh.course_001.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}
