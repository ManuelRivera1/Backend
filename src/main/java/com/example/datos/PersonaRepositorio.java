package com.example.datos;

import java.util.List;

import org.springframework.data.repository.Repository;


public interface PersonaRepositorio extends Repository<Persona, Integer> {
	
	List<Persona>findAll();
	Persona findById(int id);
	Persona save(Persona p);
	void delete(Persona p);
	
}
