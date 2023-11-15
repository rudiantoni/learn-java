#!/bin/bash

rm OnlineShop 2> /dev/null
rm -r manual-build 2> /dev/null
mkdir -p manual-build
find ./src -type f -name "*.java" -exec cp --parents {} ./manual-build \;
find ./manual-build -name "*.java" -print | xargs javac
find ./manual-build -name "*.java" -print | xargs rm
jar -cfe OnlineShop.jar Main -C ./manual-build/src .
