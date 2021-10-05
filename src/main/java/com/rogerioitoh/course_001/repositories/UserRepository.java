package com.rogerioitoh.course_001.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rogerioitoh.course_001.entities.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
