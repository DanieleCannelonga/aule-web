package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}