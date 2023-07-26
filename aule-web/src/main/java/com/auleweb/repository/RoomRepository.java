package com.auleweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auleweb.model.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {

}