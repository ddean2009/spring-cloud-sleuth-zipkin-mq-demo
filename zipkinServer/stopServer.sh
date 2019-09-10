#!/bin/bash

for i in `cat pid.txt`
do
ps awx -o "%p %p" | grep -w $i | awk '{ print $1 }' | xargs kill -9
done
echo "stop all program at : `date` "
rm -rf pid.txt
