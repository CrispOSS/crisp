#!/bin/bash

for n in {10..15}; do
	mvn -q exec:java -Dexec.mainClass="nl.cwi.crisp.examples.primesieves.crisp.Main" -Dexec.args="$((n))" ;
done
