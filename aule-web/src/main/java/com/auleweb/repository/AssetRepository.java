package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

}