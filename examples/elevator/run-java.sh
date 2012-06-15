#!/bin/bash

mvn -q compile
for n in {5..10}; do
	mvn -q -e exec:java -Dexec.mainClass="nl.cwi.crisp.examples.elevator.scala.Main" -Dexec.args="$((n))" ;
done

