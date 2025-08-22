// ===== Primitive Data Types =====

// Number
let age = 25;
console.log("age:", age, "| typeof:", typeof age);

let price = 99.99;
console.log("price:", price, "| typeof:", typeof price);

let inf = Infinity;
console.log("Infinity:", inf, "| typeof:", typeof inf);

let notNum = NaN;
console.log("NaN:", notNum, "| typeof:", typeof notNum);

// String
let name = "Huzaifa";
console.log("name:", name, "| typeof:", typeof name);

let message = 'Hello';
console.log("message:", message, "| typeof:", typeof message);

let greeting = `Hi, ${name}!`;
console.log("greeting:", greeting, "| typeof:", typeof greeting);

// Boolean
let isLoggedIn = true;
console.log("isLoggedIn:", isLoggedIn, "| typeof:", typeof isLoggedIn);

let isAdmin = false;
console.log("isAdmin:", isAdmin, "| typeof:", typeof isAdmin);

// Undefined
let x;
console.log("x:", x, "| typeof:", typeof x);

// Null
let user = null;
console.log("user:", user, "| typeof:", typeof user); // object (special case)

// Symbol
let id1 = Symbol("id");
console.log("id1:", id1.toString(), "| typeof:", typeof id1);

// BigInt
let big = 1234567890123456789012345678901234567890n;
console.log("big:", big, "| typeof:", typeof big);


// ===== Non-Primitive Data Types =====

// Object
let person = { name: "Huzaifa", age: 25 };
console.log("person:", person, "| typeof:", typeof person);

// Array
let colors = ["red", "green", "blue"];
console.log("colors:", colors, "| typeof:", typeof colors);
console.log("Is Array?", Array.isArray(colors));

// Function
function greet(name) {
  return `Hello, ${name}`;
}
console.log("greet:", greet("Huzaifa"), "| typeof:", typeof greet);
