package com.kanris.toh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.POST,value="/addUser")
	public void adduser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/getUser")
	public User getUser(@RequestBody User user) {
		return userService.getUser(user);
	}
}
