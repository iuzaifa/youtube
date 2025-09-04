// ==========================
// JavaScript Objects (with Indian / Muslim names)
// ==========================

// 1. Creating Objects
let obj1 = { name: "Ayaan", age: 25 };       // Object literal
let obj2 = new Object({ city: "Lucknow" });  // Constructor
let obj3 = {};                               // Empty object

// 2. Accessing Properties
console.log(obj1.name);       // Dot notation → "Ayaan"
console.log(obj1["age"]);     // Bracket notation → 25

// 3. Adding & Modifying
obj1.gender = "Male";         // Add new key
obj1.age = 26;                // Modify existing
console.log(obj1);            // { name: "Ayaan", age: 26, gender: "Male" }

// 4. Deleting
delete obj1.gender;
console.log(obj1);            // { name: "Ayaan", age: 26 }

// 5. Checking Keys
console.log("name" in obj1);  // true
console.log(obj1.hasOwnProperty("age")); // true

// 6. Iterating
let user = { id: 101, name: "Fatima", role: "Admin" };

for (let key in user) {
  console.log(key, user[key]); // Prints key & value
}

Object.keys(user).forEach(k => console.log(k));   // ["id","name","role"]
Object.values(user).forEach(v => console.log(v)); // [101,"Fatima","Admin"]
Object.entries(user).forEach(([k,v]) => console.log(k, v));
// [["id",101],["name","Fatima"],["role","Admin"]]

// 7. Nesting
let student = {
  name: "Rahman",
  marks: { math: 90, english: 85 }
};
console.log(student.marks.math); // 90

// 8. Methods inside Objects
let person = {
  firstName: "Zara",
  lastName: "Khan",
  fullName: function() {
    return this.firstName + " " + this.lastName;
  }
};
console.log(person.fullName()); // "Zara Khan"

// 9. Object Destructuring
let book = { title: "JS Guide", price: 299 };
let { title, price } = book;
console.log(title, price); // "JS Guide" 299

// Rename & default
let { title: bookTitle, author = "Unknown" } = book;
console.log(bookTitle, author); // "JS Guide" "Unknown"

// 10. Spread & Rest
let base = { a: 1, b: 2 };
let extended = { ...base, c: 3 };  // Copy & extend
console.log(extended); // {a:1, b:2, c:3}

let { a, ...others } = extended;
console.log(a, others); // 1 {b:2, c:3}

// 11. Object Methods
let obj = { x: 10, y: 20 };
console.log(Object.keys(obj));   // ["x","y"]
console.log(Object.values(obj)); // [10,20]
console.log(Object.entries(obj));// [["x",10],["y",20]]

let clone = Object.assign({}, obj); // Shallow copy
console.log(clone);

let frozen = Object.freeze({ z: 99 });
console.log(frozen.z);  // 99

let sealed = Object.seal({ k: 1 });
sealed.k = 2;           // Can modify existing
// sealed.newKey = 5;   ❌ Cannot add

// 12. this keyword
let car = {
  brand: "Tata",
  getBrand: function() {
    return this.brand;
  }
};
console.log(car.getBrand()); // "Tata"

// 13. Constructor Functions
function Animal(type) {
  this.type = type;
  this.speak = function() {
    console.log(`This is a ${this.type}`);
  };
}
let cat = new Animal("Billi");
cat.speak(); // "This is a Billi"

// 14. Classes (syntactic sugar)
class Student {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }
  intro() {
    return `${this.name} is ${this.age} years old`;
  }
}
let s1 = new Student("Imran", 21);
console.log(s1.intro()); // "Imran is 21 years old"

// 15. ES2022+ Features
let emp = { id: 1, name: "Ayesha", dept: "HR" };
console.log(Object.hasOwn(emp, "name")); // true

// 16. Optional Chaining & Nullish Coalescing
let order = { product: { name: "Laptop" } };
console.log(order.product?.name);   // "Laptop"
console.log(order.customer?.name);  // undefined (no error)
console.log(order.customer?.name ?? "Guest"); // "Guest"
// const tinderUser = new Object()
const tinderUser = {}

tinderUser.id = "123abc"
tinderUser.name = "Sammy"
tinderUser.isLoggedIn = false

// console.log(tinderUser);

const regularUser = {
    email: "some@gmail.com",
    fullname: {
        userfullname: {
            firstname: "hitesh",
            lastname: "choudhary"
        }
    }
}

// console.log(regularUser.fullname.userfullname.firstname);

const obj1 = {1: "a", 2: "b"}
// const obj2 = {3: "a", 4: "b"}
const obj4 = {5: "a", 6: "b"}

// const obj3 = { obj1, obj2 }
// const obj3 = Object.assign({}, obj1, obj2, obj4)

// const obj3 = {...obj1, ...obj2}
// console.log(obj3);


const users = [
    {
        id: 1,
        email: "h@gmail.com"
    },
    {
        id: 1,
        email: "h@gmail.com"
    },
    {
        id: 1,
        email: "h@gmail.com"
    },
]

users[1].email
// console.log(tinderUser);

// console.log(Object.keys(tinderUser));
// console.log(Object.values(tinderUser));
// console.log(Object.entries(tinderUser));

// console.log(tinderUser.hasOwnProperty('isLoggedIn'));


const course = {
    coursename: "js in hindi",
    price: "999",
    courseInstructor: "hitesh"
}

// course.courseInstructor

const {courseInstructor: instructor} = course

// console.log(courseInstructor);
console.log(instructor);

// {
//     "name": "hitesh",
//     "coursename": "js in hindi",
//     "price": "free"
// }

[
    {},
    {},
    {}
]