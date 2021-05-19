package com.sophs.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sophs.cursomc.domain.Categoria;

@Repository
public interface CategotriaRepository extends JpaRepository<Categoria, Integer> {

}
