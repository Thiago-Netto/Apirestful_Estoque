package com.sistemaestoque.api.entities;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity //Esta anotação indica que a classe Email é uma entidade JPA, ou seja, ela está mapeada para uma tabela em um banco de dados relacional.
public class Estoque {
	@Id //Este trecho de código indica que o campo marcado com @Id será a chave primária da entidade e seu valor será gerado automaticamente pelo banco de dados... 
	@GeneratedValue(strategy=GenerationType.IDENTITY) ////...usando uma estratégia de identidade, como uma coluna autoincrementável.
	private Long id;
	private String nome;
	private String email;
	private String senha;
	
	//Aqui é definido o relacionamento de produto com estoque. Cada estoque poderá ter uma lista de produtos e cada produto poderá pertencer a apenas um estoque.
	@OneToMany(mappedBy="estoque") //Este trecho de código está definindo que uma entidade de Estoque pode estar associada a vários produtos, e essa associação é mapeada pela propriedade "estoque" na entidade Produto.
	private List<Produto> produto;

	//Método Construtor
	public Estoque() {
		
    }

	public Estoque(Long id, String nome, String email, String senha, List<Produto> produto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.produto = produto;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

}
