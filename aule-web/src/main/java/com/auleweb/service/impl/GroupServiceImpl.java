package com.auleweb.service.impl;

import java.util.List;
import java.util.Optional;

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
	public Optional<Group> getGroupById(Long id) {
        return groupRepository.findById(id);
	}

	@Override
	public Group saveOrUpdate(Group group) {
        return groupRepository.save(group);
	}

	@Override
	public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
	}
}