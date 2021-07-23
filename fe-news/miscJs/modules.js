import { hello } from "./modules/util.js";

const tobeExported = "export me";
console.log("its working", tobeExported);

hello();

const el = document.querySelector('#loadgb')
el.addEventListener('click', loadGoodbye)
const gb = document.querySelector('#gb')


async function loadGoodbye() {
    const { goodBye } = await import('./modules/goodBye.js')
    gb.addEventListener('click', goodBye)
    console.log('async module loaded')
}
