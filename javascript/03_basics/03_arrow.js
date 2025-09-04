
// function chai(){
//     console.log(this)
//     console.log(this.username)
// }
// chai()

const sum = (a, b) => {
  return a + b;
}

// console.log(sum(45, 67))


function myFunc(theObject) {
  return theObject.make = "Toyota";
}

const myCar = {
  make: "Honda",
  model: "Accord",
  year: 1998,
};


const withoutreturn = (a , b) => ( a + b);
// console.log(withoutreturn(45,55)) 

// return object 
const withoutreturnObject = () => ({name : "Huzafia"})
console.log(withoutreturnObject())
// console.log(myCar.make); // "Honda"
// console.log(myFunc(myCar)); // Toyota => defalult 


// function loop(x) {
//     if( x >= 10){
//         console.log(x)
//         return;
//     }
//     loop( x + 1);
// }
// loop(0)

// arrow  functions 
const materials = ["Hydrogen", "Helium", "Lithium", "Beryllium"];

const getData = materials.map((m)=> m.at(-1)) // get get last char
const getlength = materials.map((m)=> m.length) // get length 

// console.log(getData)
// console.log(getlength)


