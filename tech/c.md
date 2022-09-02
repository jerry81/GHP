# C, C++

## making transition from c to c++

[ref](https://www.embedded.com/making-the-transition-from-c-to-c/)

- written 2011

- embedded software teams considering migration from C to C++

- history
  - in early days of embedded, everything was assembly
  - C ("high level" PL) took over as processors got more powerful
    - example of low level op: direct access to mem locations
  - Ada still had a role in defense apps

- strategy
1.  write new code in c++ and link with existing c
2.  clean c, modify c to be acceptable to cpp compiler
3.  c+: first use language features without using oop


1.  c and c++ can interop (link modules)
  - issue here is linkage errors unless handled correctly
  - c++ allows overloading - to achieve this, c++ overloaded function names are "mangled" c's are not.
    - turn off typesafe linkage to allow c and c++ to interop
  - use extern "C" (in c++) to mitigate this

2.  clean code.  our goal is to use the c++ compiler.
  - must clean up c code to do this
  - c++ compiler fussier
  - C almost a subset of cpp but not quite
  - no "enums" in c, they are data type in C++
  - function prototypes not mandatory in C
  - C and C++, terminate strings with NULL, but not necessary in C

3.  c+
  - pointers #1 cause of programming errors in C, supported in C++
  - ref pointers supported by c++
```c
void swap(int *a, int*b)
{
  int temp = *a;
  *a = *b;
  *b = temp;
}

swap(&a, &b);
```

```cpp
void swap(int& a, int& b)
{
  int temp = a;
  a = b;
  b = temp;
}

swap(a,b);
```

  - cpp has exception handling which carries overhead
    - mitigate with generic catch
    - redefine lib function terminate()
  - cpp constructor and destructor - can use them to handle resource allocation
  - structure and class very similar - only diff in class members are private by default, made public with public: label
    - struct is public by default, made private with private: label