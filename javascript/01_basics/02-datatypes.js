// JavaScript Data Types Demo

console.log("==== Primitive Data Types ====");

// 1. Number
let age = 25;
let price = 99.99;
let inf = Infinity;
let notNum = NaN;
console.log("Number examples:", age, price, inf, notNum);

// 2. String
let name = "Huzaifa";
let message = 'Hello';
let greeting = `Hi, ${name}!`;
console.log("String examples:", name, message, greeting);

// 3. Boolean
let isLoggedIn = true;
let isAdmin = false;
console.log("Boolean examples:", isLoggedIn, isAdmin);

// 4. Undefined
let x;
console.log("Undefined example:", x);

// 5. Null
let user = null;
console.log("Null example:", user);

// 6. Symbol
let id1 = Symbol("id");
let id2 = Symbol("id");
console.log("Symbol example: id1 === id2 ?", id1 === id2);

// 7. BigInt
let big = 1234567890123456789012345678901234567890n;
console.log("BigInt example:", big + 10n);


console.log("\n==== Non-Primitive (Reference) Data Types ====");

// 1. Object
let person = {
  name: "Huzaifa",
  age: 25,
  isAdmin: true
};
console.log("Object example:", person);

// 2. Array
let colors = ["red", "green", "blue"];
console.log("Array example:", colors);

// 3. Function
function greet(name) {
  return `Hello, ${name}`;
}
console.log("Function example:", greet("Huzaifa"));
