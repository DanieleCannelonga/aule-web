package com.auleweb.service;

import java.util.List;

import com.auleweb.model.User;

public interface UserService {
	
	public List<User> getAllUsers();

	User saveOrUpdate(User user);

	User getUserById(Long idUser);

	void deleteUser(Long idUser);

}