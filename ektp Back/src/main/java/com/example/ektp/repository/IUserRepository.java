package com.example.ektp.repository;

import java.util.List;


import com.example.ektp.model.User;

public interface IUserRepository {
    public User insertUser(User user);

    public User getUser(String email, String password);
    
    public User getEmail(String email);
    
    public List<User> getAllUser();

    public User updateUser(int id, User user);
    
    public User deleteUser(int id);

	public User getUserById(int id);
}
