package com.sistemaestoque.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaestoque.api.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
}
