<h1 align="center">Kafka Schema Registry</h1>

Descrição
=================
<p align="center">Exemplo de implementação de um micro serviço produtor e um consumidor de mensagens para o kafka utilizando o Schema Registry e Spring Boot.</p>

<p align="center">
  <img alt="GitHub branch checks state" src="https://img.shields.io/github/checks-status/deyviddfs/kafka-schema-registry/main">
  <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/deyviddfs/kafka-schema-registry">
  <img alt="GitHub contributors" src="https://img.shields.io/github/contributors/deyviddfs/kafka-schema-registry">
  <img alt="Twitter URL" src="https://img.shields.io/twitter/url?style=social&url=https%3A%2F%2Ftwitter.com%2Fdeyviddfs">
</p>

Índice
=================
<!--ts-->
- [Descrição](#descrição)
- [Índice](#índice)
- [Como Usar](#como-usar)
- [Testes](#testes)
- [Status](#status)
<!--te-->


Como Usar
=================

#Pré Requesitos
* Java 14
* Docker instalado

#Subindo Aplicação
* Clonar repositório
* Navegar até a pasta do arquivo docker-compose.yml
* Rodar comando <b>docker-compose up -d</b>
* Validar se foi tudo criado e está UP com o comando <b>docker-compose ps</b>
* Abrir o projeto formulario-producer
* Se alterar o schema disponível no caminho formulario-producer/src/main/resources/avro-schema.avsc
  * Rodar o comando <b>mvn compile</b> para gerar as classes Avro
* Copiar a classes geradas para o projeto cadastro-consumer/src/java
* Subir as duas aplicações através da classe SpringApplication



Testes
=================
* 1- Fazer uma requisição POST 
    <p>
    curl --location --request POST 'http://localhost:8080/cliente/' \
    --form 'id="1"' \
    --form 'nome="Deyvid Fernandes"' \
    --form 'idade="33"'
    </p>

* Resultado esperado é produzir uma mensagem no formato json no tópico DEV.CLIENTE, uma forma de validar é exeutando o seguinte comando: 
    <p>docker exec -ti broker ../../bin/kafka-console-consumer --bootstrap-server localhost:9092 --topic DEV.CUSTOMER --from-beginning</p>

* 2 - Listar todos os tópicos com schema definido
    <P>curl --location --request GET 'http://localhost:8081/subjects' </P>

* 3 - Retornar a versão 1 do schema do tópico DEV.CUSTOMER
    <p>curl --location --request GET 'http://localhost:8081/subjects/DEV.CUSTOMER-value/versions/1'</p>

* 4 - Listar todos os schemas
    <p>curl --location --request GET 'http://localhost:8081/schemas'</p>

* 5 - O Arquivo kafka-schema-registry.postman_collection.json contém os exemplos das chamada

Status
=================
<h4 align="center"> 
	🚧  kafka - Em construção...  🚧
</h4>
