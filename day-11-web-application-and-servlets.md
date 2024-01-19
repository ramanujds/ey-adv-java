### How the Web Works:


![HTTP Architecture](https://media.geeksforgeeks.org/wp-content/uploads/20230521175108/ImageOfHTTPRequestResponse-1024x580.webp)



The World Wide Web is a system of interconnected documents and resources linked by hyperlinks and URLs. Key components include:

- **Web Browser:** Software that retrieves and displays web pages. Common browsers include Chrome, Firefox, and Safari.
  
- **Web Server:** A server hosting websites and responding to client requests. Examples include Apache and Nginx.

- **DNS (Domain Name System):** Translates domain names into IP addresses, enabling browsers to locate web servers.

- **HTTP (Hypertext Transfer Protocol):** The foundation of data communication on the web. It defines how messages are formatted and transmitted.

### Thin Clients:

- **Definition:** Thin clients are devices that rely on a server to perform most of their processing tasks.

- **Characteristics:**
  - Limited local processing power.
  - Dependence on a server for applications and data.
  - Common in cloud computing and virtual desktop environments.

### TCP/IP:

- **Definition:** Transmission Control Protocol/Internet Protocol is the suite of communication protocols used for internet connectivity.

- **Key Protocols:**
  - **TCP (Transmission Control Protocol):** Ensures reliable and ordered delivery of data.
  - **IP (Internet Protocol):** Routes data packets between devices on a network.

### HTTP (Hypertext Transfer Protocol):

- **Definition:** HTTP is an application layer protocol for transmitting hypermedia documents, such as HTML.

- **Key Features:**
  - Stateless: Each request is independent.
  - Connectionless: No persistent connection between client and server.
  - Request-Response Model: Client sends a request, and the server sends a response.

### Servlet Basics:

#### Overview: How Servlets Work:

![Servlet Architecture](https://www.testingdocs.com/wp-content/uploads/Java-Servlet-Architecture.png)

- **Definition:** Servlets are Java-based components that extend the functionality of servers to generate dynamic content.

- **Lifecycle Methods:**
  - **init():** Initializes the servlet.
  - **service():** Handles client requests.
  - **destroy():** Cleans up resources.

#### Core Servlet API:

- **`javax.servlet` Package:**
  - **Servlet:** Interface for generic servlets.
  - **ServletRequest:** Represents a client request.
  - **ServletResponse:** Represents a servlet response.
  - **ServletContext:** Provides information about the application.

### HTTP Servlets:

- **Definition:** Servlets that handle HTTP requests and responses.

- **Key Classes and Methods:**
  - **`HttpServlet` Class:** Extends the `GenericServlet` class.
  - **`doGet()` and `doPost()` Methods:** Handle GET and POST requests.
  - **`service()` Method:** Determines the HTTP method and calls appropriate method.

### Servlet to Servlet Communication:

- **Context Initialization Parameters:**
  - Set in `web.xml` or using annotations.
  - Shared configuration values among servlets.

- **RequestDispatcher:**
  - Forwards or includes requests to another servlet.
  - Facilitates communication between servlets.

**Example:**
```java
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set a parameter in the context
        getServletContext().setInitParameter("sharedParam", "SharedValue");

        // Forward the request to another servlet
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/SecondServlet");
        dispatcher.forward(request, response);
    }
}
```

```java
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the shared parameter from the context
        String sharedValue = getServletContext().getInitParameter("sharedParam");

        // Write the shared parameter to the response
        response.getWriter().println("Shared Parameter Value: " + sharedValue);
    }
}
```

**In addition to the `RequestDispatcher` for communication between servlets, here are some alternative methods:**

### 1. **HTTP Session:**

- **Description:**
  - The `HttpSession` interface allows servlets to maintain stateful information across multiple requests from the same client.
  - It's a server-side mechanism to store information associated with a specific client.

- **Example:**
  ```java
  // In FirstServlet
  HttpSession session = request.getSession();
  session.setAttribute("username", "John");

  // In SecondServlet
  HttpSession session = request.getSession();
  String username = (String) session.getAttribute("username");
  ```

### 2. **URL Rewriting:**

- **Description:**
  - URL rewriting involves appending data to URLs as query parameters.
  - Servlets can include information in the response that gets sent back to the client, and the client returns it with subsequent requests.

- **Example:**
  ```java
  // In FirstServlet
  String username = "John";
  response.sendRedirect("SecondServlet?user=" + username);

  // In SecondServlet
  String username = request.getParameter("user");
  ```

### 3. **Cookies:**

- **Description:**
  - Cookies are small pieces of data stored on the client's browser.
  - Servlets can set cookies in the response, and the client sends them back with subsequent requests.

- **Example:**
  ```java
  // In FirstServlet
  Cookie cookie = new Cookie("username", "John");
  response.addCookie(cookie);

  // In SecondServlet
  Cookie[] cookies = request.getCookies();
  String username = null;
  if (cookies != null) {
      for (Cookie c : cookies) {
          if (c.getName().equals("username")) {
              username = c.getValue();
              break;
          }
      }
  }
  ```

### 4. **Shared Database:**

- **Description:**
  - Servlets can communicate through a shared database.
  - Data is stored and retrieved from a database accessible by multiple servlets.

- **Example:**
  ```java
  // In FirstServlet
  // Store data in a shared database table

  // In SecondServlet
  // Retrieve data from the same database table
  ```

### 5. **ServletContext:**

- **Description:**
  - The `ServletContext` provides a way for servlets to share information at the application level.
  - Servlets can set and retrieve attributes from the `ServletContext`.

- **Example:**
  ```java
  // In FirstServlet
  getServletContext().setAttribute("sharedData", "SharedValue");

  // In SecondServlet
  String sharedValue = (String) getServletContext().getAttribute("sharedData");
  ```

![image](https://github.com/ramanujds/ey-adv-java/assets/42864715/8611460f-9d3b-4531-9809-87ec97fb4bb8)
