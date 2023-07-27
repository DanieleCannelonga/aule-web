package com.auleweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auleweb.model.Asset;
import com.auleweb.service.AssetService;

@RestController
@RequestMapping("/assets")
public class AssetController {
	
	@Autowired
	private AssetService assetService;
	
	@GetMapping
	public ResponseEntity<List<Asset>> getAllAssets(){
		return ResponseEntity.ok(assetService.getAllAssets());
	}
}
