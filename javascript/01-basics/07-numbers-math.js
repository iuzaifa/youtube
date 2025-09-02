// 07-numbers-math.js
// ===== Numbers and Math in JavaScript =====


// Numbers
// let intNum = 123.5;              // Integer
// let floatNum = 3.14;          // Floating-point
// let big = 12345678901234567890n; // BigInt (add n at end)


// console.log("Integer:", intNum);
// console.log("Float:", floatNum);
// console.log("BigInt:", big);



// // Special Numbers
// console.log("Infinity:", 1 / 0);                // Infinity
// console.log("-Infinity:", -1 / 0);              // -Infinity
// console.log("NaN (Not a Number):", "abc" * 3);  // NaN



// console.log("toFixed(2):", intNum.toFixed(2)); 
// console.log("toPrecision(4):", intNum.toPrecision(4)); // "123.5"

let n = 23.678;
n.toPrecision
// checks random numbers
// console.log(Math.random() * 1 + 1)

let m  = 45.6 + n;
// console.log(m.toPrecision)


// ======================== Math =========================================

// console.log(Math);/
// console.log(Math.abs(4)) // negetive to positive

// Rule of Math.round(number) in JavaScript:
// If the decimal part < 0.5 → rounds down.
// If the decimal part > 0.5 → rounds up.
// If the decimal part = exactly 0.5 → rounds up (to the higher integer).
// console.log(Math.round(4.6))
// console.log(Math.ceil(4.4)) // rounds up.
// console.log(Math.floor(4.3)) // rounds down.


// console.log(Math.random())
let r = Math.random() * 10 + 1
console.log(Math.floor(r))

const min = 10;
const max = 20;

console.log(Math.floor(Math.random() * (max - min + 1)) + min);



