package com.example.thiagomoney.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.thiagomoney.api.model.Lancamento;
import com.example.thiagomoney.api.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> , LancamentoRepositoryQuery {

	public default Lancamento find(Long codigo) {
		return this.findById(codigo).orElse(null);
	}
}
