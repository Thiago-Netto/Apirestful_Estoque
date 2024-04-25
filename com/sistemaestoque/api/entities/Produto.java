package com.sistemaestoque.api.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity //Esta anotação indica que a classe Email é uma entidade JPA, ou seja, ela está mapeada para uma tabela em um banco de dados relacional.
public class Produto {
	
	@Id //Este trecho de código indica que o campo marcado com @Id será a chave primária da entidade e seu valor será gerado automaticamente pelo banco de dados... 
	@GeneratedValue(strategy=GenerationType.IDENTITY) //...usando uma estratégia de identidade, como uma coluna autoincrementável.
	private Long id;
	private String nome;
	private String email;
	
	//Aqui é definido o relacionamento de produto com estoque. Cada estoque poderá ter uma lista de produtos e cada produto poderá pertencer a apenas um estoque.
	@ManyToOne
	@JoinColumn(name="estoque_id", nullable=false) // este trecho de código indica que a entidade Produto está associada à entidade Estoque através de uma chave estrangeira na tabela do banco...
	@JsonBackReference //... de dados, e também indica ao serializador JSON para ignorar essa referência ao serializar objetos Produto.
	private Estoque estoque;

	//Método Construtor
	public Produto() {
		
    }

	public Produto(Long id, String nome, String email, Estoque estoque) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.estoque = estoque;
	}

	//Getters and Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

}
