package com.example.thiagomoney.api.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.example.thiagomoney.api.model.Pessoa;
import com.example.thiagomoney.api.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public Pessoa atualizar(Long codigo , Pessoa pessoa) {
		Pessoa pessoaRegistrada = buscarPessoaPeloCodigo(codigo);
		BeanUtils.copyProperties(pessoa, pessoaRegistrada, "codigo");
		return pessoaRepository.save(pessoaRegistrada);
	}



	public void atualizarAtivo(Long codigo, Boolean ativo) {
		Pessoa pessoaRegistrada = buscarPessoaPeloCodigo(codigo);
		pessoaRegistrada.setAtivo(ativo);
		pessoaRepository.save(pessoaRegistrada);
		
	}
	
	public Pessoa buscarPessoaPeloCodigo(Long codigo) {
	Pessoa pessoaRegistrada = pessoaRepository.find(codigo);
	if (pessoaRegistrada == null) {
		throw new EmptyResultDataAccessException(1);
		}
 	return pessoaRegistrada;
	}
}
