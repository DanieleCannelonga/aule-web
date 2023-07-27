package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Room;

public interface RoomService {
	
	public List<Room> getAllRooms();

	Room saveOrUpdate(Room room);

	Room getRoomById(Long idRoom);

	void deleteRoom(Long idRoom);

}