package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Supervisor;

public interface SupervisorRepository extends JpaRepository<Supervisor, Long> {

}