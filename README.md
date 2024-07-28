# Web API - Lab Springboot

## 📋Descrição
O projeto é uma API de cadastro de clientes que utiliza a API do ViaCep para recuperar as informações de enderço a partir do CEP do cliente. Os endereços novos são registrados na base de Endereços, de forma que endereços repetidos não são duplicados na base, e o cadastro de clientes faz referência a base de endereços.

### 📝Funcionalidades Adicionadas:
Foram adicionados os seguintes campos no cadastro dos clientes:
- CPF;
- Celular;
- Altura;
- Peso.

## 💻Desafios Técnicos
O Swagger/OpenAPI utilizado no exemplo é antigo. Como estou usando Java 22 Com SpringBoot 3.3.1, precisei adicionar a dependência da OpenAPI 3.0 manualmente no <i>POM.xml</i> .

``` 
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.5.0</version>
</dependency>
``` 
Para mais informações sobre a OpenAPI 3.0 clique [Aqui](https://www.baeldung.com/spring-rest-openapi-documentation)

### Dependencias utilizadas no Spring Initializr
- Spring Web;
- Spring Data JPA;
- H2 Database;
- Open Feign.

