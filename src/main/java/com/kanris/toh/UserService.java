package com.kanris.toh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		userRepository.save(user);
	}

	public User getUser(User user) {
		return userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword()); 
	}
}
