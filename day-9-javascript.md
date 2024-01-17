JavaScript basics with examples:

1. **Variables and Data Types:**

   In JavaScript, you can use variables to store and manipulate data. Here's an example:

   ```javascript
   // Variable declaration
   let message;

   // Variable assignment
   message = "Hello, JavaScript!";

   // Display the value
   console.log(message);
   ```

   Data types include strings, numbers, booleans, arrays, and objects.

2. **Functions:**

   Functions allow you to group code into reusable blocks. Here's a simple function example:

   ```javascript
   // Function declaration
   function greet(name) {
       console.log("Hello, " + name + "!");
   }

   // Function invocation
   greet("John");
   ```

3. **Conditional Statements:**

   Conditional statements help execute different code based on conditions. Example:

   ```javascript
   let temperature = 25;

   if (temperature > 30) {
       console.log("It's a hot day!");
   } else if (temperature >= 20) {
       console.log("The weather is pleasant.");
   } else {
       console.log("It's a cold day!");
   }
   ```

4. **Loops:**

   Loops allow you to repeatedly execute code. Here's an example using a `for` loop:

   ```javascript
   // Loop to print numbers from 1 to 5
   for (let i = 1; i <= 5; i++) {
       console.log(i);
   }
   ```

5. **Arrays:**

   Arrays are used to store multiple values in a single variable. Example:

   ```javascript
   let colors = ["red", "green", "blue"];

   // Accessing array elements
   console.log(colors[0]); // Output: red

   // Modifying array elements
   colors[1] = "yellow";
   ```

6. **Objects:**

   Objects allow you to group related data and functions. Example:

   ```javascript
   let person = {
       name: "John",
       age: 30,
       greet: function() {
           console.log("Hello, my name is " + this.name + "!");
       }
   };

   // Accessing object properties and invoking a method
   console.log(person.name);   // Output: John
   person.greet();             // Output: Hello, my name is John!
   ```

7. **Event Handling:**

   JavaScript is often used to handle events on web pages. Here's a simple example using a button click:

   ```html
   <button id="myButton">Click me</button>

   <script>
       // Event handling
       document.getElementById("myButton").addEventListener("click", function() {
           alert("Button clicked!");
       });
   </script>
   ```

