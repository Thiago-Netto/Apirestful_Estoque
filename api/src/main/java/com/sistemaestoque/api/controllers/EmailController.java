package com.sistemaestoque.api.controllers;
//Este código representa um controlador RESTful em Java, utilizando o framework Spring MVC, que lida com requisições HTTP relacionadas ao envio de e-mails em um sistema de estoque.

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaestoque.api.dtos.EmailDTO;
import com.sistemaestoque.api.entities.Email;
import com.sistemaestoque.api.services.EmailService;

//A classe possui importações de classes do Spring e outras bibliotecas necessárias para seu funcionamento. 
//Além disso, possui anotações como @RestController e @RequestMapping para configurar o comportamento do controlador.
@RestController 
@RequestMapping("/email")
public class EmailController {

	//Injeção de Dependência: A classe faz uso da anotação @Autowired para injetar uma instância de EmailService, provavelmente para delegar a lógica de negócios relacionada ao envio de e-mails.
	@Autowired
	private EmailService service;
	
	//O método @PostMapping é responsável por receber uma requisição HTTP POST contendo os dados necessários para enviar um e-mail.
	@PostMapping
	public ResponseEntity<Email> enviarEmail(@RequestBody EmailDTO dto) {
		Email email = new Email();
		BeanUtils.copyProperties(dto, email);
		service.enviarEmail(email);
		return ResponseEntity.status(HttpStatus.CREATED).body(email);
		
	}
}
