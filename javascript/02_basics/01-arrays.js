

// advance tricks

let n = [1, 2, 3, 4];
let spread = [...n, 5,6];
let [a, b, ...rest] = n;

spread.push(99)
spread.unshift();

// console.log(spread)

// for(let [i, val] of spread.entries()){
//     console.log(i , val);
// }


// console.log(num) // undifined 
var num = 34; 
//let num = 45; // 'num' has already been declared
// const num = 99 // 'num' has already been declared

// console.log(num)


let newAr = [1,2,3,4,5];
console.log(newAr.at(-1)) // =. 5 
console.log(newAr.length)// =. 5


let sortedAsc = newAr.toSorted((a, b) => a - b); // Ascending → [1, 2, 5, 9]
let sortedDesc = newAr.toSorted((a, b) => b - a); // Descending → [9, 5, 2, 1]
console.log("ASC : " + sortedAsc)
console.log("DSC : " + sortedDesc)