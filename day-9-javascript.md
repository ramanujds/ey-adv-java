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

## DOM Manipulation in Javascript

### 1. Introduction to DOM:

The DOM is a hierarchical representation of an HTML or XML document. It provides a structured way to access and manipulate the elements within a document.

### 2. Accessing Elements:

- **getElementById:**
  ```javascript
  let elementById = document.getElementById("exampleId");
  ```

- **getElementsByClassName:**
  ```javascript
  let elementsByClass = document.getElementsByClassName("exampleClass");
  ```

- **getElementsByTagName:**
  ```javascript
  let elementsByTag = document.getElementsByTagName("p");
  ```

- **querySelector:**
  ```javascript
  let element = document.querySelector("#exampleId .exampleClass");
  ```

### 3. Modifying Content:

- **innerHTML:**
  ```javascript
  element.innerHTML = "New content";
  ```

- **textContent:**
  ```javascript
  element.textContent = "New text content";
  ```

### 4. Modifying Attributes:

- **setAttribute:**
  ```javascript
  element.setAttribute("src", "newimage.jpg");
  ```

- **getAttribute:**
  ```javascript
  let srcValue = element.getAttribute("src");
  ```

### 5. Creating and Appending Elements:

- **createElement:**
  ```javascript
  let newElement = document.createElement("div");
  ```

- **appendChild:**
  ```javascript
  parentElement.appendChild(newElement);
  ```

### 6. Event Handling:

- **addEventListener:**
  ```javascript
  element.addEventListener("click", function() {
    console.log("Element clicked!");
  });
  ```

### 7. Style Manipulation:

- **style property:**
  ```javascript
  element.style.color = "blue";
  ```

### Example:

Consider the following HTML structure:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>DOM Manipulation Example</title>
</head>
<body>
  <div id="exampleDiv">
    <p class="exampleClass">Initial content</p>
    <button id="exampleButton">Click me</button>
  </div>

  <script src="script.js"></script>
</body>
</html>
```

Now, in your `script.js` file:

```javascript
// Accessing elements
let divElement = document.getElementById("exampleDiv");
let pElement = document.querySelector("#exampleDiv .exampleClass");
let buttonElement = document.getElementById("exampleButton");

// Modifying content
pElement.textContent = "Modified content";

// Creating and appending elements
let newParagraph = document.createElement("p");
newParagraph.textContent = "New paragraph";
divElement.appendChild(newParagraph);

// Event handling
buttonElement.addEventListener("click", function() {
  alert("Button clicked!");
});

// Style manipulation
newParagraph.style.color = "green";
```

## Javascript Form Validation

Form validation in JavaScript is crucial to ensure that the data submitted by users through a web form is accurate, complete, and meets certain criteria. Below is a simple example of form validation using JavaScript:

### HTML Form:

```html
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Form Validation Example</title>
  <style>
    .error {
      color: red;
    }
  </style>
</head>
<body>
  <form id="myForm" onsubmit="validateForm(event)">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name">

    <br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email">

    <br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password">

    <br>

    <input type="submit" value="Submit">
  </form>

  <script src="script.js"></script>
</body>
</html>
```

### JavaScript for Form Validation (`script.js`):

```javascript
function validateForm(event) {
  event.preventDefault(); // Prevents the form from submitting automatically

  // Get form elements
  let nameInput = document.getElementById('name');
  let emailInput = document.getElementById('email');
  let passwordInput = document.getElementById('password');

  // Get values
  let nameValue = nameInput.value.trim();
  let emailValue = emailInput.value.trim();
  let passwordValue = passwordInput.value.trim();

  // Reset previous error messages
  clearErrors();

  // Validate name
  if (nameValue === '') {
    displayError(nameInput, 'Name is required');
    return false;
  }

  // Validate email
  if (!isValidEmail(emailValue)) {
    displayError(emailInput, 'Invalid email address');
    return false;
  }

  // Validate password
  if (passwordValue.length < 6) {
    displayError(passwordInput, 'Password must be at least 6 characters');
    return false;
  }

  // If all validations pass, you can submit the form
  alert('Form submitted successfully!');
}

function isValidEmail(email) {
  // A simple email validation regex
  const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  return emailRegex.test(email);
}

function displayError(element, message) {
  let errorDiv = document.createElement('div');
  errorDiv.className = 'error';
  errorDiv.textContent = message;

  // Insert the error message after the input element
  element.parentNode.insertBefore(errorDiv, element.nextSibling);
}

function clearErrors() {
  let errorMessages = document.querySelectorAll('.error');
  errorMessages.forEach(function (errorMessage) {
    errorMessage.parentNode.removeChild(errorMessage);
  });
}
```

