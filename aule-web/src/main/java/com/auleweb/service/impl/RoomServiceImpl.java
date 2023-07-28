package com.auleweb.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auleweb.model.Group;
import com.auleweb.model.Room;
import com.auleweb.repository.RoomRepository;
import com.auleweb.service.RoomService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RoomServiceImpl implements RoomService{

	@Autowired
	private RoomRepository roomRepository;
	
	@Override
	public List<Room> getAllRooms() {
		return (List<Room>) roomRepository.findAll();
	}
	
	@Override
	public Optional<Room> getRoomById(Long id) {
		return roomRepository.findById(id);
	}

	@Override
	public Room saveOrUpdate(Room room) {
		System.out.println("Contenuto della stanza: " + room);
		return roomRepository.save(room);
	}

	@Override
	public void deleteRoom(Long id) {
		roomRepository.deleteById(id);	
	}
}