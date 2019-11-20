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
