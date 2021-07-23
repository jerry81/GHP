const proper = document.querySelector("#proper");
proper.addEventListener("submit", function(e) {
  // typically this will redirect
  e.preventDefault();
  console.dir(e.currentTarget);
});
