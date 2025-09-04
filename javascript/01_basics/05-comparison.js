// ---------------------------
// Comparison Operators in JS
// ---------------------------

// 1. Greater than
console.log(4 > 6);   // false

// 2. Less than
console.log(4 < 6);   // true

// 3. Equal to (==) → compares only value, not type
console.log(5 == "5");  // true (values match, type ignored)

// 4. Strict Equal (===) → compares value AND type
console.log(5 === "5"); // false (number vs string)
console.log(5 === 5);   // true

// 5. Not Equal (!=) → compares only value
console.log(5 != "5");  // false (values same)

// 6. Strict Not Equal (!==) → compares value AND type
console.log(5 !== "5"); // true (different types)
console.log(5 !== 5);   // false

// 7. Greater than or equal to
console.log(6 >= 6);  // true

// 8. Less than or equal to
console.log(4 <= 6);  // true

// ---------------------------
// Special Cases
// ---------------------------

// null and undefined
console.log(null == undefined);   // true (loose equality)
console.log(null === undefined);  // false (strict equality)

// string vs number
console.log("10" > 5);  // true ("10" gets converted to number)
console.log("abc" > 5); // false (NaN compared to number)
