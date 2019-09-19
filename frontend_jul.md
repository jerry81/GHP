[Back to 2019](2019index.md)

frontend july

ARTICLE:

SHERlocked93

I.  Type conversion

1.1 string -> number

 ’32’ * 1;  or +’32’

1.2 object -> string

 ‘The item: ‘ + Math (which calls toString())


But if using + and the object has both valueOf and toString, value takes precedence


1.3 - use boolean to filter fake values

 arr => arr.filter(Boolean) // Boolean constructor removes all falsy values from array



1.4.  ~~4.9 floors a number


But not exactly same as Math.floor (with negative numbers)


1.6.  truncate

 1.3 | 0  // 1

  -1.9 | 0  // -1


1.7 check if odd

 & 1

 Or %2


2.  Functions

 2.1   default args

 Function (l, m=3, n=4) …


 2.2 mandatory params

 Function mandatory () => {

   Throw new error

 }

 Function (bar = mandatory()) {

 }


2.3 implicit return

 Return not necessary for arrow fn with single line


2.4. lazy loaded functions
techniques involving reassigning the function within the function

5.3 - swapping two variables
[a, b] = [b, a];

5.4 - have a function return multiple values
use async function that awaits a
promise.all([function call list ])

5.6 spread of array
const [1: f, 2: u] = ['a', 'b', 'c']
f becomes 'b', u becomes 'c'

6.1 use spread to delete unwanted props
let {_internal, tooBig, ...cleanObjects} = {el1: '1', _internal: 'secret', tooBig: {}, el2: '2'}

  console.log(cleanObject)  // { el1: 1, el2: 2 }

6.2 spread used in params
obj = {
  a: 'a',
  b: {
    c: 'c'
  }
}
(a, b: {c}) => {
console.log(a, c)
}
// 'a'
// 'c'

project euler notes: (math)
arbitrary position arithmetic - use arrays to store strings of digits and use "high school math"
to add each "column" resulting in a carry which gets added to next higher-order "column"

huge power of 2 (2^1000)
problem can be broken down to 1000 doubling operations
which is bigNum + bigNum = sum repeated 1000 times



7-16 frontend

Article

Mistakes when using promises

Promises solve:

Difficult error handling:  async callbacks not executed in same step as event loop, so can’t use

Try/catch statements

perform async code in parallel

Perform async code in sequence


Mistake 1: not running in parallel

Solution:  use promise.all and promise.race


Mistake 2: not chaining promises

Solution: chain them to avoid nested callbacks


Mistake 3:  not using generators
