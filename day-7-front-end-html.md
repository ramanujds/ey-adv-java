## Introduction To Web Development (HTML5 and CSS 3)


### 1. How Web Applications Work:

Web applications function through a client-server model. The client is the user's device, typically a web browser, and the server is where the application is hosted. Here's a simple breakdown:

- **Client-Side (Frontend):**
  - The user interacts with the web application through a browser.
  - HTML (Hypertext Markup Language), CSS (Cascading Style Sheets), and JavaScript are used to create the user interface and handle client-side logic.
  - The browser sends requests to the server for resources or data.

- **Server-Side (Backend):**
  - The server receives requests from clients and processes them.
  - Server-side languages like Python, Ruby, Node.js, or PHP handle logic, database queries, and other backend tasks.
  - The server sends back HTML, CSS, and JavaScript to the client, along with any requested data.

- **Database:**
  - Web applications often interact with databases to store and retrieve data.
  - Servers communicate with databases using languages like SQL.
  - This interaction allows for dynamic content generation and storage of user-specific information.

### 2. An Introduction to HTML and CSS:

- **HTML (Hypertext Markup Language):**
  ```html
  <!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My First Web Page</title>
  </head>
  <body>
    <h1>Welcome to My Web Page!</h1>
    <p>This is a paragraph of text.</p>
    <img src="image.jpg" alt="Description of the image">
  </body>
  </html>
  ```

- **CSS (Cascading Style Sheets):**
  ```css
  body {
    font-family: Arial, sans-serif;
    background-color: #f0f0f0;
    margin: 20px;
  }

  h1 {
    color: #0066cc;
  }

  p {
    font-size: 16px;
    line-height: 1.5;
  }
  ```

### 3. Tools for Web Development:

- **Text Editor:** Visual Studio Code, Sublime Text
- **Version Control:** Git
- **Package Manager:** npm (Node Package Manager)
- **Web Browsers:** Chrome Developer Tools, Firefox Developer Tools
- **Frameworks/Libraries:** React, Angular, Vue.js

### 4. How to View Deployed Web Pages:

1. **Domain Name:**
   - Type the domain (e.g., www.example.com) in the browser.

2. **IP Address:**
   - Enter the IP address of the server hosting the web page in the browser.

3. **Localhost:**
   - If developing locally, use localhost or 127.0.0.1.

### 5. Some Critical Web Development Issues:

- **Security:**
  - Protect against SQL injection, Cross-Site Scripting (XSS), Cross-Site Request Forgery (CSRF), etc.

- **Performance:**
  - Optimize code, use CDNs for assets, minimize HTTP requests.

- **Scalability:**
  - Design applications to handle increased load.

- **Responsive Design:**
  - Ensuring the web application looks and functions well on various devices and screen sizes.

- **Cross-Browser Compatibility:**
-  Ensuring web applications work consistently across different browsers.  



## HTML Basics:

HTML (Hypertext Markup Language) is the standard markup language for creating web pages. It provides a structure for content on the web. HTML documents consist of elements, which are marked up using tags. Tags are enclosed in angle brackets (< >) and usually come in pairs – an opening tag and a closing tag.

```html
<!DOCTYPE html>
<html>
<head>
    <!-- Metadata, CSS, and other head elements go here -->
</head>
<body>
    <!-- Content of the web page goes here -->
</body>
</html>
```

**Syntax:**
HTML syntax involves using tags to define elements. Tags can have attributes, which provide additional information about an element.

```html
<!-- Example: An anchor (link) with an attribute -->
<a href="https://www.example.com">Visit Example.com</a>
```

**Head:**
The `<head>` element contains metadata about the HTML document, such as the title, character set, and linked stylesheets.

```html
<head>
    <title>My Web Page</title>
    <meta charset="UTF-8">
    <!-- Other head elements like stylesheets and scripts go here -->
</head>
```

**Body:**
The `<body>` element contains the content of the web page, including text, images, links, and other elements.

```html
<body>
    <h1>This is a Heading</h1>
    <p>This is a paragraph of text.</p>
    <!-- Other content goes here -->
</body>
```

**Title:**
The `<title>` element sets the title of the HTML document, which appears in the browser's title bar or tab.

```html
<title>My Web Page</title>
```

**Lists and Links:**
HTML supports ordered lists `<ol>`, unordered lists `<ul>`, and list items `<li>`. Links are created using the `<a>` (anchor) tag.

```html
<!-- Unordered List -->
<ul>
    <li>Item 1</li>
    <li>Item 2</li>
</ul>

<!-- Ordered List -->
<ol>
    <li>First</li>
    <li>Second</li>
</ol>

<!-- Link -->
<a href="https://www.example.com">Visit Example.com</a>
```

**Images:**
Images are included using the `<img>` tag. The `src` attribute specifies the source (URL or file path) of the image.

```html
<img src="image.jpg" alt="Description of the image">
```

**Tables:**
Tables are created using the `<table>` tag, with rows represented by `<tr>`, headers by `<th>`, and data cells by `<td>`.

```html
<table>
    <tr>
        <th>Header 1</th>
        <th>Header 2</th>
    </tr>
    <tr>
        <td>Data 1</td>
        <td>Data 2</td>
    </tr>
</table>
```

**Forms:**
Forms are used for user input and created with the `<form>` tag. Input elements like text fields, checkboxes, and buttons are used within the form.

```html
<form action="/submit" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username">

    <label for="password">Password:</label>
    <input type="password" id="password" name="password">

    <input type="submit" value="Submit">
</form>
```

**How to use the HTML5 features for data validation:**

HTML5 introduced several features for client-side data validation, reducing the need for JavaScript and providing a better user experience. Here are some key attributes and elements for data validation:

**1. Input Types:**

HTML5 introduced new input types that come with built-in validation:

- **Text Input with Pattern:**
```html
<input type="text" pattern="[A-Za-z]{3}" title="Three letter word">
```

- **Email Input:**
```html
<input type="email" required>
```

- **Number Input:**
```html
<input type="number" min="1" max="100" step="1">
```

**2. Required Attribute:**

The `required` attribute ensures that the user must fill out the input field before submitting the form.

```html
<input type="text" required>
```

**3. Min and Max Attributes:**

Used with number inputs, the `min` and `max` attributes define a range for acceptable values.

```html
<input type="number" min="18" max="99">
```

**4. Pattern Attribute:**

The `pattern` attribute allows you to specify a regular expression for pattern-based validation.

```html
<input type="text" pattern="[0-9]{3}" title="Three-digit number">
```

**How to use the HTML5 controls:**

HTML5 introduced new form elements and attributes to enhance user interaction. Here are some key HTML5 controls:

**1. Date Input:**

Allows users to pick a date from a date picker.

```html
<label for="birthday">Birthday:</label>
<input type="date" id="birthday" name="birthday">
```

**2. Range Input:**

Creates a slider control for selecting a value from a range.

```html
<label for="volume">Volume:</label>
<input type="range" id="volume" name="volume" min="0" max="100">
```

**3. Color Input:**

Provides a color picker for selecting a color.

```html
<label for="color">Favorite Color:</label>
<input type="color" id="color" name="color">
```

**4. Meter Element:**

Represents a scalar measurement within a known range.

```html
<meter value="70" min="0" max="100">70%</meter>
```

**5. Progress Element:**

Displays the completion progress of a task.

```html
<progress value="50" max="100">50%</progress>
```

**6. Output Element:**

Used to represent the result of a calculation or user action.

```html
<form oninput="result.value=parseInt(a.value)+parseInt(b.value)">
    <input type="range" id="a" value="50">+
    <input type="number" id="b" value="50">
    =<output name="result" for="a b">100</output>
</form>
```
