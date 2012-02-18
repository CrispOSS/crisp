#!/bin/bash

for n in {1..25}; do
	mvn -q exec:java -Dexec.mainClass="nl.cwi.crisp.examples.primesieves.java.SequentialPrimeSieveGenerator" -Dexec.args="$((n * 2))" >> java.log ;
done

