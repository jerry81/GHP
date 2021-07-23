const el = document.querySelector('#work')

let a = {}
let b = {}
const double = document.querySelector('#double')
const triple = document.querySelector('#triple')


double.innerHTML = JSON.stringify(a == b) 
triple.innerHTML = JSON.stringify(a === b) 

a = b
const doublea = document.querySelector('#doublea')
const triplea = document.querySelector('#triplea')

doublea.innerHTML = JSON.stringify(a == b) 
triplea.innerHTML = JSON.stringify(a === b) 

const obj = {
    count: 0
}

function add() {
    try {
   ++obj.count
   el.innerHTML = JSON.stringify(obj)
    } catch(e) {
        el.innerHTML = e
    }
}

function freeze() {
    Object.freeze(obj)
}

el.innerHTML = JSON.stringify(obj)


const cbrR = document.querySelector('#cbrR')
const cbvR = document.querySelector('#cbvR')
const cbrR2 = document.querySelector('#cbrR2')
const o1 = {
    a: 'a1'
}

const o2 = o1
o2.a = 'a2'

cbrR.innerHTML = `objects copy by ref: result is o1 ${JSON.stringify(o1)} and o2 ${JSON.stringify(o2)}`

const a1 = [1]
const a2 = a1
a2.push(2)

cbrR2.innerHTML = `arrays copy by ref: result is a1 ${a1} and a2 ${a2}`

let n1 = 1
let n2 = n1
++n2

cbvR.innerHTML = `numbers copy by val: result is n1 ${n1} and n2 ${n2}`