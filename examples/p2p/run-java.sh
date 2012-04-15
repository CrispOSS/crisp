#!/bin/bash

for n in {1..1}; do
	mvn -e exec:java -Dexec.mainClass="nl.cwi.crisp.examples.p2p.scala.Main" -Dexec.args="$((n * 2))" ;
done

