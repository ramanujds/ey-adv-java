## Introduction to Java

- **What is Java?**
  - Java is a high-level, versatile, and object-oriented programming language.
  - It was developed by Sun Microsystems (now owned by Oracle) and designed to be platform-independent.

- **Key Features:**
  - **Platform Independence:**
    - Code written in Java can run on any device with the Java Virtual Machine (JVM).
  - **Object-Oriented:**
    - Emphasizes the use of objects and classes for modular and reusable code.
  - **Automatic Memory Management:**
    - Java uses a garbage collector to automatically manage memory, reducing memory leaks.

**Language and Platform Features:**

- **Java SE Development Kit (JDK):**
  - JDK is a software development kit used to develop Java applications.
  - It includes the Java Runtime Environment (JRE), an interpreter/loader (Java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), and other tools.

- **Example Program (HelloWorld.java):**
  ```java
  public class HelloWorld {
      public static void main(String[] args) {
          System.out.println("Hello, World!");
      }
  }
  ```
  - This program prints "Hello, World!" to the console when executed.

**A Simple Java Class:**

- **Definition:**
  - A class is a blueprint for objects, and objects are instances of classes.
  - Java programs consist of one or more classes.

- **Example Program (SimpleClass.java):**
  ```java
  public class SimpleClass {
      int number; // field or attribute

      void displayNumber() { // method
          System.out.println("Number: " + number);
      }
  }
  ```
  - This class defines a simple class with a field (`number`) and a method (`displayNumber`).

**Java Basics Syntax:**

- **Variables and Data Types:**
  - Declare variables with data types (int, double, String, etc.).
  ```java
  int age = 25;
  double height = 5.9;
  String name = "John";
  ```

- **Control Flow Statements:**
  - Use if, else, and loops for control flow.
  ```java
  if (age >= 18) {
      System.out.println("You are an adult.");
  } else {
      System.out.println("You are a minor.");
  }

  for (int i = 1; i <= 5; i++) {
      System.out.println("Iteration: " + i);
  }
  ```

- **Example Program (BasicSyntax.java):**
  ```java
  public class BasicSyntax {
      public static void main(String[] args) {
          int age = 20;

          if (age >= 18) {
              System.out.println("You are an adult.");
          } else {
              System.out.println("You are a minor.");
          }
      }
  }
  ```

## Flow of Control:

**Branching: if, if-else, and switch:**

- **if Statement:**
  - Executes a block of code if a specified condition is true.
  ```java
  int x = 10;
  if (x > 5) {
      System.out.println("x is greater than 5");
  }
  ```

- **if-else Statement:**
  - Executes one block of code if the condition is true and another if false.
  ```java
  int y = 3;
  if (y % 2 == 0) {
      System.out.println("y is even");
  } else {
      System.out.println("y is odd");
  }
  ```

- **switch Statement:**
  - Allows multi-way branching based on the value of an expression.
  ```java
  int dayOfWeek = 3;
  switch (dayOfWeek) {
      case 1:
          System.out.println("Monday");
          break;
      case 2:
          System.out.println("Tuesday");
          break;
      // ... cases for other days
      default:
          System.out.println("Invalid day");
  }
  ```

**Iteration: while, do-while, for, enhanced for, break, and continue:**

- **while Loop:**
  - Executes a block of code as long as a specified condition is true.
  ```java
  int i = 1;
  while (i <= 5) {
      System.out.println("Iteration: " + i);
      i++;
  }
  ```

- **do-while Loop:**
  - Similar to a while loop, but the condition is checked after the block is executed.
  ```java
  int j = 1;
  do {
      System.out.println("Iteration: " + j);
      j++;
  } while (j <= 5);
  ```

- **for Loop:**
  - Executes a block of code with a specified initialization, condition, and iteration expression.
  ```java
  for (int k = 1; k <= 5; k++) {
      System.out.println("Iteration: " + k);
  }
  ```

- **enhanced for Loop:**
  - Iterates over elements of an array or collection.
  ```java
  int[] numbers = {1, 2, 3, 4, 5};
  for (int num : numbers) {
      System.out.println("Number: " + num);
  }
  ```

- **break Statement:**
  - Exits a loop prematurely.
  ```java
  for (int m = 1; m <= 10; m++) {
      if (m == 5) {
          break; // exit the loop when m is 5
      }
      System.out.println("Iteration: " + m);
  }
  ```

- **continue Statement:**
  - Skips the rest of the loop's code for the current iteration.
  ```java
  for (int n = 1; n <= 5; n++) {
      if (n == 3) {
          continue; // skip iteration when n is 3
      }
      System.out.println("Iteration: " + n);
  }
  ```

### Exercises :

1. Develop a Java program using a do-while loop to repeatedly ask the user to enter a positive number until a negative number is entered.

2. mplement a Java program that generates a random number between 1 and 100 and asks the user to guess it. Provide feedback on whether the guess is too high, too low, or correct.

3. Create a simple Java program that simulates user authentication. Ask the user to enter a username and password and validate against predefined values.


### Assignment :

Create a Java program that simulates a simple quiz game. Ask the user multiple-choice questions, use branching to check if the answers are correct, and provide a final score at the end.
