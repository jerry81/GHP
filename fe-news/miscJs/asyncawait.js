async function wait(t) {
  return new Promise(res => {
    setTimeout(res, t);
  });
}
// without async await - 1 level of nesting
wait(5000).then(() => {
  console.log("im done");
});

// with async await - no nesting
(async () => { 
  await wait(2000);
  console.log("this is with async await");
})()


async function waitError(t) {
  return new Promise((_, rej) => {
    setTimeout(rej, t)
  })
}

async function testAwaitErr() {
  await waitError(1000).catch(() => {
    console.error('error occured')
  })
}

testAwaitErr()