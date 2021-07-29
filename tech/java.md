[Go Home](../index.md)

# Java Basics

## versions

SE standard edition basic

EE enterprise edition SE plus more - EJB, Servlet, JPA

ME Micro edition - mobile

JavaFX for UI

## History

Java original name was Oak

jdk 1.0 1996
current stable 10 SE
latest version 16 SE 3/2021

March and september releases

Designed as successor to C++

## Features

### abstraction

abstract class vs interface - interface no impl details
abstract class may implement one or more methods but also include methods without implementation

### WORA

write once run anywhere

compiler compiles source into bytecode
bytecode can run on win/mac/linux

### Security 

Virus free software because:
No c-style pointer
Run in JVM sandbox 

### robust

1.  memory management
2.  garbage collection
3.  exeption handling

### performance

slower than C/C++ because bytecode still needing to be interpreted by JVM

### c++ vs java

c++ can be both by call by ref and call by value
java call by value only - don't expect objects sent in method to be changed

c++ no native threads
java native threads

c++ virutal keyword makes function overrideable
java functions all virtual by default (except static)

c++ multiple inheritance (one class many parents) supported
java no multiple inheritance 