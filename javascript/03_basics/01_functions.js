// Functions in JavaScript

// Function without return: just logs sum of two numbers
function addTwoNumners(number1, number2) {
    console.log(number1 + number2);
}

// Function with return: returns the sum of two numbers
function addNumbers(a, b) {
    let result = a + b;
    return result;
}

// Example usage (commented):
// let result = addNumbers(4, 7);
// console.log("Function 2 : " + result + " ,  typeof : " + typeof addNumbers) 


// Function with parameter validation
function logInUserMessage(username) {
    if (!username) {  // Checks if username is undefined, null, or empty
        console.log("Please enter user name")
        return
    }
    return `${username} just logged in user`;
}

// Example usage (commented):
// console.log(logInUserMessage(''))


// Spread Functions (...rest parameter)

// Accepts unlimited arguments and returns them as an array
function calculateCarPrice(...price) {
    return price;
}

// Accepts 2 fixed arguments, and the rest will be stored in an array
function calculateCarPrice2(val1, val2, ...price) {
    return price;
}

// Example usage (commented):
// console.log(calculateCarPrice(200, 4000, 56, 899.7));
// console.log(calculateCarPrice2(200, 4000, 56, 899.7));


// Passing Objects to Functions

const user = {
    username: 'Huzaifa',
    age: 23,
}

// Function that takes an object and logs its properties
function handleObject(anyObject) {
    console.log(`Username is ${anyObject.username} and age is ${anyObject.age}.`)
    return;
}

// Example usage (commented):
// console.log(handleObject(user)) // Username is Huzaifa and age is 23. 

// Directly passing object without creating a variable
// console.log({
//     username : 'usama',
//     age : 22
// }) //  username: 'usama', age: 22 


// Working with Arrays

const myNewArr = [200, 300, 100, 600, 400] // index 1 = 300

// Function returns the second element from an array
function returnSecoundValue(getArray) {
    return getArray[1];
}

// Example usage:
console.log(returnSecoundValue([22, 400, 600, 700])); // 400 
console.log(returnSecoundValue(myNewArr)) // 300
