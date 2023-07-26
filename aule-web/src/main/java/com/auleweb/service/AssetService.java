package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Asset;

public interface AssetService {
		
	public List<Asset> getAllAssets();

	Asset saveOrUpdate(Asset asset);

	Asset getAssetById(Long id);

	void deleteAsset(Long id);

}