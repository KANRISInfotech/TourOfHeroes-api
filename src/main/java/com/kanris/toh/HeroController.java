package com.kanris.toh;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {
	@Autowired
	private HeroService HeroService;
	
	@RequestMapping("/populateheroes")
	public void populateheroes() {
		HeroService.populateHeroes();
	}
	
	@RequestMapping("/heroes")
	public List<Hero> getAllTopics() {
		return HeroService.getAllheroes();
	}
	
	@RequestMapping("hero/{id}")
	public Hero getHero(@PathVariable("id") int id) {
		return HeroService.getHero(id);
	}
	
	@RequestMapping("heroupdate/{id}/{name}")
	public boolean updateHero(@PathVariable("id") int id ,@PathVariable("name") String name) {
		return true;
	}

}