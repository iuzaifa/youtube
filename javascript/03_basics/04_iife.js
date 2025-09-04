


// IIFE (Immediately Invoked Function Expression)

// 1. Simple IIFE
(function() {
    console.log("IIFE runs immediately!");
})();

// 2. IIFE with Parameter
(function(name) {
    console.log("Hello, " + name + "!");
})("Huzaifa");

// 3. Arrow Function IIFE
(() => {
    console.log("Arrow Function IIFE executed");
})();

// 4. IIFE Returning a Value
const result = (function(a, b) {
    return a + b;
})(10, 20);
console.log("IIFE Result:", result); // 30

// 5. IIFE with Block Scope
let x = 100;
(function() {
    let x = 200;
    console.log("Inside IIFE:", x); // 200
})();
console.log("Outside IIFE:", x); // 100
