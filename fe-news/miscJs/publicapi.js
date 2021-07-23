const base = 'https://cat-fact.herokuapp.com'
const facts = '/facts'
const wa = document.querySelector('#work-area')

let reader
async function getFact() {
  const res = await fetch(`${base}${facts}`)
  const factsArr = await res.json()
  console.log('factsArr', factsArr)
  factsArr.forEach((fact) => {
    wa.innerHTML += `<div>${fact.text}</div>`
  })
}
