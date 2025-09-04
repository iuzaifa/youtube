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



// ===== JavaScript Type Conversion in Operations =====

console.log("=== Arithmetic with Type Conversion ===");

console.log("'5' + 5  =", "5" + 5);        // "55"  (string + number => string)
console.log("'5' - 2  =", "5" - 2);        // 3     (string -> number)
console.log("'5' * '2' =", "5" * "2");     // 10    (strings -> numbers)
console.log("'10' / 2 =", "10" / 2);       // 5     (string -> number)

console.log("10 + true =", 10 + true);     // 11    (true -> 1)
console.log("10 + false =", 10 + false);   // 10    (false -> 0)
console.log("10 + null =", 10 + null);     // 10    (null -> 0)
console.log("10 + undefined =", 10 + undefined); // NaN

console.log("\n=== Comparisons with Type Conversion ===");

console.log("5 == '5'   =", 5 == "5");     // true  (loose equality -> converts)
console.log("5 === '5'  =", 5 === "5");    // false (strict equality -> no convert)

console.log("true == 1  =", true == 1);    // true  (true -> 1)
console.log("false == 0 =", false == 0);   // true
console.log("null == undefined =", null == undefined); // true
console.log("null === undefined =", null === undefined); // false

console.log("NaN == NaN =", NaN == NaN);   // false
console.log("Object.is(NaN, NaN) =", Object.is(NaN, NaN)); // true

console.log("\n=== Truthy / Falsy in Conditions ===");

console.log("Boolean(0)   =", Boolean(0));    // false
console.log("Boolean(1)   =", Boolean(1));    // true
console.log("Boolean('')  =", Boolean(""));   // false
console.log("Boolean(' ') =", Boolean(" "));  // true
console.log("Boolean('huzaifa') =", Boolean("huzaifa")); // true
console.log("Boolean([])  =", Boolean([]));   // true
console.log("Boolean({})  =", Boolean({}));   // true

