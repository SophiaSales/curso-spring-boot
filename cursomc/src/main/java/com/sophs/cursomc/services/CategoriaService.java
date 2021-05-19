package com.sophs.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sophs.cursomc.domain.Categoria;
import com.sophs.cursomc.repositories.CategotriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategotriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
