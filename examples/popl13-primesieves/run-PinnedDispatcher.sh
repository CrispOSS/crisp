#!/bin/bash

# Pinned Dispatcher
cp src/main/resources/BalancingDispatcher.conf src/main/resources/application.conf
mvn -q compile
echo ">>> Pinned Dispatcher"
./run-java.sh >> PinnedDispatcher.csv

