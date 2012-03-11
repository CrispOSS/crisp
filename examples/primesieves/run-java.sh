#!/bin/bash

for n in {1..25}; do
	mvn -q exec:java -Dexec.mainClass="nl.cwi.crisp.examples.primesieves.akka.Main" -Dexec.args="$((n * 2))" >> akka.log ;
done

