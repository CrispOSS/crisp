#!/bin/bash

mvn -q compile
for n in {10..10}; do
	mvn -e -q exec:java -Dexec.mainClass="nl.cwi.crisp.examples.elevator.scala.Main" -Dexec.args="$((n)) 1" ;
done

