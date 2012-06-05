#!/bin/bash

# Balancing Dispatcher
cp src/main/resources/BalancingDispatcher.conf src/main/resources/application.conf
mvn -q compile
echo ">>> Balancing Dispatcher"
./run-java.sh 

