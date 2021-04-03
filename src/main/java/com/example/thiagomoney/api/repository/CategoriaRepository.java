package com.example.thiagomoney.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thiagomoney.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria , Long> {

	public default Categoria find(Long codigo) {
		return this.findById(codigo).orElse(null);
	}


}
