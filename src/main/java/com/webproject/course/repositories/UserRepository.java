package com.webproject.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webproject.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
