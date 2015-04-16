package com.yuriyb.petproject01.dao;

import java.util.List;

import com.yuriyb.petproject01.domain.User;

public interface UserDAO {
	public void addUser(User user);
	public List getUsers();
	public void removeUser(Integer id);
}