package com.sistemaestoque.api.controllers;

import java.util.List;

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

import com.sistemaestoque.api.entities.Produto;
import com.sistemaestoque.api.services.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
//Essa classe é um controlador RESTful em Java, construído com o framework Spring MVC, que lida com requisições HTTP relacionadas à entidade Produto em um sistema de estoque.
	
    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> buscarTodos() {
        List<Produto> listaProduto = service.buscarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(listaProduto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarProdutoPorId(@PathVariable Long id) {
        Produto response = service.buscarProduto(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping
    public ResponseEntity<String> criarProduto(@RequestBody Produto produto) {
        String response = service.criarProduto(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> editarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        String response = service.editarProduto(id, produto);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> excluirProduto(@PathVariable Long id) {
        String response = service.excluirProduto(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}
