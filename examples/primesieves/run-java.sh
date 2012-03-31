#!/bin/bash

for n in {1..10}; do
	mvn -q exec:java -Dexec.mainClass="nl.cwi.crisp.examples.primesieves.crisp.Main" -Dexec.args="$((n * 2))" ;
done

