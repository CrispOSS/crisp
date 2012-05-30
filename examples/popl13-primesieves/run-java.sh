#!/bin/bash

for n in {10..100..5}; do
	mvn -q exec:java -Dexec.mainClass="nl.cwi.crisp.examples.primesieves.crisp.Main" -Dexec.args="$((n))" ;
done
