// closure application: private variables
// function inside of function
// inner function has access to outer function's variables
// return the inner function

function updateClosure(str) {
  let el = document.getElementById("closure");
  el.innerHTML = str;
}

function closure() {
  let cur = 0;
  updateClosure(cur)
  function incClosure() {
    cur++;
    updateClosure(cur);
  }
  return incClosure;
}

let incrementer = closure();

function incClosure() {
  incrementer();
}
