<h1 style="text-align: center;">
  TODO List
</h1>


Welcome to TODO List, an API developed as part of [this challenge.](https://github.com/simplify-liferay/desafio-junior-backend-simplify).

With this application, you can create, view, update and delete tasks efficiently, providing an organized way to keep track of your daily activities, personal or collaborative projects.


## Technologies

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)

## Practices adopted

- SOLID, DRY, YAGNI, KISS
- REST API
- Queries with Spring Data JPA
- Dependency Injection
- Handling error responses
- Automatic Swagger generation with OpenAPI 3

## How to Run

- Clone git repository
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

The API can be accessed at [localhost:8080](http://localhost:8080).
Swagger can be viewed at [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

To make the HTTP requests below, the httpie tool was used: [httpie](https://httpie.io):

- Create Task
```
$ http POST :8080/todos nome="Todo 1" descricao="Desc Todo 1" prioridade=1

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- List Tasks
```
$ http GET :8080/todos

[
  {
    "descricao": "Desc Todo 1",
    "id": 1,
    "nome": "Todo 1",
    "prioridade": 1,
    "realizado": false
  }
]
```

- Update Task
```
$ http PUT :8080/todos/1 nome="Todo 1 Up" descricao="Desc Todo 1 Up" prioridade=2

[
  {
    "descricao": "Desc Todo 1 Up",
    "id": 1,
    "nome": "Todo 1 Up",
    "prioridade": 2,
    "realizado": false
  }
]
```

- Remove Task
```
http DELETE :8080/todos/1

[ ]
```
