[Back to 2019](2019index.md)


4-12
display flex vs display grid
block vs inline - inline - wont push other items away, wont break line, margin-padding doesn't take space
block - break into new line, box model takes up actual space

display has two keywords - outer and inner value
outer determines inline or block (interact with other elements)
inner determines how its children behave
default HTML is block and inline (normal flow)
flex - (flex item itself is block) direct children become flex, but grandchildren down are normal flow
inline-block is mix between inline and block
inline but has block properties like a width and height
BFC: block formatting content
BFC contains "floats"
inline-block - bfc on inline box
flow-root - bfc on block
history css2 display values
inline
block
inline-block
list-item
none
table
inline-table
css3 added
grid
inline-grid
flex
inline-flex

legacy and short table
block = block flow
flow-root = block flow-root
inline = inline flow
inline-block = inline flow-root
list-item = block flow list-item
flex = block flex
inline-flex = inline flex
grid = block grid
inline-grid = inline grid
table = block table
inline-table = inline table

browser don't support two value syntax yet
tangent:  bfc
example.  when wrapping text around a block
if you float the block and the text is too short, the common parent (container) of the text and block
will only be as tall as the text part (sometimes cutting though the block part)

solutions:
overflow: auto  on parent fixes this

overflow auto on container makes it BFC (actually any value except visible makes it BFC)
note the BFC contains floats

BFC - mini layout inside of a layout
bfc prevents margins collapsing
margin collapsing -
div with two p inside
p has top and bottom margin 20
div has bottom margin 40,
p's margins collapse
reason: nothing between margin of p and margin of outer div
overflow - anything but visible on outer div fixes this (making div bfc)

floats do not get wrapped in a bfc

ways to create bfc:
  1.  overflow: (non-visible)
  2.  position: absolute
  3.  position: fixed
  4.  display: inline-block
  5.  display: table-cell
  6.  display: table-caption
  7.  flex and grid similar to BFC

  BEST WAY:
  display: flow-root



When to use typescript? by Khalil Stemmler
TS is "blowing up"
some dont see benefit at first
dangerous to not use TS
3 categories of problems
1, performant system problem
analogy.  twitter extremely simple concept
but its about how to scale to 500M users a day

2.  embedded system problem
write in C or C++

3.  complex domain problem
large codebase - divide it up into microservices

TS is JS that scales
intellisense works much better with TS

hard to utilize 4 principles of OOP with js:
inheritance, encapsulation, polymorphism, abstraction
js has no interfaces or abstract classes

how to hide information to reduce "surface area of bugs"

author has moved node.js backend to ts
required for backend, optional for frontend

complex domain problem is where TS is necessary
1.  code size - larger means more complex, usually

principle: duplication is enemy to well-designed and stable software
happens when new devs come to large codebase

autocomplete and intellisense helps navigate

unit tests - not always possible due to time
typescript offers compile time checking - can be supportive to unit tests

react has runtime checking with prop types

in startup company - language matters less
what matters is productivity

large teams need TS more
limit the domain and ways to implement same problem
well-specified api

principle: quickly determine required args, return types, describe
program intent with public, private, protected variables
so, communicate interface/api/prototypes quickly

design patterns easily recognizable in TS
i.e. abstract class ... in typescript
but
in js must sift through code
abstract class allows the same method to have different implementations,
it seems

react strategy:
use vanilla when only 1 person coding it and
codebase small

ts when
more than 3 people coding
codebase will be large

can gradually introduce ts with
package.json - add ts and ts-node
use allowjs: true in tsconfig file

principle: compile time errors are better than runtime errors



python paradox by paul graham
aug 2004
python is a programmer's pl
therefore are better hires
paradox is companies that hire on esoteric languages will
get better programmers
because they bothered to learn those languages
goog wants py experience in their java programmers
people like the way source looks
more time spent reading code than writing it

design patterns in modern js development
(TODO: fill)
1.


How to create diagonal containers


Use css clip-path property

polygon(x y, x y, x y, x y) function

Use ::before to eliminate “bleed over “ triangles

Fit content inside to a rectangular area


CSS knowledge:
Descendant combinator -
The space between selectors

Layout, paint, composite
Three steps on how browser draws things
Layout - positioning, and size - changing layout property affects entire page so entire page must be rerendered
Paint - fill in pixels, colors, borders, backgrounds, done on multiple layers
Repainting most expensive, but can skip layout step
Composite - draw layers in correct order, handle overlap

Descendant selector (space between selectors) can be expensive
Because it needs to match all descendants, not just direct
Solution - make the selectors more specific

Avoid modify layout whenever possible
Width, height, top, left

Some paint is expensive, like blur
List:
Border-radius
Box-shadow
Filter
:nth-child
Position; fixed

Performance assessment -

Performance ta, record when loading or interacting with page

frontend dev handbook 2019
recap of 2018
ms bought github
react had several releases, LC methods, context API, suspense, React hooks
fonts created by CSS
JAMstack new term (front-end driven apps)
google new tools "squoosh" "quicklink"
Vue more github stars, less users than react
no Virtual DOM version of react, RE:DOM
alternatives to NW.js, Electron, DeskGap and Neutralino.js
2017 - divide between HTML&CSS developer and JS application developer
new tools competing with R/A/V - Radi.js, DisplayJS, Stimulus,
Omi, Quasar
JS frameworks with own languages (Mint)
Code Sandbox domininant solution for code sharing
Grid and Flexbox fully supported now
typescript and flow "bolted type" systems have dark side
CSS variables
Flavors of CSS in JS
ES modules usable
Dynamic imports coming soon
Cypress - nice e2e testing
Cypress first, then jest
webpack used heavily
parcel seems easier
"what is cost of JS?" hot question
Babel 7 first release in 3 years
too much js too fast is a debate
GraphQL, Apollo next evolution for data APIs
NPM/Yarn dominant over gulp, MS came out with Just
Lint/hint HTML/CSS/JS "lint web?"
todo: read 2018 front-end tooling survey
typescript gained users
VSCode dominant

what to expect from 2019
step away from sass
additions to css
webp image format from google
prepack grow in popularity
GraphQL to grow in popularity
"state of javascript" authors to add "state of css"
web animations api
author seems to look down on TS
babel competitor swc-project
JAMStacks growing
cross platform tools to continue
ReasonML over JS/TS for large code bases
jquery to lose favor to native dom solutions
web components

define front end developer:
"Front end web dev, also known as client side dev"
"is the practcie of producing html, css, and js for a website or web app
so user can see and interact with them directly."
"The challenge associated with FE dev is that the tools and techniques used
to create the front end of website changes constantly so the dev
needs to constantly be aware of the developing field and enviornment"
"objective of designing a site is to ensure that when users open up site, they see
info in a format that is easy to read and relevant.
This is complicated by the fact that users now use
a variety of devices with varying screen sizes and resolutions
they need to ensure that site comes up correctly in different
browsers (cross-browser), different operating systems (cross-platform)
and devices (cross-device), which requires careful planning"
"architects and develops websites and web apps using H/C/J running on
Open Web Platform OR non-web platform environments (react native)"
"app may run in web browser or a headless browser, webview, or as input for native runtime environment"
notes on runtime envs
web browsers
most common to least:
chrome
safari
IE
ff
edge

headless browsers (web browser without gui)
usages
automation, testing, scraping
examples
headless chromium
zombie
slimerjs
puppeteer

webviews
used by native os, in native apps to run webpages
like a single iframe
best solutions
cordova
NW.js (desktop)
Electron (desktop)

native from web
use web languages to write non-web browser programs
flutter
react native
nativescript

front-end self-develpment map
1.  HTML
  a.  semantic html
  b.  seo
  c.  accessibility
2.  CSS
  a.  layouts
    i.  floats
    ii.  positioning
    iii.  display
    iv.  display
    v.  box model
    vi.  grid
    vii. flexbox
  b.  media queries
  c.  css3
3.  JS
  a.  dom
  b.  fetch/xhr
  c.  es6 & modular js
  d.  hosting/event bubbling/scope/prototype/shadow dom/strict/browsers/DNS/HTTP
4.  package managers
  a.  npm
  b.  yarn
5.  CSS pre-processors
  a.  SASS (use over LESS)
  b.  PostCSS
  c.  Less
6.  CSS FX
  a.  bootstrap
  b.  materialize
  c.  bulma
  d.  semantic UI
7.  CSS architecture (though pushing towards CSS in JS)
  a.  BEM
  b.  OOCSS
  c.  SMACSS
8.  Build Tools
  a.  Linters
    i.  prettier
    ii.  eslint
    iii. jshint
    iv.  jslint
    v. jscs
  b.  task runners
    i.  npm scripts
    ii.  gulp
  c.  module bundlers
    i. webpack
    ii. parcel
    iii.  rollup
9.  framework
  a.  React
    i.  redux
    ii.  mobx
  b.  Angular
    i.  rxjs
    ii.  ngrx
  c.  Vue js
    i.  vuex
10.  CSS in JS
  a.  styled components
  b.  css modules
  c.  emotion
  d.  radium
  e.  glamourous
11.  Testing
  a.  jest
  b.  enzyme
  c.  cypress
  d.  unit/interation/functional
12.  progressive web apps
  a.  storage
  b.  web sockets
  c.  service workers
  d.  location
  e.  notifications
  f.  device orientation
  g.  payments
  h.  credentials
  I.  performance tuning
    i.  prpl pattern
    ii.  rail model
    iii.  perf metrics
    iv.  light house
    v.  devTools
13. Type checkers
  a.  typescript
  b.  flow
14.  server side rendering
  a.  react.js
    i.  next.js
    ii.  after.js
  b.  angular
    i.  universal
  c.  vue
    i. nuxt.js
15.  static site generators (gatsbyJS)
16.  desktop apps
  a.  electron
  b.  proton native
  c.  carlo
17.  mobile apps
  a.  react native
  b.  nativescript
18.  web assembly
TODO continue

“Rotated overlays effect”
A reveal effect
When content that is already there is covered by overlay element and overlay element animates out, revealing what’s underneath
Overlay element same or different color from page background, animate out of viewport.

Challenges
Guarantee overlay covers whole screen so no gaps are shown
overlay itself has content, and hide when moving it out

For non-rotation reveal effect
3 steps
1.  Translate overlay
2.  Translate overlay content opposite direction simultaneously
3.  Add overflow hidden to overlay

Rotate reveal
For rotation reveal effect
The height of the overlay should be based on a formula
Formula to find rotated rectangle’s bounding box.
W = w*abs(cos t) + h * abs(sin t)
H = w*abs(sin t) + h* abs(cos t)
1.  Rotate overlay
2.  Rotate content opposite direction
