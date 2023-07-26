package com.auleweb.service;

import java.util.List;

import com.auleweb.model.Group;

public interface GroupService {
	
	public List<Group> getAllGroups();

	Group saveOrUpdate(Group group);

	Group getGroupById(Long idGroup);

	void deleteGroup(Long idGroup);

}