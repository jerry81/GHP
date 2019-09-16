[Back to 2019](2019index.md)


frontend June


ARTICLE: top 5 skills to learn as junior js dev

1. Master fundamentals of js “eloquent js” ebook

2.  Go deep on 1 framework - react is best bet in 2019

3.  Look for big-picture trends that will stick

4.  Backend, learn Express

5.  Data flows - flux, state management, GraphQL


ARTICLE: 一个合格的中级前端工程师必须要掌握的28个javascript技巧
1.  判断数据的类型 - determine type of object
const isType = type => target => `[object ${type}]` === Object.prototype.toString.call(target)
// => arrow function
type input right side is return val
target input, return right logic

2.  ES5 实现数组map方法
continue keyword:  breaks one iteration and continues with next
js call (and apply) almost exactly the same, apply accepts array of args
call accepts list of args
call and apply used to force value of "this"

3.  使用reduce 实现数组map方法
Array.prototype.reduce(function)
where function is (pre, cur, index, source) => {
return
}
pre - accumulator
cur - current val
index - current index
source - source array
use spread(rest?) operator, to "accumulate" the new array
could have used push instead too

4.  es5 实现数组filter方法
&& operator can be less wordy than if, and ?

5.  reduce to impl filter

6.  es5 impl Array.some()
Array.prototype.some - input function that tests element
return true if at least one element passes

7.  impl reduce with es5
(come back to this one)
稀疏 = scattered
because there could exist scattered array dependencies, reduce must jump over those scattered elements
遍历 - ergodic - condition that system returns to states similar to previous ones given a long enough time
args fn and initialValue
copy array
define res and startindex
if initialvalue undefined
  step thru array (this)
  item hasOwnProperty(index) skip over
  otherwise startindex <-- i
  res <-- arr[i]
  break loop
else
  res <-- initialValue

 loop starting at startindex + 1 (++startindex) ending at arr.length
again skip hasOwnProperty(i)
  res <-- fn.call(null (this context), res, arr[i], i, this)
  after first arg is argument list
  so, res is the accumulated value,
  arr[i] is the current item
  i is the index
  this is the array itself
  which matches the reduce prototype
hasownproperty method determines if property is direct property of object
reduce (callback(accum, currentval, index, array), initVal)
where index, array, initval all optional

8.  impl Array.flat() with reduce
flat - subarray elemenets concatenated recursively to specified depth
(defualts to 1)
default variable
selfFlat = function (depth = 1)
copy array with slice
stop condition (b/c recursion)
if depth === 0 return
return arr.reduce((accum, current) => {
  if is array
  use spread operator to combine arrays shorthand [...pre, ...selfFlat.call(...)]
  this selfflat calls recursively stepping down depth, passing in the accumulated current as the "this" context
  both are arrays that spread into individual entries and combined with array shorthand
}, [])
[] is the initial value
reduce will handle the enumerating through the array entries


9.  实现es6 class
Object.create(super, {
  constructor: {
    enumerable: false,
    configurable: true,
    writable: true,
    value: subType.constructor
  }
})
Object.setPrototypeOf(sub, super)
Object.create(proto, properties) - create new obj with specified prototype and properties
Object.setPrototypeOf(obj, prototype)
sets obj.__proto__ = proto;

10.  currying (柯里化)
fn.length - function has length prop? yes - # of params expected by function

11.  currying supporting 占位符 - placeholder
come back to this

12.  偏函数 - partial function
related to currying - with placeholders
applys function with subset of params and returns another function
that contains "remainder" of function logic

13.  Fibonacci and optimizations
memory optimization -
run the function through another function
memoization - reuse the result of the function  and store it in table

14.  implement function.bind
keys: new.target- a property - detect if function or constructor called using new
operator or not
referesher: new - passes this as context
links constructor

this.apply(arg1, arg2)

15. implement call
js call specify "this" and args, as individual args
(apply accepts array of args)
symbol can be used to avoid naming conflicts (property)
use ... rest operator for args

16. CO modules - invented by tj halowaychuk
generator based control flow
write non-blocking code

17.  implement debounce (防抖)
arrow function whose body defines another function and returns that function
outer function acting as a closure?
trailing and leading props

18.  throttle = (节流)
throttle will run the function every x seconds
debounce delays all calls by x seconds and if another one comes it resets the timer (gives to option to)

19.  lazy image loading (图片懒加载)
only load the image when it scrolls into view

20.  new keyword impl
new eqiv to Object.create(fn.prototype)
fn.apply(instance, rest) (rest args?)
return the function or the instance depending on if object is complexdatatype

21.  Object.assign impl
assign copies object from source (2nd arg) to target(first arg)
like our deep copy
use reduce and for each property (source already spread into array)
check if is object or function (complex data type)
loops on all props of cur and sets acc[key] to cur[key]
Object.keys(cur) and Object.getOwnPropertySymbols(cur) spread into single array, and foreached

22.  impl instanceof
use Object.getPrototypeOf

23.  private variable impl
uses Proxy type
to intercept "get" and block normal get of keys starting with _
Reflect used as well
Reflect is a global object with several methods (same as proxy)

24.  shuffle algorithm (洗牌算法)
loop through array,
random index gotten between between cur index and the end of the array
perform a swap of the two in place with
[x, y] = [y,x]

25.  “单例模式” singleton pattern
use proxy, intercept the construct method,
  check if instance (local) exists, if so, Reflect.construct
  else return instance

26.  promisify a function
return new Promise((resolve, reject)) => {
  pushes a callback to the args
}
}
come back: quite an advanced technique

27.  gracefully handle async/await
wrap async await function call with
async function errorCaptured
  which has try catch

28.  distribute subscription eventEmitter
发布订阅 eventemitter
a class with subscriptions map {eventname: callbacks[]}
on to listen to events
(which adds to subscriptions map)
trigger method - causes every method subscriptions map with key event to run with passed in args
once method - only run once
and off method (removes the listener)

29. impl stringify - must understand the following rules:
  if object has toJSON - use toJSON
  dates use toISOString
  in arrays:
  undefined, symbol, function return null
  infinity/nan -> null
  in objects:
  infinity/nan -> null
  undef/symbol/function - do not use toString?
  non obj/array/function/date complex objects turn into empty objects
  circular dependencies throw exception
ARTICLE:
React for vue developers

Templates == jsx

.vue files


Conditional rendering - v-if, v-else, v-else-if

React equivalent && operator

Or ? For else


List rendering vue - v-for

React

array.map function


Iterate over object

V-for (value, key) in object

React - object.entries(object).map([key,value]) => {

…


vue using expressions as props - ‘:’

React equivalent {}


Vue data = react useState hook


Vue v-model 2 way binding

React - explicitly specify

Value = {xx}

onChange={event => setName(event.target.name)


Vue computed properties -

Variables wrapped with useMemo

useMemo allows you to specify when to recompute (compute only when specified variables change)


Vue $emit and $on

Same as callback prop (pass function through props)


Event modifiers = HOC


vue Lifecycle methods = useEffect hook


vue Watchers — use effect to achieve same effect


Vue slots - jsx props or render props

Frontend Article:

Aspect-ration sized images by doing nothing

Letting images auto size based on container leads to “rank”

Instead create aspect-ration sized boxes

Current workaround is hack - set zero height and push boxes height with padding


Intrinsicsize property =“800x600” can be used

Also aspect-ration property draft spec

Img{

Aspect-ration: attr(width) / attr(height)

}

Frontend

ARTICLE:  practical guide to css position relative and absolute

Position does things that are unexpected


Possible values: static, relative, absolute, sticky, fixed

Using position relative allows item to stay “in flow” of document, just moved from that location


Position absolute takes item out of flow

Absolute relative to top left corner of browser


Can control the “starting position”

By giving absolutely positioned item’s PARENT relative position


Applications: overlapping elements

Art

ARTICLE: everything you need to know about js Date
two times:
local and UTC (universal coordinated time) also known as GMT
default - local

create using formatted string

ARTICLE: the css mindset
1.  declarative nature
2.  not traditional PL
3.  flexible by default
4.  everything is a rectangle
5.  too see boxes use outline: 2px dotted hotpink;
6.  cascade: global scope, component scope, save redeclaring unnecessarly
7.  as much as necessary as little as possible
8.  shorthands not as good as explicit
9.  magic numbers bad
10.  context: refers to parent/decendant relationships
11.  be prepared for all types of content - anticipate
12.  find and reuse patterns

ARTICLE: creating a proxy for myself
科学上网=翻墙=利用技术手段能够访问在中国被GFW 禁止网站

method to introduce: shadowsocks (基于socks5代理方式)
socks5 - internet protocol that routes network packets thru proxy server
socks5 provides authentication
tcp connections to ip address forwards udp packets
setup our own SS server with a client
AWS - new users can use up to a year for free, 15G per month
need a server connected to internet
amazon EC2 elastic compute cloud

first register aws

ping to china: 1527 ms
ping usa virginia 276 ms

login into control panel
pick location (of server farm)
start a virtual machine
start an instance
pick ubuntu server
pick configuration and specs
key/value for authentication ?
setup security
SSH tcp port 22
2.  connect to server
using iTerm or xshell
run
chmod 400 xxxx.pem (the one downloaded from aws)
ssh using pem to ubuntu@.... the server address
install ss:
apt-get install python-setuptools, python-pip
pip install shadowsocks
(apt is advanced package tool)
start shadowsocks
7.  connecting to the shadowsocks server
download the shadowsocks client
point client to server
all net comms will go through the ss proxy

appimage file - installing linux packages without superuser

ARTICLE: Micro Frontends
on
martin fowler.com (author of refactoring)

objective:  scaling f.e. dev so many teams can work simultaneously hard
break up f.e. monoliths into smaller pieces

microservices popularity rising - way of breaking up backend

microfrontend def: independently deliverable f.e. applications
composed into greater whole

be aware of risks: duplication of dependencies
increase footprint
fragmentation due to team autonomy

benefits:
incremental upgrades

each micro frontend simpler

components cannot be coupled

team autonomy

example:
restaurant website -
three pages
landing page
restaurant page
profile page

design:
single container application and a micro frontend
for each page

approaches to implementation
each mfe published as a package
- not recommended: must re-compile and release each mfe after any changes

use iframe

use <script> tag
(recommended)

issues:
css style naming conflicts
sol: use better naming

visual consistencies
sol: use underlying foundation framework
this should emerge naturally as more components
are added and patterns are discovered
ensure ui logic is pure ui and contains no business logic

cross-mfe communication
how?
avoid having to do it
strive for decoupling
avoid shared state
use events and messages

bff pattern: backend for frontend

each mfe gets own bff but that bff may call shared services

example in detail:
uses reactjs
container:
dependencies: react , react-dom, react-router-dom, react-scripts

app.js
<Switch>
<Route exact path="/" component={Browse}>
so setting up routing

const browse =
<MicroFrontend> component
mfe component is just another react component
each mfe has its own script

if the script has been added to the document, then render
the mfe has its own manifest file
which is read,
script element created runtime

on destroy (unmount) we want to remove the script

routing used for cross component comms
pass id thru params

ARTICLE: “advanced js questions”

1.  console.log(name);

console.log(age)

Var name = “Lydia”;

Let age = 21;


tests diff between var and let

Var - men space setup during creation phase, default is undefined

Let and const “hoisted” but not init

Ref error if access before definition


2.  for (var I = 0 I<3; I++) {

 setTimeout(() => console.log(I), 1);

}


for (let I = 0…..)


Output is ?

333, 0 1 2

Concepts: event queue - settimeout called after loop executed

+

Block scope vs global scope


3.  Const shape = {

 Radius: 10,

 diameter() {

   Return this.radius * 2;

 },

 Perimeter: () => 2 * Math.PI * this.radius

}

shape.diameter();

shape.perimeter();


Concept: function vs arrow function

Arrow function - ‘this’ is current surrounding scope (not shape, but global scope)


Ans 20 and NaN

4.  what's the output
+true;
!"Lydia";
1,
false
concepts - implicit conversions

5.  const bird={
size: "small"
}
const mouse = {
name: "Mickey",
small: true
}
mouse.bird.size not valid
but mouse[bird.size] is okay
js unboxes statements going from inside out
Looks for first ]

6.  what's the output?
let c = { greeting: "hey"}
let d;
d = c;
c.greeting = "Hello";
console.log('d.greeting')
ans. Hello

concept: object assignment assigns by reference

7.  let a = 3;
let b = new Number(3);
let c = 3;
console.log(a==b);
console.log(a===b);
console.log(b===c);
true
false
false
concept == vs ===

8.  class Chameleon {
  static colorChange(newColor) {
    this.newColor = newColor;
    return this.newColor;

    constructor({ newColor = "green" } = {}) {
      this.newColor = newColor
    }
  }
}
const freddie = new Chameleon({ newColor: "purple" });
freddie.colorChange("organge");

Typeerror?  static function must be called with Chameleon.colorChange
concept static function
9.  let greeting;
greetign = {}; // typo
console.log(greetign);
ans:  {}
because when not using 'use strict' mode,
un prefixed declaration adds to global scope
global.greetign (or window.greetign) = {}

concept: variables without let/const/var
concept: use strict

10.  function bar() {
  console.log("Woof!");
}
bark.animal = "dog";
guess syntax error
sol: nothing, this is fine
function is an object that has props as well
concept: function type

11.  function Person(first, last) {
  this.first = first
  this.last = last
}
const member = new Person('Lydia', 'hallie');
Person.getFullName = function() {
  return `${this.first} ${this.last}`;
}
console.log(member.getFullName);
typeerror:
must use Person.prototype.getFullName to add to all instances
concept: "Object.prototype"

12.  function Person(first, last) {
  this.first = first
  this.last = last
}
const lydia = new Person("lydia", "hallie");
const sarah = Person("Sarah", "Smith");
console.log('lydia');
console.log('sarah');
ans: Lydia is an obj, sarah is not
new creates the object and returns it treating this context as local function scope
without new it doesn't return the object and this is the global this
concept: new vs no new

13.  three phases of event propagation?
capture target bubble?
capture - goes thru ancestor elements to target
target - where to stop, where the event handler was
bubbling - go back to surface
so it's like a surgical incision
concept: event propagation

14.  all objects have prototypes t/f?
false - baseobject does not

15.  what's the Output?
function sum(a, b) {
  return a + b;
}
sum(1, "2");
"12"
+ operator: 1 gets converted to string dynamically
concept implicit type coercion
concept dynamically typed language
concept how number + "string" converts types

16.  let number = 0;
console.log('number++');
console.log('++number');
console.log('number')
0
2
2
concept ++ pre and postfix

17.  function getPersonInfo(one, two, three) {
console.log(one,two,three);
}
const person = "Lydia",
const age = 21
getPersonInfo`${person} is ${age} years old`;
concept: tagged template literals using function
first arg always array of string vals
remaining args get values of passed args
['', 'is', 'years old'], "lydia", 21

18.  function checkAge(data) {
  if (data === {age:18}) {
    console.log('You are an adult')
  } else if (data == {age:18}) {
    console.log('you are still an adult');
  } else {
    console.log('no age')
  }
}
no age
concepts == vs ===
concept: obj comparison
checks ref location in memory
concept:  comparison based on value vs by ref
concept: primitives vs objects

19.  function getAge(...args) {
  console.log(typeof args);
}
getAge(21);
object
concepts - spread
concept - typeof array is object

20.  function getAge() {
  "use strict";
  age = 21;
  console.log(age)
}
getAge();
Error (ReferenceError)
concept: use strict - prevent undeclared variables

21.  const sum = eval("10*10+5");
105
eval evaluates code passed in as string
concepts: eval

22.  sessionStorage.setItem("cool_secret", 123);
how long is it accessible?
lost after user closes tab
concept: localstorage vs sessionstorage

23.  var num = 8;
var num = 10
console.log(num)

10
concept: redeclare var vs const and let
var ok, const let not okay b/c block scoped

24.  const obj = { 1: 'a', 2: 'b', 3: 'c' };
const set = new Set([1,2,3,4,5]);
obj.hasOwnProperty("1")
obj.hasOwnProperty(1)
set.has('1');
set.has(1);
concepts: hasOwnProperty, set, set.has
true, true, false, true

25.  what is output?
const obj = { a: 'one', b: 'two', a: 'three'};
console.log('obj');
{a: 'three', b: 'two'}
concept: replacement of keys

26.  T/F: js global execution context creates global object and this keyword
true

27.  for (let i = 1; i < 5; i++) {
  if (i === 3) continue;
  console.log(i);
}
1 2 4
concept: continue keyword

28.  String.prototype.giveLydiaPizza = () => {
 return 'just give lydiia pizza';
}
const name = "lydia"
name.giveLydiaPizza()
'just give lydia pizza'
concept: we modified string's prototype

29.  const a = {};
const b = { key: 'b' };
const c = { key: 'c' };
a[b] = 123;
a[c] = 456;
console.log(a[b]);
456
concepts: 1.  object property access
2.  "key" is just a red herring
3.  using obj as key
4.  automatic stringification of an object

30.  const foo = () => console.log("First");
const bar = () => setTimeout(() => console.log("Second"));
const baz = () => console.log("Third");

bar();
foo();
baz();

First third second
Concept: browsers have both runtime engine and webAPI
webAPI gives us setTimeout and DOM
three entities: call stack, web api and queue
timeout callbacks get added to queue

31.  <div onclick>
    <div onclick>
     <button onclick></button>
     </div>
     </div>
what is event.target when clicking button?
button
concept: target is the deepest element that caused the event

32. <div onclick=console.log('div')>
  <p onclick=console.log(p);>
  </p>
  </div>
  what is output of clicking on p ?
  p div
  start at inner then bubble to top unless prevented with "useCapture: true"

33.  what is output?
const person = { name: "Lydia" };
function sayHi(age) {
  console.log(`${this.name} is ${age}`);
}
sayHi.call(person, 21);
sayHi.bind(person, 21);
lydia is 21, function
call vs bind
call immediately executed

34.  function sayHi() {
  return (()=>0) ()
}
typeof sayHi()
number
concept: IIFE immediately invoked function

35.  which are falsy:
0; yes
new Number(0); no
(""); yes
(" "); no
new Boolean(false); no
undefined yes
concepts - falsy

36.  console.log(typeof typeof 1)
string
concepts:  typeof

37.  const numbers = [1,2,3];
numbers[10] = 11;
console.log(numbers);
[1, 2, 3, empty... 11]
concepts: uninitialized array members

38.  (() => {
  let x, y;
  try {
    throw newError();
  } catch (x) {
    (x=1), (y=2);  <-- what's this -- assignment statements separated by commas
    console.log(x);
  }
  console.log(x,y);
}) ()
  1, undefined, 2
  concepts - scope
39.  everything in js is either : primitive or object
40.  [[0, 1], [2, 3]].reduce((acc, cur) => {
  return acc.concat(cur);
}, [1,2]);
[0,1,0,1,2,3]
concept: reduce function
41.  !!null;
!!"";
!!1;
false
false
true
42.  setInterval(() => console.log("Hi"), 1000);
returns a unique id
concept: setInterval
43. [..."Lydia"];
["L", "y", "d" ...]
concept:  iterable, spread
44.  what is output？
function * generator(i) {
  yield i;
  yield i * 2;
}
const gen = generator(10);
console.log(gen.next().value);
console.log(gen.next().value);
10, 20
concept: yield, generators
45.  const firstPromise = new Promise((res, rej) => {
  setTimeout(res, 500, "one");
});
const secondPromise = new Promise((res, rej) => {
  setTimeout(res, 100, "two");
});
Promise.race([firstPromise, secondPromise]).then(res=>console.log(res));
two
46.  let person = { name: "Lydia" };
const members = [person];
person = null;
console.log(members);

{ name: 'Lydia' }
concept: const, object reassignment

47.  const person = {
  name: 'lydia',
  age: 21
};

for (const item in person) {
  console.log(item);
}
'name', 'age'
concept: in iterates over keys

48.  console.log(3 + 4 + '5');
'75'
concept: OOO, type coercion

49.  const num = parseInt("7*5", 10);
7
concept:  how parseInt parses

50.  [1,2,3].map(num => {
  if (typeof num === 'number') return;
  return num * 2;
});
[undefined, undefined, undefined]
concepts: map function

51.  function getInfo(member, year) {
  member.name = "Lydia";
  year = 1998;
}
const person = { name: "Sarah" };
const birthYear = "1997";

getInfo(person, birthYear);

console.log(person, birthYear);
{ name: "Sarah" } 1997

concept: arguments pass by value unless object is being passed, then pass by reference

52.
function greeting() {
 throw 'hello world!';
}
function sayHi() {
  try {
    const data = greeting();
    console.log("it worked", data);
  } catch (e) {
    console.log("oh no an error", e);
  }
}
sayHi();
oh no an error hello world
concept: throw

53.  function Car() {
  this.make = "Lamborghini";
  return { make: "maserati" };
}
const myCar = new Car();
console.log(myCar.make);
Maserati
concept: return in a constructor

54.  (() => {
  let x = (y=10);
})();
console.log(typeof x);
console.log(typeof y);

undefined number
concept:  shorthand,
global object
let (block scope)
assigning a global object's property to let


1. For the input "a confusing /:sentence:/[ this is not!!!!!!!~" your output was incorrect.
The correct answer is b dpOgvtjOh /:tfOUfOdf:/[ UIjt jt OpU!!!!!!!~.

ARTICLE

Flutter and React Native comparison

If u know obj c and java, why do we need cross-platform?

Ans. Business logic reuse, reduce redundancy while keeping performance


Flutter
dart lang
Flutter engine as env
2017 release
67k+ git stars
5.2M on android 10.1M on IOS
output: binary
used by: idlefish(taobao), meituan

RN
js lang
jscore  engine
2015 release
78k stars
android 20M ios 1.6M
output: js bundle file
used by: ctrip tencent, jd

tools to setup environment
react uses npm, node, and react-native-cli
flutter uses flutter sdk and android studio/vscode's dart and flutter plugin

implementation principles:
flutter and RN both need a native activity / viewController

RN uses a C++ bridge under the virtual dom

Flutter also a C++ bridge under the Dart framework

coding:
RN uses JS
flutter preferred lang Dart came out in 2011 currently Dart 2.0 (2018)

dart also supports async, await, yield and * generator functions
also support var

introduces String, dynamic types
js is dynamic language, dart pseudo dynamic language strongly typed

styling:
RN supports scss/sass
also supports react hooks
can extend component pass props, render method

in Flutter, everything is a "Widget"
extend from Stateless and Stateful Widgets

java-like syntax
@override annotation
final keyword spotted

override the build method (like render?)
Dart 2.3 syntax very different from dart 1

native widgets:
rn's entire rendering process done on the native layer, so integrating native plugins is not hard

flutter weak on this front - didn't even support webview at first
flutter rendering process is separated from the native layer, and interacts directly with teh GPU
platformView offered as a solution to this issue

plugin development:
RN plugins - npm packages
flutter - pub packages (dart packages)

compile and outputs
RN makes a index.android.bundle and a main.jsbundle (IOS)
Flutter makes 4 snapshots (2 isolates 2 vms)
RN's android size is bigger than ios - b/c ios has its own jscore, android needs a bunch of shared objects
flutter - android has skia out of box so android build smaller

performance:
theoretically flutter has better perf than RN
flutter lacks the OEM widget (original equiment manufacturer)
benchmarks go to flutter
js and dart both single threated

future: airbnb ditched RN
FB is refactoring RN
flutter to support web also soon
