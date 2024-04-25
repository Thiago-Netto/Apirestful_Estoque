package com.sistemaestoque.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sistemaestoque.api.entities.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {

}//Esta é a definição da interface EmailRepository. Ela estende a interface JpaRepository, fornecendo operações CRUD básicas para a entidade Produto.
//CRUD (Create, Read, Update, Delete).