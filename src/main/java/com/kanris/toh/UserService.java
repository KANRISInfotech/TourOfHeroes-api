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

	@SuppressWarnings("null")
	public User getUser(User user) {
		//return userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword()); 
		User Oject_name =userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(Oject_name==null) {
			User objt=new User();
			objt.setUserName("login_failed");
			return objt;
		}else {
			return Oject_name;
		}

	}

	public User updateUser(User user) {
		return userRepository.save(user); 
	}
}
