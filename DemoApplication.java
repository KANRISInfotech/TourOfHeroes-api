package com.kanris.toh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoApplication.class, args);
}
	@Autowired
	public void authenticationManager(AuthenticationManagerBuilder builder,UserRepository repo) throws Exception {
		builder.UserService(new UserService() {
			
			public UserService loadUserByUserName(String s) throws UsernameNotFoundException{
				return new CustomerUserDetails (repo.findByUserNameAndPassword(s, s));
				
			}
		})
	}

}
