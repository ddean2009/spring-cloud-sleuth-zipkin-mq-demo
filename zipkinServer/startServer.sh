#!/bin/bash

#rabbit mq config
export RABBIT_CONCURRENCY=1
export RABBIT_CONNECTION_TIMEOUT=60000
export RABBIT_QUEUE=zipkin
export RABBIT_ADDRESSES=127.0.0.1:5672
export RABBIT_PASSWORD=guest
export RABBIT_USER=guest
export RABBIT_VIRTUAL_HOST=zipkin
export RABBIT_USE_SSL=false

#mysql config
export STORAGE_TYPE=mysql
export MYSQL_DB=zipkin
export MYSQL_USER=root
export MYSQL_PASS=123456
export MYSQL_HOST=127.0.0.1
export MYSQL_TCP_PORT=3306
export MYSQL_MAX_CONNECTIONS=10
export MYSQL_USE_SSL=false

nohup java -jar zipkin.jar  &

echo $! > pid.txt