#!/bin/bash

mvn -q compile
for n in {10..100..10}; do
	mvn -q -e exec:java -Dexec.mainClass="nl.cwi.crisp.examples.p2p.scala.Main" -Dexec.args="$((n))" ;
done


#mvn -q -e exec:java -Dexec.mainClass="nl.cwi.crisp.examples.p2p.scala.Main" -Dexec.args="100" ;

