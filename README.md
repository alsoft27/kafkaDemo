# KafkaDemo
project for kafka learning

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
