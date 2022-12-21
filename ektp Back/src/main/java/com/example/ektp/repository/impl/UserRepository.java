package com.example.ektp.repository.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import com.example.ektp.model.User;
import com.example.ektp.repository.IUserRepository;

@Repository
public class UserRepository implements IUserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public User insertUser(User user) {
        // TODO Auto-generated method stub
        String query = "INSERT INTO tb_user(email, nama, password) "
                + "VALUES(?, ?, ?)";
        jdbcTemplate.update(query,
                new Object[] { user.getEmail(), user.getNama(), user.getPassword() });
        return user;
    }

    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        String query = "SELECT * FROM tb_user";
        return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(User.class));
    }
    @Override
    public User updateUser(int id, User user) {
    	// TODO Auto-generated method stub
    	String query = "UPDATE tb_user SET email = ?, nama = ?, password = ? WHERE id = ?";
    	
    	jdbcTemplate.update(query,
    			new Object[] { user.getEmail(), user.getNama(), user.getPassword(), id });
    	
    	return user;
    }
    @Override
	public User deleteUser(int id) {
		// TODO Auto-generated method stub
				String query = "SELECT * FROM tb_user WHERE id = ?";
				var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(User.class), id);

				query = "DELETE FROM tb_user WHERE id = ?";
				jdbcTemplate.update(query, id);

				return result;
			}
    

    @Override
    public User getEmail(String email) {
    	User result = new User();
		String query = "SELECT * FROM tb_user WHERE email = ?";
        try {
			result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(User.class), email);
		} catch (Exception e) {
			result = new User();
		}
		return result;
	}
    
	@Override
	public User getUser(String email, String password) {
		String query = "SELECT * FROM tb_user WHERE email = ? AND password = ?";
		return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(User.class), email, password);
	}



	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
