package com.auleweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auleweb.model.Group;
import com.auleweb.service.GroupService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/groups")
public class GroupController {
	
	@Autowired
	private GroupService groupService;
	
//	@GetMapping(produces = "application/json")
//    public String getAllGroups() throws JsonProcessingException {
//        List<Group> groups = groupService.getAllGroups();
//        ObjectMapper objectMapper = new ObjectMapper();
//        String groupsJson = objectMapper.writeValueAsString(groups);
//        return groupsJson;
//	}
	
	@GetMapping
	public ResponseEntity<List<Group>> getAllGroups(){
		return ResponseEntity.ok(groupService.getAllGroups());
	}
}
