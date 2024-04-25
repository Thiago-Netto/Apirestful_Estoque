![Logo GuitarStore](https://i.ibb.co/Mhdwxv7/guitarstore-Logo-removebg-preview.png)

# 🎼 Sistema de estoque - Backend

Neste projeto, abordaremos a criação do backend para um sistema de gestão de estoque, utilizando tecnologias modernas e boas práticas de desenvolvimento.

O objetivo principal deste projeto é oferecer uma solução eficiente e segura para a gestão de estoque da GuitarStore, integrando diversas tecnologias como Spring Boot, Spring Data JPA, Spring Security e MySQL. Através da aplicação de conceitos de orientação a objetos e arquitetura MVC, buscamos desenvolver um sistema robusto e escalável.


## 🎸 Equipe

O projeto foi desenvolvido pelos seguintes alunos do SENAI:
- Alberto Rezende 
- Amanda Porto
- Fernando Arruda
- Thiago Netto

## 🥁 Funcionalidades

- Gerenciamento de produtos: adição, remoção, atualização e listagem de produtos disponíveis na loja.
- Controle de estoque: monitoramento da disponibilidade de produtos no estoque.
- Sistema de email e segurança.



## 🎻 Tecnologias Utilizadas

- Spring Boot: é um framework utilizado para o gerenciamento de produtos e estoque da loja e para o desenvolvimento da aplicação backend.
- Insomnia e Postman: é um framework para desenvolvimento/teste de API Clients
- MySQL: Banco de dados relacional utilizado para armazenar os dados da aplicação.
- Swagger: Ferramenta utilizada para documentar a API RESTful da aplicação.

## 🪗 Estrutura do Projeto

- **Modelo Lógico do Banco**: Um esquema do banco de dados utilizado pela aplicação, detalhando as tabelas, relacionamentos e chaves.
![Modelo logico](https://i.ibb.co/SRSpxsq/image-removebg-preview-23.png)

- **Modelo Conceitual do Banco**: Apresenta o modelo conceitual do banco de dados, mostrando as entidades e seus atributos, sem se preocupar com a implementação física no banco de dados.
![Modelo conceitual](https://i.ibb.co/ZG7kGZ0/image-removebg-preview-22.png)

- **Diagrama de Classe**: Representação visual das classes e suas relações no sistema, fornecendo uma visão geral da estrutura do código.
![Diagrama de classe](https://i.ibb.co/M9ZrNYH/image-removebg-preview-24.png)


- **Documentação Swagger**: Documentação interativa do aplicativo gerada com Swagger, permitindo visualizar e testar os endpoints da API.

- **Projeto Spring Boot**: O código-fonte do aplicativo backend, desenvolvido utilizando o framework Spring Boot.



## Como Executar

1. Clone este repositório em sua máquina local.
2. Configure o banco de dados MySQL de acordo com as configurações definidas no arquivo `sistema_estoque.sql`.
3. Execute a aplicação Spring Boot.

```bash
cd SpringApplication.run(ApiApplication.class, args)
