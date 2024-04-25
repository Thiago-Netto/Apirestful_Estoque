package com.sistemaestoque.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaestoque.api.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
} //Esta é a definição da interface ProdutoRepository. Ela estende a interface JpaRepository, fornecendo operações CRUD básicas para a entidade Produto.
//CRUD (Create, Read, Update, Delete).
