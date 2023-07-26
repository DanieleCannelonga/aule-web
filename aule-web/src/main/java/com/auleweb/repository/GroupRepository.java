package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {

}