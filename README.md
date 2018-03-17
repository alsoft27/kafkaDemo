# KafkaDemo on Docker

project for kafka learning

Docker Setup

First Step is to create the bridge network to enable communication between Kafka & Zookeeper

$ docker network create kafka-net

Then download and run zookeeper from docker hub

$ docker run -d --name zookeeper --network kafka-net zookeeper:latest

After setting up the container for zookeeper, next pull the image of Apache Kafka from docker hub.
For this purpose, we will use ches/kafka repository using command

$ docker run -d --name kafka --network kafka-net --publish 9092:9092 --publish 7203:7203 --env KAFKA_ADVERTISED_HOST_NAME=192.168.99.100 --env ZOOKEEPER_IP=zookeeper ches/kafka

create topic
$ docker run --rm --network kafka-net ches/kafka \kafka-topics.sh --create --topic KAFKA_TOPIC --replication-factor 1 --partitions 1 --zookeeper zookeeper:2181




# Kafka on-Premises



Install ZooKeeper

http://zookeeper.apache.org/releases.html

create config file conf/zoo.cfg
conf/zoo.cfg
tickTime=2000
dataDir=/path/to/zookeeper/data
clientPort=2181
initLimit=5
syncLimit=2

Start ZooKeeper

bin/zkServer.sh start

Stop ZooKeeper

bin/zkServer.sh stop


Install Kafka 2.11

https://kafka.apache.org/downloads


Start Server Kafka
bin/kafka-server-start.sh config/server.properties

Stop Kafka
bin/kafka-server-stop.sh config/server.properties
