# desafioSync360




Repositório do **Desafio Sync360** — um sistema web desenvolvido com **Spring Boot**, **Thymeleaf** e **H2 Database**, focado em cadastro, atualização e exibição de usuários com suporte

## Para rodar a aplicação basta iniciar o DesafioAplication e acessar o localhost:8080


## 🚀 Sobre o projeto

O objetivo deste projeto é implementar um CRUD completo para usuários, com os seguintes recursos principais:
- Cadastro de usuário com campos de nome, idade, endereço, biografia.
- Exibição das informações do usuário em página web estilizada com **Thymeleaf**.
- Banco de dados **H2** embarcado para desenvolvimento e testes.

## ⚙️ Tecnologias e dependências utilizadas para o desenvolvimento da aplicação

- **Java 17+**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **H2 Database**
- **Thymeleaf**
- **Maven**

 



## 🗂️ Estrutura de pastas

```plaintext
desafioSync360/
├── src/main/java/com/desafio/
│   ├── controller/         # Controladores MVC
│   ├── repository/         # Repositórios JPA
│   ├── service/            # Camada de serviço
│   ├── model/ entity/      # Entidades do banco de dados
│   └── DesafioSync360Application.java
├── src/main/resources/
│   ├── static/             # Arquivos estáticos (CSS, imagens)
│   ├── templates/          # Templates Thymeleaf
│   └── application.properties
└── pom.xml                 # Gerenciador de dependências Maven
