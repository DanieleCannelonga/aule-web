package com.auleweb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auleweb.model.Group;
import com.auleweb.repository.GroupRepository;
import com.auleweb.service.GroupService;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupRepository groupRepository;
	
	@Override
	public List<Group> getAllGroups() {
		return (List<Group>) groupRepository.findAll();
	}

	@Override
	public Group saveOrUpdate(Group group) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Group getGroupById(Long idGroup) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteGroup(Long idGroup) {
		// TODO Auto-generated method stub
		
	}
}