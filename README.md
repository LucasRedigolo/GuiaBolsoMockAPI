
# Guia Bolso Mock


O seguinte projeto foi desenvolvido com o intuito de, através de uma chamada GET montar uma lista de transações seguindo o contrato abaixo:
  ```
[GET] /<id>/transacoes/<ano>/<mes>

Content-type: application/json

[
  {
     "descricao": "string(10, 60)"
     "data": "long(timestamp)"
     "valor": "integer(-9.999.999, 9.999.999)"
  }  
]
```

O projeto foi desenvolvido em Java 11 e Spring Boot, usando o mínimo de biblioteca que eu consegui.

Para executar o projeto basta executar o comando abaixo no terminal, e fazer chamadas conforme o contrato no Postman:

    gradlew bootRun

