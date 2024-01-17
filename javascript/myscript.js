let username = 'Gaurav'


// function fun(){
//     console.log("I am clicked")
// }

// let fun = function(){
//     console.log("I am clicked")
// }

// let fun = function abc(){
//     console.log("I am clicked")
// }

let fun = () => {
    console.log("I'm clicked")
}

// arrays 

let users = ['Gaurav','Javed','Karan','Priya']

// let users = new Array();

users.push('Tushar');

// for(let i=0; i< users.length; i++){
//     console.log(users[i])
// }

// for(let user of users){
//     console.log(user)
// }

users.forEach(user => console.log(user))

// Object

// class Person{

//     name;
//     age;
//     city;

//     constructor(name,age,city){
//         this.name=name;
//         this.age=age;
//         this.city=city;
//     }

//     greet(){
//         console.log('Hello everyone')
//     }
// }

// let person1 = {
//     name:'Harsh',
//     age:25,
//     city:'Bangalore',

   
// }

let person2 = {
    name:'Mohit',
    age:28,
    country:'India',

    sayHello(){
        console.log('Hello everyone')
    }
}

person1.city="Delhi";
person1.email="harsh@yahoo.com";

let person3 = new Person('Rohan',30,'Kolkata');

console.log(person1)
console.log(person2)
console.log(person3)