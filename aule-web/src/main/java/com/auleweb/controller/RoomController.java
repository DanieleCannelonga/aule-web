package com.auleweb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auleweb.model.Room;
import com.auleweb.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@GetMapping
	public ResponseEntity<List<Room>> getAllRooms(){
		return ResponseEntity.ok(roomService.getAllRooms());
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<Room>> roomById(@PathVariable Long id) {
        return ResponseEntity.ok(roomService.getRoomById(id));
    }
	
	@PostMapping
    public ResponseEntity<Room> createRoom(@RequestBody Room room) {
		Room createdRoom = roomService.saveOrUpdate(room);
        return ResponseEntity.ok(createdRoom);
    }

	@PutMapping("/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable Long id, @RequestBody Room room) {
		room.setId(id);
        Room updatedRoom = roomService.saveOrUpdate(room);
        return ResponseEntity.ok(updatedRoom);
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRoomById(@PathVariable Long id) {
		roomService.deleteRoom(id);
        return ResponseEntity.noContent().build();
    }
}
