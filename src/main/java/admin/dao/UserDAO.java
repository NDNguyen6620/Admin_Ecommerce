package admin.dao;

import admin.entities.User;

public interface UserDAO {
	public User findByUserName(String username);
}
