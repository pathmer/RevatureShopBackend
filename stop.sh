#!/bin/bash

for port in 9000 9001 8888; do
  curl -X POST http://localhost:$port/actuator/shutdown
done

exit 0