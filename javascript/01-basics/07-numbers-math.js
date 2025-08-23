// 07-numbers-math.js
// ===== Numbers and Math in JavaScript =====


// Numbers
let intNum = 123.5;              // Integer
let floatNum = 3.14;          // Floating-point
let big = 12345678901234567890n; // BigInt (add n at end)


console.log("Integer:", intNum);
console.log("Float:", floatNum);
console.log("BigInt:", big);



// Special Numbers
console.log("Infinity:", 1 / 0);                // Infinity
console.log("-Infinity:", -1 / 0);              // -Infinity
console.log("NaN (Not a Number):", "abc" * 3);  // NaN



console.log("toFixed(2):", intNum.toFixed(2)); 
console.log("toPrecision(4):", intNum.toPrecision(4)); // "123.5"

console.log(Math.random() * 1 + 1)