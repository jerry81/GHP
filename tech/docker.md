[Go Back](../README.md)


## Dockerfile

used by docker build command 
in addition to context 

like a batch file, all the commands you would run in sequence on command line (docker desktop)

Warning: Do not use your root directory, /,
as the PATH as it causes the build to transfer the entire contents of your hard drive to the Docker daemon.

FROM <name of image>:<tag>

WORKDIR <path>
(is like cd)

#comment

RUN <name of executable> 

ENV <environment variable> <value>
or ENV NAME=VAL

COPY <src> <dest> will "upload" the file to the destination (local filesystem only)

ADD <src> <dest> includes urls where you can dl from 


### docker in docker 

the idea: to run a docker inside a docker container 

this is not recommended

### sidecar

this is recommended alternative to DiD

connect a container not running Docker daemon to docker daemon of host system 

### definition - docker daemon



### docker compose 

[reference for docker compose](https://docs.docker.com/compose/reference/restart/)

can compose multiple images defined in docker compose or link to Dockerfile

a yaml file that is run with docker-compose up

-f can be used to direct to a specific file 
otherwise it just grabs the docker-compose.yml file in the current directory

syntax

services:
  <service-name>:
    image: <docker image>
    restart: <restart policy>
    env_file:
      - <env file>
    container_name: name to give to container
    environment: 
      <env_var_name>: <value> (can use env from env file, ref variables with ${x})
    volumes: 
        -  like docker run -v src:tgt
    ports:
        - like docker run -p src:tgt
    build:
        dockerfile: <path to dockerfile> (would be used instead of image)
        links: (similar to network, but use network instead)
        networks: - allows multiple containers to communicate w/ e/o
          - network name
 networks: (note that this is on same level as services at the root)
        network name:
  
 docker-compose run vs exec vs up 
 up - runs the docker compose containers
 run - starts one-off service, allows u to override configs with command line
 exec - reuses existing service
 
