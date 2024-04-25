package com.sistemaestoque.api.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaestoque.api.entities.Estoque;
import com.sistemaestoque.api.services.EstoqueService;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

	@Autowired
	private EstoqueService service;
	
	@GetMapping
	public ResponseEntity<List<Estoque>> buscarTodos(){
		List<Estoque> listaEstoque = service.buscarTodos();
		return ResponseEntity.status(HttpStatus.OK).body(listaEstoque);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Estoque>> buscarEstoque(@PathVariable Long id) {
	    Optional<Estoque> response = service.buscarEstoque(id);
	    return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@PostMapping
	public ResponseEntity<String> criarEstoque(@RequestBody Estoque estoque){
		String response = service.criarEstoque(estoque);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	
	@PutMapping("/{id}")
	ResponseEntity<String> editarEstoque(@PathVariable Long id, @RequestBody Estoque estoque){
	String response = service.editarEstoque(id, estoque);
	return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> excluirEstoque(@PathVariable Long id){
		String response = service.excluirEstoque(id);
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
}