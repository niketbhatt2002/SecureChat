#!/bin/bash

mkdir -p out
javac -d out src/server/*.java src/client/*.java
echo "Build complete."
