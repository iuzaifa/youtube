// ===== Type Conversion in JavaScript =====

// Example: String to Number
let score = "88";
console.log("score:", score, "| typeof:", typeof score);

let number = Number(score); // Convert string to number
console.log("After Number(score):", number, "| typeof:", typeof number);

// If string is not numeric
let wrong = "88abc";
console.log("wrong:", wrong, "| Number(wrong):", Number(wrong)); // NaN

// Boolean Conversion
console.log("\n==== Boolean Conversion ====");

// Numbers to Boolean
console.log("Boolean(1):", Boolean(1));   // true
console.log("Boolean(0):", Boolean(0));   // false
console.log("Boolean(-1):", Boolean(-1)); // true (any non-zero is true)

// Strings to Boolean
console.log("Boolean(''):", Boolean(""));         // false (empty string)
console.log("Boolean('huzaifa'):", Boolean("huzaifa")); // true (non-empty string)

// Null & Undefined to Boolean
console.log("Boolean(null):", Boolean(null));       // false
console.log("Boolean(undefined):", Boolean(undefined)); // false

// NaN to Boolean
console.log("Boolean(NaN):", Boolean(NaN)); // false

// Object and Array to Boolean
console.log("Boolean({}):", Boolean({}));   // true (object is truthy)
console.log("Boolean([]):", Boolean([]));   // true (array is truthy)


// String Conversion
console.log("\n==== String Conversion ====");
let val = 100;
console.log("String(100):", String(val), "| typeof:", typeof String(val));

console.log("String(true):", String(true));
console.log("String(false):", String(false));
console.log("String(null):", String(null));
console.log("String(undefined):", String(undefined));
