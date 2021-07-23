const pr = new Promise((res, _) => {
  setTimeout(() => {
    console.log("promise success after 3 s");
    res();
  }, 3000);
});
pr.then(() => {
  console.log("after resolve");
});
console.log("immediately after");

const pr2 = new Promise(res => {
  setTimeout(() => {
    console.log("after 1 second, pr2");
    res();
  });
});
Promise.all([pr, pr2]).then(() => {
  console.log("all promises completed");
});
console.log("immediately after promise all");

Promise.race([pr, pr2]).then(() => {
  console.log("first completed");
});
console.log("immediately after promise race");

const pr3 = new Promise((_, rej) => {
  console.log("will reject in 3 s");
  setTimeout(() => {
    rej();
  }, 3000);
});
Promise.all([pr, pr2, pr3])
  .then(() => {
    console.log("all completed");
  })
  .catch(() => {
    console.error("promise all failed");
  });
Promise.allSettled([pr, pr2, pr3]).then(() => {console.log("all have settled, despite failing")});
