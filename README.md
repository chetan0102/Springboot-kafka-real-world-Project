# Springboot-kafka-real-world-Project

.....................................................................................

First start both server

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-start.bat .\config\server.properties

.....................................................................................

To check on console-producer and console-consumer data is send or rcv

bin\kafka-console-producer.bat --broker-list localhost:9092 --topic test

bin\kafka-console-consumer.bat --topic JavaJsonTopic --from-beginning --bootstrap-server localhost:9092

.....................................................................................

Last Stop both server

.\bin\windows\zookeeper-server-stop.bat .\config\zookeeper.properties

.\bin\windows\kafka-server-stop.bat .\config\server.properties

.....................................................................................


Data base Creation 

create database wikimedia;

create table  wikimedia_recentchange;

.....................................................................................