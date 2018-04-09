package com.kanris.toh;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

		@Override
		public void configure(HttpSecurity security) throws Exception {
			// TODO Auto-generated method stub
			http.authorizeRequests()
			.antMatchers("/").permitAll()
			.antMatchers("/private/**").authenticated();
		}

	}
