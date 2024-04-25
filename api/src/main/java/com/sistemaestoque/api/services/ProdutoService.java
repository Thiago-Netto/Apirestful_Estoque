package com.sistemaestoque.api.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemaestoque.api.entities.Produto;
import com.sistemaestoque.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
//As classes de serviço são as classes que vão abrigar nossos métodos CRUD.
	
	@Autowired
	private ProdutoRepository repository;
	
	public List<Produto> buscarTodos(){
		return repository.findAll();
	}
	
	public Produto buscarProduto(Long id) {
		Optional<Produto> optionalProduto = repository.findById(id);
		return optionalProduto.orElseThrow(() -> new RuntimeException());
	}
	
	public String criarProduto(Produto produto) {
		repository.save(produto);
		return "Produto cadastrado com sucesso!";
	}
	
	public String editarProduto(Long id, Produto produto) {
		Optional<Produto> optionalProduto = repository.findById(id);
		
		if(optionalProduto.isEmpty()) {
			return "Produto não encontrado";
		}
		
		Produto produtoExistente = optionalProduto.get();
		produtoExistente.setNome(produto.getNome());
		produtoExistente.setEmail(produto.getEmail());
		produtoExistente.setEstoque(produto.getEstoque());
		
		repository.save(produtoExistente);
		return "Informações do produto editadas com sucesso!";
	}
	
	public String excluirProduto (Long id) {
		Optional<Produto> optionalProduto = repository.findById(id);
		
		if(optionalProduto.isEmpty()) {
			return "Produto não encontrado";
		}
		
		repository.delete(optionalProduto.get());
		return "Produto excluído com sucesso!";
	}
	
}
