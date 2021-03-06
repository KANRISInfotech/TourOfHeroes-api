package com.kanris.toh;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootUploadFileApplication implements CommandLineRunner  {
	@Resource
	StorageService storageService;
 
	public static void main(String[] args) {
		SpringApplication.run(SpringBootUploadFileApplication.class, args);
	}
 
	@Override
	public void run(String... arg) throws Exception {
		storageService.deleteAll();
		storageService.init();
	}


}
