<h1 align="center">
  Encurtador de URL
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Linkedin&message=devlucasgusmao&color=1921E1&labelColor=000000" alt="devlucasgusmao" />
</p>

Api que realiza o encurtamento de URLs (CRUD).

## Tecnologias Utilizadas

- [Java](https://docs.oracle.com/en/java/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/apiurl-0.0.1-SNAPSHOT.jar
```

Acessando a API utilizando o Local Host: [localhost:8080](http://localhost:8080)

## Endpoints da API

As requisições HTTP foram feitas através do [Insomnia](https://insomnia.rest/), mas você pode usar uma ferramente de sua preferência.

- Realizar encurtamento
```
[POST] http://localhost:8080/api

  {
    "originalUrl": "https://www.example.com"
  }
  
RETORNO ESPERADO:

  {
    "id": 1,
    "originalUrl": "https://www.example.com",
    "shortUrl": "2tcJPQ"
  }

```

- Listar Tarefas
```
[GET] http://localhost:8080/todos/SpQ9X

  {
    "originalUrl": "https://www.example.com"
  }
```
