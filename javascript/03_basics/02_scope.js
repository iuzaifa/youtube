

// 1. GLOBAL SCOPE
// Variables declared outside functions or blocks are globally accessible.
let globalVar = "I am Global";

function showGlobal() {
    // console.log("Inside function:", globalVar); // Accessible
}

showGlobal();
// console.log("Outside function:", globalVar); // Accessible



// 2. FUNCTION SCOPE
// Variables declared inside a function are only accessible within it.
function myFunctionScope() {
    let localVar = "I am Local (Function Scope)";
    // console.log("Inside function scope:", localVar); // Accessible
}

myFunctionScope();
// console.log(localVar); // Error: localVar is not defined



// 3. BLOCK SCOPE (let / const)
// Variables declared with let or const inside {} are only accessible there.
if (true) {
    let blockVar = "Inside Block (let)";
    const anotherBlockVar = "Inside Block (const)";
    // console.log("Inside block:", blockVar, ",", anotherBlockVar); // Accessible
}

// console.log(blockVar); // Error: blockVar is not defined
// console.log(anotherBlockVar); // Error: anotherBlockVar is not defined



// 4. var is NOT Block Scoped
// var ignores block boundaries, only respects functions.
if (true) {
    var testVar = " Declared with var";
}
// console.log("Outside block (var leaks):", testVar); // Still Accessible



// 5. LEXICAL SCOPE (Closure)
// Inner functions can access variables of their outer functions.
function outer() {
    let outerVar = "Outer Variable";

    function inner() {
        // console.log("Inner accessing outerVar:", outerVar); // Accessible due to closure
    }

    inner();
}

outer();



// BLOCK SCOPE EXAMPLE
let a = 230;
let b = 34;

{
    // These 'a' and 'b' are different (block scoped)
    let a = 345;
    let b = 456;
    // console.log(a) // 345 (block variable)
    // console.log(b) // 456 (block variable)
}

// Outside the block → original values are accessible
// console.log(a) // 230
// console.log(b) // 34



// FUNCTION SCOPE + LEXICAL SCOPE (Closure)
function one() {
    const username = 'huzaifa';

    function two() {
        const website = 'youtube';
        // console.log(website)  // Accessible here
        // console.log(username) // Accessible (lexical scope: inner can use outer)
    }

    // console.log(website) //  Error: website not defined (only inside two)
    two();
}
one();



// HOISTING WITH FUNCTIONS

// Function declaration is hoisted → you can call it before it's defined
add(5) // Works (because function declarations are hoisted)

function add(num) {
    return num + 1;
}

// console.log(add(5)); // 6



// HOISTING WITH FUNCTION EXPRESSIONS

// Function expressions (assigned to const/let/var) are NOT hoisted
// console.log(addnums(5)) //  Error: Cannot access 'addnums' before initialization

const addnums = function (num) {
    return num + 2;
}

// console.log(addnums(5)); // 7


