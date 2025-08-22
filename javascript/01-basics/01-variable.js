// ---------------------------
// JavaScript Variable Example
// ---------------------------

// 1. const → Value cannot be changed
const accountId = 123;  

// 2. let → Preferred for variables that can change (block scoped)
let accountEmail = "huzaifa@gmail.com";

// 3. var → Old way (not recommended, function scoped)
var accountPassword = "234HH";

// 4. Without let/const/var → Becomes GLOBAL (not good practice)
accoutCity = "Jaipur";

// 5. Uninitialized variable → value will be undefined
let city;


// ---------------------------
// Output
// ---------------------------
console.log(accountId);          // 123
console.log(accountEmail);       // huzaifa@gmail.com
console.log(accountPassword);    // 234HH
console.log(accoutCity);         // Jaipur
console.log(city);               // undefined
