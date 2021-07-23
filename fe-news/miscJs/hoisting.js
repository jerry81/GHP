try { 
    console.log('funct as obj', asObj())
} catch (e) {
    console.error('error has occured', e)
}

console.log('with decl', withDecl())

const asObj = function () {
    console.log('i am in asObj')
}

function withDecl() {
    console.log('i am in withDecl')
    try {
    console.debug('var test ', notHoisted)
    } catch(e) {
        console.error('we tried to access variable declared with let')
    }
    console.debug('hosisted declared with var ', hoisted) // but it it is not initialized
}

let notHoisted = 'notHoisted'
var hoisted = 'hoisted'