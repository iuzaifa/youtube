// 06-strings.js
// ===== String Operations in JavaScript =====

let name = "Huzaifa";
let age = 22;

// Concatenation
//console.log("Hello " + name + ", your age is " + age);

// Template Literals (ES6)
//console.log(`Hello ${name}, your age is ${age}`);

// String Properties
//console.log("Length of name:", name.length);
//console.log("First char:", name[0]);
//console.log("Last char:", name[name.length - 1]);

// String Methods
let str = "JavaScript is Awesome!   ";

//console.log("\n=== String Methods ===");
//console.log("Trim:", str.trim()); // remove space
//console.log("Uppercase:", str.toUpperCase());
//console.log("Lowercase:", str.toLowerCase());

//console.log("Slice (0,10):", str.slice(0, 13));
//console.log("Substring (0,10):", str.substring(0, 10));

console.log("Replace:", str.replace("Awesome", "Powerful"));
console.log("Includes 'Script':", str.includes("Script"));
console.log("StartsWith 'Java':", str.startsWith("Java"));
console.log("EndsWith '!':", str.endsWith("!"));
console.log("Split by space:", str.trim().split(" "));


// Immutable nature
let newStr = str.replace("JavaScript", "JS");
console.log("Original str:", str);   // unchanged
console.log("New str:", newStr);     // replaced


// Concatenation vs join
let part1 = "Hello";
let part2 = "World";
console.log("Concat:", part1.concat(" ", part2));
console.log("Join:", [part1, part2].join(" "));


// Character codes
console.log("\n=== Character Codes ===");
console.log("charCodeAt(0):", name.charCodeAt(0)); // ASCII/Unicode of H
console.log("fromCharCode:", String.fromCharCode(72)); // back to "H"