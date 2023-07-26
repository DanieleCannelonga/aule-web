package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Location;

public interface LocationService {
	
	public List<Location> getAllLocations();

	Location saveOrUpdate(Location location);

	Location getLocationById(Long idLocation);

	void deleteLocation(Long idLocation);

}
