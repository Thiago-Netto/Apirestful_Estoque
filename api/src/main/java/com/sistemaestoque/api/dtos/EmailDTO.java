package com.sistemaestoque.api.dtos;

//Esta classe serve como um modelo de dados simples para representar os detalhes de um e-mail. 
//Os objetos EmailDTO foram utilizados para encapsular os dados de um e-mail e transferi-los entre diferentes partes do sistema como, por exemplo, nas requisições HTTP.

public class EmailDTO {
	
	private String emailFrom;
	private String emailTo;
	private String tituloEmail;
	private String corpoEmail;
	
	public EmailDTO(String emailFrom, String emailTo, String tituloEmail, String corpoEmail) {
		
		super();
		this.emailFrom = emailFrom;
		this.emailTo = emailTo;
		this.tituloEmail = tituloEmail;
		this.corpoEmail = corpoEmail;
		
	}

	public String getEmailFrom() {
		return emailFrom;
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

	public void setEmailFrom(String emailFrom) {
		this.emailFrom = emailFrom;
	}
	
	
}
