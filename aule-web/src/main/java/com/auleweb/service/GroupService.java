package com.auleweb.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.auleweb.model.Group;

@Service
public interface GroupService {
	
	public List<Group> getAllGroups();

	Group saveOrUpdate(Group group);

	Group getGroupById(Long idGroup);

	void deleteGroup(Long idGroup);

}