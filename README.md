# Sistema de Pedidos-Server
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/GustavoSC1/dsdeliver/blob/main/LICENSE) 

Esse é o back-end do [Sistema de Pedidos App](https://github.com/GustavoSC1/curso-spring-ionic-frontend).

É uma API RESTful construída com Java + Spring + MySQL que recebe todos os dados relativos aos usuários, categorias, produtos e pedidos e grava/disponibiliza ao cliente todos esses dados através de uma API REST. 

Essa API utiliza JPA com Hibernate para mapeamento objeto-relacional, envio de email com SMTP da Google, armazenamento de imagens com storage S3 da Amazon, autenticação e autorização com tokens JWT.

## Modelo conceitual
![Modelo Conceitual](https://ik.imagekit.io/gustavosc/Sistema_de_Pedidos/Modelo_conceitual_9DCgqTOAM.PNG)

# Tecnologias utilizadas
## Back end
- [Spring Framework](https://spring.io/projects/spring-framework)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Spring Security](https://spring.io/projects/spring-security)
- [MySQL](https://www.mysql.com/)
- [Amazon S3](https://aws.amazon.com/pt/s3/)
- [JWT](https://jwt.io/)

# Como executar o projeto

## Back end
Pré-requisitos: Java 8

Você também pode usar o deploy dessa API no [Heroku](https://java-spring-ionic-curso.herokuapp.com).

Para executar este projeto, você precisará mudar o ambiente do projeto para modo de teste. Para fazer isso vá para o arquivo /src/main/resources/application.properties e edite o valor de spring.profiles.active.

Deve ser assim:

spring.profiles.active=test

```bash
# clonar repositório
git clone https://github.com/GustavoSC1/cursomc

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Gustavo da Silva Cruz

https://www.linkedin.com/in/gustavo-silva-cruz-20b128bb/
