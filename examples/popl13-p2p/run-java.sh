#!/bin/bash

for n in {10..100}; do
	mvn -q -e exec:java -Dexec.mainClass="nl.cwi.crisp.examples.p2p.scala.Main" -Dexec.args="$((n * 2))" ;
done

