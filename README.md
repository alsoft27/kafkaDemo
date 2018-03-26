# KafkaDemo

project for kafka learning


SpringBoot 2.0 && KaaS (https://www.cloudkarafka.com/)


En este ejemplo tenemos una aplicación SpringBoot con un Consumer y un Producer, que uso para producir y consumir mensajes
de un topic de Kafka en CloudKarafka.


Properties

En el aplication.yml indicar los brokers, el topic, username y password 

kafka:
  brokers:
    url: XXX   
  cloudkarafka:
    topic: XXXX
    username:  XXX
    password:  XXX


Ejecutar:

 Docker:
 	1. mvn install dockerfile:build
	2. docker run -p 8080:8080 -t springio/kafkademo
 
 Maven:
    1. mvn clean install
    2. java -jar ./target/kafkademo-0.0.1-SNAPSHOT.jar
    
 	
 Producer URL
 
   http://localhost:8080/kafka/producer?data=Mensaje
   
   
 Consumer URL
   
   http://localhost:8080/kafka/consumer
 
    




