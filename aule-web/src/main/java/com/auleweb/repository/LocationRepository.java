package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}