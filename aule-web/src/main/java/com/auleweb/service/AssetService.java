package com.auleweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.auleweb.model.Asset;

@Service
public interface AssetService {
		
	public List<Asset> getAllAssets();

	Asset saveOrUpdate(Asset asset);

	Asset getAssetById(Long id);

	void deleteAsset(Long id);

}