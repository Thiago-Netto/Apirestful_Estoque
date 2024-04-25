package com.sistemaestoque.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaestoque.api.entities.Estoque;
import com.sistemaestoque.api.repositories.EstoqueRepository;


@Service
public class EstoqueService {

	@Autowired
	private EstoqueRepository repository;
	
	public List<Estoque> buscarTodos() {
		return repository.findAll();
	}
	
	public Optional<Estoque> buscarEstoque (Long id) {
		return repository.findById(id);
	}
	
	public String criarEstoque (Estoque estoque) {
		repository.save(estoque);
		return "Estoque cadastrado com sucesso!";
	}
	
	public String editarEstoque (Long id, Estoque estoque) {
		Optional<Estoque> optionalEstoque = repository.findById(id);
		
		if (optionalEstoque.isEmpty()) {
			return "Estoque não encontrado.";
		}
		
		Estoque estoqueExistente = optionalEstoque.get();
		estoqueExistente.setNome(estoque.getNome());
		estoqueExistente.setEmail(estoque.getEmail());
		estoqueExistente.setSenha(estoque.getSenha());
		
		repository.save(estoqueExistente);
		return "Informações do estoque editadas com sucesso!";
	}
	
	public String excluirEstoque (Long id) {
		Optional<Estoque> optionalEstoque = repository.findById(id);
		
		if(optionalEstoque.isEmpty()) {
			return "Estoque não encontrado";
		}
		
		repository.delete(optionalEstoque.get());
		return "Estoque excluído com sucesso!";
	}
}
