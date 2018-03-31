package com.kanris.toh;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface HeroRepository extends CrudRepository<Hero, Integer> {
	
}
