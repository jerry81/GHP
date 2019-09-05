FE - 5-2.


“58 bytes of css to look great everywhere”

Main {

Max-width: 38rem;

Padding: 2rem;

Margin: auto;

}


Default font size for most browsers is 16px, 38rem 608px

600px support at a minimum


Padding 2 rem - keep things looking good until 256px

Top and bottom whitespace


Margin: auto;

Centers the page - b/c main is a block element

Front-end

Implement a mockup with css


Use HTML tags that have semantic meaning

- easier to read,

- easier to automate

- search engines


General rule: put margins on right and bottom of things


Padding inside borders margin outside


List-style property - set to none to override a <li> default style


CSS doesn’t allow comments that start with //

Not always safe on all browsers

Use C-style /* */ comments


FRONTEND HANDBOOK 2019
1.  practice of FE dev:
a.  basics
learn how web platform works
HTML CSS DOM JS Domains DNS URLs HTTP browsers, servers/hosting
b.  learn underlying techs before abstractions
i.e. DOM before jquery
CSS before SASS
HTML before JSX
JS before TS
es6 templates before handlebars
job titles:
f.e. developer - html css dom js
f.e. engineer - cs background, turned into web dev, advanced js
css/html dev - excludes js
ui dev/engi - design + f.e. dev skills
mobile/tablet f.e. dev - native or web
seo expert - craft f.e. towards SEO
accessibility expert - accessibility standards
dev ops - collab, integration, deployment, automation, quality
f.e. testing/QA - functional, user, a/b testing

ARIA - accessible rich internet applications
WCAG - web content accessibility guidelines
Web APIs - HTML5 or browser apis
http 1.1 and 2.0

bare bones team:
  1.  visual designer
  2.  ui/interaction/information architect (wireframes, user interactions)
  3.  f.e. dev
  4.  b.e. dev

"full stack myth" - true full stack experts extremely rare
but not as uncommon as before

front-end salary between 65k and 100k (mid level)

good learning resources
no one person runs the internet
IAB - internet architecture board
ICANN - internet coorporatin for assigned names and numbers
IETF - internet engineering task force
IGF - internet governance forum
IRTF - internet research task force
ISO - international organization for standardization
ISOC - internet society
W3C - worldwideweb consortium

browser ranks
1.  chrome - engine blink & v8
2.  firefox - gecko & spidermonkey
3.  internet explorer - trident & chakra
4.  safari - webkit & squirrelfish

chrome 2017 - 2018 had 50 - 55% of market share

evergreen browsers - self-updating browsers
cross-browser dev a smaller issue today than in the past

DNS - map ip addresses to domain names

HTTP: the foundation for data comms on WWW

CORS - cross-origin resource sharing - restricted resources allowed from one web page to another outside domain

WebSockets - full-duplex communication on single TCP connection

Various types of hosting
shared
vps
dedicated
cloud
reseller

BOM: browser object model - browser-specific convention
all objects exposed by web browser

api not in DOM or BOM are considered WebAPIs

ES6 Template literals
the `${}` syntax can put any js code inside of {}

static site generators -
JAMStack.org - modern web dev architecture based on client-side js, reusable apis and prebuilt markup
J - javascript
A - APIs
M - markup

NOT jamstack -
server side cms - wordpress, drupal, joomla, squarespace
monolithic server-run web app - ruby, node, etc
single page app - isomorphic rendering

benefits -
performance - prebuilt files served over cdn
security - microservices reduce surface area for attacks
scaling - serve files
dev experience - loose coupling, separation of controls

architecture advice for 2019: react + mobx + apollo/graphql
mobx - state management - observable, computed, reactions (side effects),
apollo/graphql - move data between app and cloud
apollo - impl of graphql
strongly typed query language
tools like playground - ide
remove need to write action/creators/reducers/middleware
Apollo engine - monitoring and analytics
declarative data fetching
example fetch
const GET_DOGS = gql`
  query {
    dogs {
      id
      breed
      image {
        url
      }
      activities {
        name
      }
    }
  }
`;

state management - redux
mobx

pwa - progressive web apps - hybrid of regular webpage and mobile app
utilizes new browser features like service workers and web app manifests
term coined by goog chrome dev alex russell and designer frances berriman
app manifest makes app searchable
uses push notifications
can launch from home screen
not distributed through app store

web servers - apache https server, nginx, iis
node can be substitute

gulp for build and task automation

WPO - web performance optimization

Tools

API browsing/docs
Dash
devdocs
velocity
zeal

SEO tools
goog webmasters search console
Varvy SEO tool
keyword tool

prototyping
axure
balsamiq
justinmind
moqups
proto.io
UXPin

Diagramming
draw.io
Cacoo
sketchboard.io
gliffy

http tools
chrome dev tools network panel
charles
insomnia
mitmproxy
Paw
Postman

editors:
atom, sublime
webstorm
vs code

shareable & runnable
codepen
jsbin.com
jsfiddle.net
glitch

browser tools
history.js
html2canvas
platform.js
URI.js


SEO

Keywords

Sitemap - xml copy of sitemap submit to search engine

robots.txt - disallow folders with irrelevant content

Html - include keywords

 Improve url structure

 Use <meta> descriptions on all pages

 Relevant <title>s for each page

 <h1> relevant and structured

 <img> - include descriptions

404 handle all 404 errors

Links - to websites with similar content - improves rank

rel=“nofollow” in <a> tags

article: avoid loops in js
for and while too low-level for common tasks

use array methods - map
find - returns first match of predicate
some  - match predicate for some array elements
every - predicate true for all elements
forEach - doesn't return value - for side-effects

exceptions: sometimes loops better than array methods
so use own judgement
reduce() tends to be difficult to read

for object iteration,
there is no "map" in vanilla
can use lodash mapValues
or Object.keys() Object.values() Object.entries()
extracts the array

array methods slow?
yes, but not noticeable unless working with millions of items

Intro to graphql

Open source query language

Could replace rest apis (rest based on http methods)


“Graph” refers to nodes and edges


problem: Rest apis convoluted

Solution:

1. Strongly typed

2.  Readable

3.  Compatible

4.  Single endpoint

6.  Self-documenting


Basic example:

query{
  user(id:"1"){
    users{
      tweet{
        content
      }
    }
   }
  }

article: async and await
evolution:
async js:
first callbacks
then promises
now asynchronous functions

async functions always return promises

return await does nothing

for thrown errors, use catch

Promise.all for allowing multiple async functions to run in parallel
but still treating the block of functions as synchronous

article: UI Animation in React
CRA - create react app
creates basic react app with components
styled-components - wrapping css styling around components, theme injection
"when something changes, it's an opportunity to use animation"

in js file, create object with a set of CSS keyframes
const keyframes = {
  show: `@keyframes show {
    to {
      opacity: 1;
      transform: none;
    }
  }`
}
to state usage means starting state will be "implied"
then create animations object
const animations = {
  show: `
    animation: show 500ms ease-out forwards;
    ${keyframes.show}
  `
}
keyframes "bundled" along with the animation object

css
can use animations.show in css style
animation-delay - times the animation delay
transform

react animation - library
1. npm install -S react-animation
-S flag -
<AnimateOnChange> component - default - fade out fade in
bounceIn bounceOut options animationIn animationOut props
durationOut property - control how fast the animationOut animates
<HideUntilLoaded>  - hold back until ready i.e. images

GatsbyJS

Free and open source fx based on react
“Blazing fast websites and apps”

Why fx on top of fx?
Asked about next.js also

Gatsby is a static PWA generator
Code and data splitting out of box

Static sites - not rendered during runtime

Generate html content on client side during run time, generate on server during build time
When loaded, react takes over


Diff from server-side rendering?

No server side code

All rendering done during build time


Gatsby cli

running in debug mode,


Why gatsby?

Uses graphql

Strong ecosystem


Creates folder structure for you

Handles routing


Image component notable

Optimizes image,

Creates multiple versions of it

Lazy loads at runtime


“Downside of no server: searches aren’t straightforward”

ARTICLE: css position: sticky
a hybrid of relative and fixed
where when the element is scrolled to the specified position it changes to fixed behavior

ARTICLE: 60fps css animations
Use transform and opacity to achieve

ARTICLE: vs code - minimap - use color blocks instead of text
several settings in jsconfig.json
{
  "compilerOptions": {
    "baseUrl": "src/",
    "target": "esnext",
    "module": "commonjs"
  },
  "exclude": [
    "node_modules",
  ]
}
could be a good start

settings - theme
in workspace settings tab, you can override user settings
vscode intellisense helps with remembering prop/val names
workbench colorTheme and iconTheme

ligature - a binding, connector

install a font on ubuntu manually: open the ttf files in font viewer and upper right corner there is an "install" button
in settings, use editor.fontFamily
and another flag to enable ligatures
!=, => get ligaturized

Emmet - plugin for text editors - helps with html and css editing
comes with vscode Out of box

enable breadcrumbs
breadcrumbs.enabled
my vsc may be outdated as it doesn't recognize breadcrumbs

minimap came from sublime text

keyboard shortcut to switch between editor and explorer
alt-shift e?

cursor smooth caret animation - must be a newer feature

ARTICLE: svelte 3
what is svelte? UI framework

inspired by react and vue

created by Rich Harris

use "degit" scaffolding package to get started

package.json no deps only devdeps

root component App.svelte

on:eventName - for events

conditional rendering done with {if ...} {:else if ...} {/if}

2 way binding

Article: Typescript 3.0 - “Unknown” type

Type-safe counterpart of “any”


Unknown less permissive than any


Checks made before working with unknown but not any


Any: history

Represents all js values

Since first release in 2012


Top type, universal super type


all types can be assigned to unknown also


But assigning value of type unknown to variables of other types causes error


All operations on the unknown var causes error


So flipped default from permitting everything to permitting almost nothing


In methods using unknowns use typeof x === “type”

Or value instanceOf  to narrow the type of the unkonwn down


Type assertion

Const some string: string = value as string;


In union types unknown absorbs all types except any


In intersection types, every type absorbs unknown


Real-life example

Reading input from local storage


After JSON.parse, return an unknown

Article:
site with a TIL every day?

https://www.matuzo.at/til/


Sass - maybe preferable to less?

Supports random

e.g. Random color every time you compile sass


Css tab-size property controls size of tab character


element Focus() method can be passed an object with preventScroll property


navigator.connection - can get info about connection


Center a flex-item vertically and horizontally by applying margin: auto;

ARTICLE:
10 reasons to learn dart
dart familiar to many devs object orientation
one of best languages to learn in 2019
good first lang
developed by Goog
approved as standard by ECMA
web server, desktop & mobile
TL;DR version
0. Dart is really flexible
1. Dart embraced the open source ecosystem
2. Dart solved a lot of problems, efficiently
3. Dart is a good first language
4. Dart has great tooling support
5. Dart is a robust language
6. Dart ensures productivity
7. Dart is used by Flutter
8. Dart is backed by a tech giant
9. Dart solved a lot of problems, efficiently
started in 10/2011
intended as replacement for JS
interest in Dart only took off when flutter project got more popular
flutter inspired by react native

ARTICLE: nodejs battle city remake
uses Object prototypes
animations not using setinterval
require js used for modules
intersection calculation logics
russian comments
every object gets an x and y
uses function closures to represent object "classes"
very object oriented
emit method - for triggering events?
single file, keyboard.js
contains all the controls logic
uses web sockets for net play
attempting to convert ot react js

ARTICLE: typescript the language to learn of 2019 (actually Langs analysis)

other type systems for JS Flow, Reason

#3 most loved prog. Lang on stack overflow

Python # 2

Go for microservices

Kotlin # 4

python, perl, Ruby - slow, human friendly

js - human friendly - slightly slow

Go moderately fast, very friendly

Java, like go but less friendly

C super fast, not fun

C++ slightly more fun

Kubernetes built with Go

GraphQL to revolutionize api

Solidity for blockchain

Ethereum - leader for decentralized applications


ARTICLE: css-tricks - inputmode

attribute to decide which keyboard to use when user selects input or textaraea

supported by safari for ios and chrome for android
recently

inputmode: none shows no keyboard at all
intended for rendering own keyboard

inputmode=numeric

inputmode=email brings @ into tray

input mode url brings / in and .com

input mode search changes return into go

ARTICLE: What's next for css?
all can be used with POSTCSS PLUGIN
stage 3:
"all" property - allow you to reset all properties of alement
a {
  all: initial;
}

break props - break behavior control
break-inside, break-before, break-after

custom props -
  --some-length: 30px;
  height: var(--some-length);

font-variant for using alternative glyphs
font-variant: small-caps

gap property for "gutters in layout"
gap: 20px;
column-gap: 40px;
row-gap: 20px;

grid layout
display:grid
grid-template-columns: 100px 100px 100px;
grid-gap: 10px;

media query ranges
@media (480px <= width <= 768px)

STAGE 2
:any-link - psuedo-class for a elements (independent of visited)
nav :any-link > span

case-insensitive attributes

color-adjust: force printing of background colors and images
color-adjust: economy
color-adjust: exact

:dir directionality pseudo-class
blockquote:dir(rtl) {
 margin-right: 10px;
}

double position gradients - use two positions in a gradient

pseudo-class - :focus-visible
match focus elements that that indicate focus to user

gray() function - fully desaturated colors
color: gray(50);

:has() relational pseudo-class match ancestor and sibling
a:has(> img)

hexadecimal alpha notation (add 4 and 8 char notation that includes opacity )
background-color: #f3f3f3f3;
color: #0003;

hwb() function - hue whiteness blackness
color: hwb(120 44% 50%)

image-set() specify image sources based on user's res
background-image: image-set(
  "foo.png" 1x,
  "foo-2x.png" 2x,
  "foo-print.png" 600dpl
)

:in-range and :out-of-range for input elements that have range limitations
input:in-range
input:out-of-range

lab() colors (CIE lab color space)

lch() colors (CIE lab chrome and hue)

:matches()
:not() pseudoclass
TODO: continue at cssdb.org


ARTICLE: folding the dom

Browsers have a capable 3d css engine


A 3d FPS was built with it


DEMO:  Fold up an image


Applications:

Unfold image once its ready


game dev


IMPL: use 2 images

Each has half of the full image

Use same image twice and use background-position to tweak the location

Background-position: ‘0 x%’


Transform: rotates;

Add

Perspective: 500px to parent container to give the rotation a more 3d feel

Smaller the number the more intense the feel


Transform-origin property useful!  Determine where on the object to orient the rotation

Default center


Auxiliary properties

Backface-visibility - should item be visible when rotated more than 90 deg either direction

Transform-style: preserve-3d - position elements in 3d spaces

Opacity can be used to mimic shadows


ARTICLE:
Use akita as state management solution

Akita is vet in field

has backing of Datorama

Easy to learn

can be used with react, due, svelte, angular, and vanilla

0 bugs policy

Well documented

320k downloads

Community

object oriented

Easy to find akita devs

Plugins

ARTICLE: FE documentation, style guides, and MDX
1.  documentation important
2.  markdown alternative to authoring HTML
3.  mdx is same syntax as markdown but can import jsx and embed directly
4.  docusaurus - tool made by faccebook, used for documentation (obv)
5.  more tools for documenting components:  storybook, docz, styleguidist

SITE: coderbyte: "guaranteed to make you a better coder"
first problem: implement factoral

ARTICLE:
Frontend

Article:  migrate from HOC to hooks

HOC:  function that accepts component then returns component that adds extra props or capabilities


Add hook to HOC

Function Comp () {

Const hookData = useMyHook();

Return <Comp …{hookData} {…props} />

}


Hook lifecycles

“Lazy initializers”

 render

 React updates DOM

 Cleanup layout effects

 Run layout effects

 Paint screen

 Cleanup effects

 Run effects


ComponentDidMount and componentWillUnmount-> useEffect


ARTICLE: lighthouse for performance budgeting
two types of budgets
1.  # of resources
e.g. limit number of js files to be loaded
2.  size of resources
e.g. limit js size to 500kb
configure in budget.json file
