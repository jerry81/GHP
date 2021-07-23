const arrowFunctionRtObj = () => ({ prop1: 'prop1', prop2: 'prop2'})

function arrowFunctionTest() {
    console.log('returned is ', JSON.stringify(arrowFunctionRtObj()))
}