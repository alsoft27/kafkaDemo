# KafkaDemo

Proyecto demo sobre uso de kafka en una aplicación SpringBoot

![N|Solid](https://spring.io/img/homepage/icon-spring-boot.svg)

## SpringBoot 2.0 && KaaS (https://www.cloudkarafka.com/)

En este ejemplo tenemos una aplicación SpringBoot con un Consumer y un Producer sobre topic Kafka en CloudKarafka.

### Requerimientos

- Registro en CloudKarafka
- Maven
- Java 8
- Docker (Si quieres ejecutarlo en un Docker)

### Properties

En el aplication.yml debemos indicar los brokers, el topic, username y password

```sh
kafka:
  brokers:
    url: XXX   
  cloudkarafka:
    topic: XXX
    username:  XXX
    password:  XXX
```

### Ejecutar:

En Docker(si lo quieres ejecutar en Docker):
```sh
$ mvn install dockerfile:build 
$ docker run -p 8080:8080 -t springio/kafkademo
```
En Maven: 
```sh
$ mvn clean install 
$ java -jar ./target/kafkademo-0.0.1-SNAPSHOT.jar
```

### Producer

Para producir un mensaje, en un navegador usando la url
```sh
http://localhost:8080/kafka/producer?data=Mensaje
```
El puerto por defecto es el 8080 si es diferente, cambiarlo, el mensaje a enviar sera el string que tenga la variable data

### Consumer

En otro navegador por medio de la siguiente url veremos todos los mensajes que se envien al topic.
```sh
http://localhost:8080/kafka/consumer
```
