# Projeto Web Services com Spring Boot e JPA/Hibernate

Este projeto foi desenvolvido durante o curso **Java COMPLETO** da Devsuperior com o Dr. Nelio Alves. A aplicação é um serviço RESTful em Java 17 utilizando Spring Boot, com persistência de dados por JPA/Hibernate e suporte a diferentes perfis de configuração para testes (H2) e desenvolvimento (PostgreSQL).

## Principais Objetivos

- **Projeto Spring Boot:** Utilizando Maven e empacotamento JAR.
- **Modelo de Domínio:** Implementação de entidades como User, Order, Category, Product, OrderItem e Payment.
- **Estrutura de Camadas:** Separação em Resource, Service e Repository.
- **Banco de Dados:**
  - **H2:** Para testes, com console disponível.
  - **PostgreSQL:** Configurado para desenvolvimento e produção (através dos perfis dev e prod).
- **CRUD e Exceções:** Operações básicas de Create, Update e Delete com tratamento adequado de exceções.

## Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Data JPA / Hibernate
- H2 Database
- PostgreSQL
- Maven

## Estrutura do Projeto

```plaintext
src/
 ├── main/
 │    ├── java/
 │    │    └── com.webproject.course/  
 │    │         ├── resources/       # Controllers (endpoints)
 │    │         ├── services/        # Lógica de negócio
 │    │         ├── repositories/    # Acesso a dados
 │    │         └── domain/          # Entidades e mapeamentos JPA
 │    └── resources/
 │         ├── application.properties        # Perfil ativo
 │         ├── application-test.properties   # Configuração H2
 │         ├── application-dev.properties    # Configuração PostgreSQL (dev)
 │         └── application-prod.properties   # Configuração PostgreSQL (prod)
 └── test/ 
      └── java/
```
## Configuração do Ambiente

- **H2 (Teste):**  
  Configurado para rodar em memória com console acessível em `/h2-console`.

- **PostgreSQL (Dev/Prod):**  
  Foram criados os perfis **dev** e **prod** com as respectivas configurações para conexão com o PostgreSQL.  
  *Nota:* O deploy no Heroku é opcional e, neste projeto, apenas os perfis foram configurados.

## Endpoints e Funcionalidades

A aplicação oferece endpoints REST para:

- **Usuários:**  
  Criação, atualização, consulta e remoção de usuários.  
  Exemplo de payload para criação:
  
  ```json
  {
    "name": "Bob Brown",
    "email": "bob@gmail.com",
    "phone": "977557755",
    "password": "123456"
  }

- **Pedidos e Itens**:
  Associação de pedidos aos usuários e produtos, com relacionamento entre as entidades e cálculo de subtotais.
- **Outras Entidades**:
  Gestão de categorias, produtos, pagamentos e associações entre eles.
 
 OBS: O projeto possui um .postman_collection.json com alguns testes de requisições.

## Tratamento de Exceções

A aplicação conta com classes específicas para tratamento de erros, garantindo respostas padronizadas em casos de:
- Recursos não encontrados (ResourceNotFoundException);
- Violações de integridade de dados (DatabaseException).
