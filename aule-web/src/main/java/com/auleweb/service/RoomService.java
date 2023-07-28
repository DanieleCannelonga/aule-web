package com.auleweb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.auleweb.model.Room;

@Service
public interface RoomService {
	
	public List<Room> getAllRooms();
	
	Room saveOrUpdate(Room room);

	Optional<Room> getRoomById(Long idRoom);

	void deleteRoom(Long idRoom);

}