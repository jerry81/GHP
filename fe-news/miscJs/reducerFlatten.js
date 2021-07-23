const original = [
  ['a', 'b'],
  ['c', 'd']
];
function reducer(acc, cur) {
  acc = [...acc, ...cur];
  return acc;
}
const reduced = original.reduce(reducer, []);
console.log("reduced", reduced);


const str = 'we want to make sure that whether the letter is uppercase or lowercase, we still only count it once. For example a and A would could as two "a"s, not one uppercase A and one lowercase a.'
asList = str.split('')

function countCharCount(acc, cur) {
  if (!acc[cur]) {
    acc[cur] = 1
  } else {
    acc[cur]++
  }
  return acc
}
const countMap = asList.reduce(countCharCount, {})
console.log('countMap is ', countMap)

const el = document.querySelector('#countMapOutput')
el.innerHTML = JSON.stringify(countMap)