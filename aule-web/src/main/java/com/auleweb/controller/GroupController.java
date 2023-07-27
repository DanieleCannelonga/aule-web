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

import com.auleweb.model.Group;
import com.auleweb.service.GroupService;

@RestController
@RequestMapping("/groups")
public class GroupController {
	
	@Autowired
	private GroupService groupService;
	
	@GetMapping
	public ResponseEntity<List<Group>> getAllGroups(){
		return ResponseEntity.ok(groupService.getAllGroups());
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Optional<Group>> groupById(@PathVariable Long id) {
        return ResponseEntity.ok(groupService.getGroupById(id));
    }
	
	@PostMapping
    public ResponseEntity<Group> createGroup(@RequestBody Group group) {
        Group createdGroup = groupService.saveOrUpdate(group);
        return ResponseEntity.ok(createdGroup);
    }

	@PutMapping("/{id}")
    public ResponseEntity<Group> updateGroup(@PathVariable Long id, @RequestBody Group group) {
        group.setId(id);
        Group updatedGroup = groupService.saveOrUpdate(group);
        return ResponseEntity.ok(updatedGroup);
    }
	
	@DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGroupById(@PathVariable Long id) {
        groupService.deleteGroup(id);
        return ResponseEntity.noContent().build();
    }
}
