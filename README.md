# kafka-schema-registry
Exemplo de implementação do mecanismo do schema registry


1- Navergar até a pasta do arquivo docker-compose.yml
2- Rodar comando docker-compose up -d
3- Validar se foi tudo criado e está UP com o comando docker-compose ps
4- Abrir o projeto formulario-producer
5- Se alterar o schema disponível no caminho formulario-producer/src/main/resources/avro-schema.avsc
5.1- Rodar o comando mvn compile para gerar as classes Avro
6- Copiar a classes geradas para o projeto cadastro-consumer/src/java
7- Subir as duas aplicações
8- O Arquivo kafka-schema-registry.postman_collection.json contém os exemplos das chamada
