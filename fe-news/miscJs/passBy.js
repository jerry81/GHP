function p(input) {
  if (input.i) {
    input.i++;
  } else if (input.length != undefined) {
    input.push(2);
    console.debug("pushed item input now", input);
  } else {
    input++;
  }
}

function passByExps() {
  let input = 1;
  console.debug("passing int", input);
  p(input);
  console.debug("input is now ", input);
  input = {
    i: 1
  };
  console.debug("passing obj", input);
  p(input);
  console.debug("input is now ", input);
  input = [];
  console.debug("passing obj", input);
  p(input);
  console.debug("input is now ", input);
}

// conclusion - pass by value for primitive types
// pass by reference for objects and arrays
