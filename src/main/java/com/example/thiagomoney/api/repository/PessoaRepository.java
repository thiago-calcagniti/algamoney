package com.example.thiagomoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thiagomoney.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	public default Pessoa find(Long codigo) {
		return this.findById(codigo).orElse(null);
	}
}
