package com.sistemaestoque.api.entities;

import java.time.LocalDateTime;

import com.sistemaestoque.api.enums.StatusEmail;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //Esta anotação indica que a classe Email é uma entidade JPA, ou seja, ela está mapeada para uma tabela em um banco de dados relacional.
public class Email { 
//A classe Email é um mapeamento direto de dados de e-mail para uma tabela de banco de dados, com campos como remetente, destinatário, título, corpo e data de envio, além de um campo para... 
//...o status do e-mail.

	
	@Id //Esta anotação marca o campo emailId como a chave primária (primary key) da entidade.
	@GeneratedValue(strategy=GenerationType.AUTO) // Esta anotação especifica a estratégia de geração de valores para a chave primária. 
	//Com a estratégia GenerationType.AUTO, o provedor de persistência (como o Hibernate) escolherá automaticamente a melhor estratégia de geração de chaves primárias com base no banco de dados utilizado. 
	//Pode ser uma estratégia de autoincremento, sequência, etc.
	
	private Long emailId; //Este é o campo que representa a chave primária da entidade.
	private String emailFrom; //Este é o campo que representa a chave primária da entidade.
	private String emailTo; //Este campo armazena o endereço de e-mail do destinatário.
	private String tituloEmail; //Este campo armazena o título (ou assunto) do e-mail.
	@Column(columnDefinition="TEXT") //Esta anotação especifica que o campo corpoEmail será mapeado para uma coluna de texto no banco de dados. Isso é útil quando se precisa armazenar grandes blocos de texto, como o corpo de e-mails.
	private String corpoEmail; //Este campo armazena o corpo do e-mail.
	private LocalDateTime sendDateEmail; //Este campo armazena a data e hora em que o e-mail foi enviado.
	private StatusEmail statusEmail; //Este campo representa o status do e-mail, ele utiliza o enum StatusEmail
	
	//Método construtor sem argumentos.
	public Email() {
		//Este é o primeiro construtor, um construtor padrão sem argumentos. Ele não recebe nenhum parâmetro e não realiza nenhuma operação específica além de inicializar o objeto.

    }
	
	//Método construtor com argumentos.
	public Email(Long emailId, String emailFrom, String emailTo, String tituloEmail, String corpoEmail,
			LocalDateTime sendDateEmail, StatusEmail statusEmail) { //Este é o segundo construtor, um construtor que recebe vários parâmetros para inicializar os campos da classe Email.
		super();
		this.emailId = emailId; //O ID do e-mail
		this.emailFrom = emailFrom; //O endereço de e-mail do remetente.
		this.emailTo = emailTo; //O endereço de e-mail do destinatário.
		this.tituloEmail = tituloEmail; //O título (ou assunto) do e-mail.
		this.corpoEmail = corpoEmail; //O corpo do e-mail.
		this.sendDateEmail = sendDateEmail; //A data e hora de envio do e-mail.
		this.statusEmail = statusEmail; //O status do e-mail (enviado ou erro).
	} //No construtor, os valores passados como parâmetros são atribuídos aos campos correspondentes da classe Email usando o operador this. Este construtor é útil para criar objetos Email com valores específicos para cada campo.
	
	//Getters and Setters
	public Long getEmailId() {
		return emailId;
	}

	public void setEmailId(Long emailId) {
		this.emailId = emailId;
	}

	public String getEmailFrom() {
		return emailFrom;
	}

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}

	public String getEmailTo() {
		return emailTo;
	}

	public void setEmailTo(String emailTo) {
		this.emailTo = emailTo;
	}

	public String getTituloEmail() {
		return tituloEmail;
	}

	public void setTituloEmail(String tituloEmail) {
		this.tituloEmail = tituloEmail;
	}

	public String getCorpoEmail() {
		return corpoEmail;
	}

	public void setCorpoEmail(String corpoEmail) {
		this.corpoEmail = corpoEmail;
	}

	public LocalDateTime getSendDateEmail() {
		return sendDateEmail;
	}

	public void setSendDateEmail(LocalDateTime sendDateEmail) {
		this.sendDateEmail = sendDateEmail;
	}

	public StatusEmail getStatusEmail() {
		return statusEmail;
	}

	public void setStatusEmail(StatusEmail statusEmail) {
		this.statusEmail = statusEmail;
	}	
}
