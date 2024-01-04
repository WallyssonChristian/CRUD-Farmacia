package com.generation.crudfarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.crudfarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	boolean existsByDescricaoIgnoreCase(String descricao);
}