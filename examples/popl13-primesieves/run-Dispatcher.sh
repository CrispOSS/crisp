#!/bin/bash

# Dispatcher
cp src/main/resources/Dispatcher.conf src/main/resources/application.conf
mvn -q compile
echo ">>> Dispatcher"
./run-java.sh >> Dispatcher.csv

