package com.sistemaestoque.api.controllers;

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

@RestController
@RequestMapping("/email")
public class EmailController {

	@Autowired
	private EmailService service;
	
	@PostMapping
	public ResponseEntity<Email> enviarEmail(@RequestBody EmailDTO dto) {
		Email email = new Email();
		BeanUtils.copyProperties(dto, email);
		service.enviarEmail(email);
		return ResponseEntity.status(HttpStatus.CREATED).body(email);
		
	}
}
