package com.sistemaestoque.api.enums;

public enum StatusEmail {
	ENVIADO,
	ERRO
}

//Este trecho de código define um enum chamado StatusEmail, que representa os possíveis estados de um e-mail em um sistema Java.

//ENVIADO: Este é um dos valores possíveis do enum, que indica que o e-mail foi enviado com sucesso.
//ERRO: Este é outro valor possível do enum, que indica que ocorreu um erro ao tentar enviar o e-mail.

//Enums são úteis para representar conjuntos fixos de valores que são mutuamente exclusivos. 
//No caso desse enum, os únicos estados possíveis para um e-mail são "ENVIADO" e "ERRO". 
//Isso permite que o código seja mais legível e seguro, pois os estados são definidos de forma explícita e não podem ser alterados ou estendidos facilmente sem alterar o código-fonte.