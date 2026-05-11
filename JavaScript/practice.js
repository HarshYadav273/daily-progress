let sentence = "   javascript is awesome   ";
let clean = sentence
  .trim()
  .split(" ")
  .map((w) => w.charAt(0).toUpperCase() + w.slice(1))
  .join(" ");
console.log(clean);

let count = 0;
for (let ch of sentence) {
  if (ch === "a") count++;
}
consoles.log(count);
