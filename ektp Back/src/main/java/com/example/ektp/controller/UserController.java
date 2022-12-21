package com.example.ektp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.ektp.model.User;
import com.example.ektp.service.IUserService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    IUserService userService;

    @PostMapping("/insert")
    public User insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
    
    @PostMapping("/getUser")
	public User getUser(@RequestBody User user) {
		return userService.getUser(user.getEmail(), user.getPassword());
	}
    
    @PostMapping("/getEmail")
	public User getEmail(@RequestBody String email) {
		return userService.getEmail(email);
	}

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable int id) {
		return userService.deleteUser(id);
	}

    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @GetMapping("/getUserById")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }

}