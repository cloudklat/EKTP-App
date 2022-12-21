package com.example.ektp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ektp.model.User;
import com.example.ektp.repository.IUserRepository;
import com.example.ektp.service.IUserService;

@Service
public class UserService implements IUserService {

    @Autowired
    IUserRepository userRepository;

    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
        return userRepository.insertUser(user);
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return userRepository.getAllUser();
    }

    @Override
    public User getEmail(String email) {
        // TODO Auto-generated method stub
        return userRepository.getEmail(email);
    }

    @Override
    public User updateUser(int id, User user) {
        // TODO Auto-generated method stub
        return userRepository.updateUser(id, user);
    }

	@Override
	public User getUser(String email, String password) {
		// TODO Auto-generated method stub
		return userRepository.getUser(email, password);
	}

	@Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
		return userRepository.deleteUser(id);
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepository.getUserById(id);
	}
}