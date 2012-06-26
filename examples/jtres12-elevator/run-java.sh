#!/bin/bash

mvn compile
for n in {5..10}; do
	mvn -e exec:java -Dexec.mainClass="nl.cwi.crisp.examples.elevator.scala.Main" -Dexec.args="$((n)) 1" ;
done

