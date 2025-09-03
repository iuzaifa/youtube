let myDate = new Date();

// Full Date object
console.log(myDate); // Example: 2025-09-03T16:10:15.123Z

// Convert to human-readable string
console.log(myDate.toString()); // Example: Wed Sep 03 2025 21:40:15 GMT+0530 (India Standard Time)

// Only the date (without time)
console.log(myDate.toDateString()); // Example: Wed Sep 03 2025

// ISO 8601 format (useful for APIs)
console.log(myDate.toISOString()); // Example: 2025-09-03T16:10:15.123Z

// Local date + time (based on your computer settings)
console.log(myDate.toLocaleString()); // Example: 9/3/2025, 9:40:15 PM

// Just the date in local format
console.log(myDate.toLocaleDateString()); // Example: 9/3/2025

// Just the time in local format
console.log(myDate.toLocaleTimeString()); // Example: 9:40:15 PM

// Unix timestamp (milliseconds since Jan 1, 1970)
console.log(myDate.getTime()); // Example: 1756927815123

// Year
console.log(myDate.getFullYear()); // Example: 2025

// Month (0-based, so January = 0, February = 1, etc.)
console.log(myDate.getMonth()); // Example: 8 (September)

// Date (day of the month)
console.log(myDate.getDate()); // Example: 3

// Day of the week (0 = Sunday, 1 = Monday, …, 6 = Saturday)
console.log(myDate.getDay()); // Example: 3 (Wednesday)

// Hours
console.log(myDate.getHours()); // Example: 21

// Minutes
console.log(myDate.getMinutes()); // Example: 40

// Seconds
console.log(myDate.getSeconds()); // Example: 15

// Milliseconds
console.log(myDate.getMilliseconds()); // Example: 123

// Type of myDate object
console.log(typeof myDate); // object


let weekDay = myDate.toLocaleString("en-US", { weekday: "long" }); 
let days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
console.log("weekDay "  + weekDay )