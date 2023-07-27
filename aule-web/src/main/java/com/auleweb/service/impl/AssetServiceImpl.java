package com.auleweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auleweb.model.Asset;
import com.auleweb.repository.AssetRepository;
import com.auleweb.service.AssetService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AssetServiceImpl implements AssetService{
	
	@Autowired
	private AssetRepository assetRepository;

	@Override
	public List<Asset> getAllAssets() {
		return (List<Asset>) assetRepository.findAll();
	}
	
	@Override
	public Asset saveOrUpdate(Asset Asset) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asset getAssetById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAsset(Long id) {
		// TODO Auto-generated method stub
		
	}
}