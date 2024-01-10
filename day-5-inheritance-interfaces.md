
## Composition and Inheritance, Abstract Classes, Interfaces


### 1. Composition:
   - **Has-A Relationship:**
     - **Definition:** Composition is a way to design classes where one class contains an object of another class. It is known as a "Has-A" relationship.
     - **Example:**
       ```java
       class Engine {
           // Engine properties and methods
       }

       class Car {
           Engine carEngine; // Composition (Has-A relationship)
           // Car properties and methods
       }
       ```

### 2. Inheritance:
   - **IS-A Relationship:**
     - **Definition:** Inheritance is a mechanism where a new class (subclass or derived class) inherits properties and behaviors from an existing class (superclass or base class). It is known as an "IS-A" relationship.
     - **Example:**
       ```java
       class Animal {
           // Animal properties and methods
       }

       class Dog extends Animal { // Inheritance (IS-A relationship)
           // Dog-specific properties and methods
       }
       ```

### 3. Overriding:
   - **Definition:** Overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. It allows a subclass to provide a specialized version of a method.
   - **Example:**
     ```java
     class Animal {
         void makeSound() {
             System.out.println("Generic animal sound");
         }
     }

     class Dog extends Animal {
         @Override
         void makeSound() {
             System.out.println("Bark");
         }
     }
     ```

### 4. Overloading:
   - **Definition:** Overloading happens when two or more methods in the same class have the same name but different parameters (number, type, or order). It allows a class to have multiple methods with the same name performing different tasks.
   - **Example:**
     ```java
     class Calculator {
         int add(int a, int b) {
             return a + b;
         }

         double add(double a, double b) {
             return a + b;
         }
     }
     ```

### Examples:

#### Composition Example:
```java
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine carEngine; // Composition (Has-A relationship)

    Car() {
        this.carEngine = new Engine(); // Creating an Engine object when Car is instantiated
    }

    void startCar() {
        carEngine.start(); // Delegating the start operation to the Engine object
        System.out.println("Car started");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startCar();
    }
}
```

#### Inheritance and Overriding Example:
```java
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    void playFetch() {
        System.out.println("Fetching the ball");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.makeSound(); // Output: Generic animal sound

        Dog myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.playFetch(); // Output: Fetching the ball
    }
}
```

#### Overloading Example:
```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        
        System.out.println(myCalculator.add(5, 3));       // Output: 8
        System.out.println(myCalculator.add(2.5, 3.5));   // Output: 6.0
    }
}
```

### Abstract Classes and Interfaces:

#### 1. Abstract Classes:

- **Definition:** An abstract class in Java is a class that cannot be instantiated and may contain abstract methods (methods without a body) that must be implemented by its concrete subclasses.

- **Use Cases:**
  - **Common Base Class:** Abstract classes are useful when you want to provide a common base class with some shared functionality for multiple derived classes.
  - **Partial Implementation:** Abstract classes can have a mix of concrete methods (with an implementation) and abstract methods that must be implemented by subclasses.

- **Example:**
  ```java
  abstract class Shape {
      abstract double calculateArea(); // Abstract method

      void display() {
          System.out.println("Displaying shape");
      }
  }

  class Circle extends Shape {
      private double radius;

      Circle(double radius) {
          this.radius = radius;
      }

      @Override
      double calculateArea() {
          return Math.PI * radius * radius;
      }
  }
  ```

#### 2. Interfaces:

- **Definition:** An interface in Java is a collection of abstract methods. It defines a contract that implementing classes must adhere to, without providing any implementation details.

- **Use Cases:**
  - **Multiple Inheritance:** Unlike classes, a Java class can implement multiple interfaces. This allows a class to inherit from multiple sources.
  - **API Design:** Interfaces are used to define contracts for classes that need to provide certain functionality. They serve as a blueprint for a set of related behaviors.

- **Example:**
  ```java
  interface Drawable {
      void draw(); // Abstract method
  }

  interface Fillable {
      void fill(); // Abstract method
  }

  class Circle implements Drawable, Fillable {
      private double radius;

      Circle(double radius) {
          this.radius = radius;
      }

      @Override
      public void draw() {
          System.out.println("Drawing a circle");
      }

      @Override
      public void fill() {
          System.out.println("Filling the circle");
      }
  }
  ```

### Use Cases and Examples:

#### 1. Abstract Classes:

- **Use Case:**
  - Imagine you're designing a game with different types of characters. You can create an abstract class `Character` with common properties and methods, and then have concrete classes like `Knight` and `Wizard` that extend this abstract class.

- **Example:**
  ```java
  abstract class Character {
      String name;
      int health;

      Character(String name, int health) {
          this.name = name;
          this.health = health;
      }

      abstract void attack(); // Abstract method
  }

  class Knight extends Character {
      Knight(String name, int health) {
          super(name, health);
      }

      @Override
      void attack() {
          System.out.println("Knight attacks with a sword");
      }
  }
  ```

#### 2. Interfaces:

- **Use Case:**
  - Suppose you are designing a graphical application. You can define interfaces like `Drawable` and `Fillable` to ensure that different graphical elements can be drawn and filled independently.

- **Example:**
  ```java
  interface Drawable {
      void draw();
  }

  interface Fillable {
      void fill();
  }

  class Circle implements Drawable, Fillable {
      private double radius;

      Circle(double radius) {
          this.radius = radius;
      }

      @Override
      public void draw() {
          System.out.println("Drawing a circle");
      }

      @Override
      public void fill() {
          System.out.println("Filling the circle");
      }
  }
  ```

## Using interfaces is a powerful technique in Java to remove implementation dependencies and promote loose coupling between different parts of a system. By programming to interfaces instead of concrete implementations, you can create more modular and flexible code. Here's an example scenario to illustrate this concept:

### Scenario:

Let's consider a simple logging system where different components need to log messages. Initially, the components are tightly coupled to a specific logging implementation.

#### Tightly Coupled Implementation:

```java
// Logger interface
interface Logger {
    void log(String message);
}

// ConsoleLogger implementation
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}

// FileLogger implementation
class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // Log message to a file
    }
}

// Component using ConsoleLogger
class SomeComponent {
    private Logger logger = new ConsoleLogger();

    void doSomething() {
        // Do something
        logger.log("Something happened");
    }
}
```

In this example, `SomeComponent` is tightly coupled to the `ConsoleLogger` implementation. If you want to change the logging mechanism (e.g., switch to file logging), you'd need to modify `SomeComponent`.

#### Using Interfaces to Remove Dependencies:

Now, let's refactor the code to use interfaces, allowing for a more flexible and decoupled design.

```java
// Logger interface
interface Logger {
    void log(String message);
}

// ConsoleLogger implementation
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console: " + message);
    }
}

// FileLogger implementation
class FileLogger implements Logger {
    @Override
    public void log(String message) {
        // Log message to a file
    }
}

// Component using Logger interface
class SomeComponent {
    private Logger logger;

    // Injecting logger through constructor (dependency injection)
    SomeComponent(Logger logger) {
        this.logger = logger;
    }

    void doSomething() {
        // Do something
        logger.log("Something happened");
    }
}
```

In this refactored code:

- `SomeComponent` now accepts any implementation of the `Logger` interface through its constructor.
- The dependency on a specific logging implementation is removed, making `SomeComponent` more flexible.
- You can easily switch between `ConsoleLogger` and `FileLogger` (or add new loggers) without modifying `SomeComponent`.

### Benefits:

1. **Loose Coupling:** The components are no longer tightly coupled to specific implementations but depend on abstractions (interfaces).
2. **Flexibility:** It's easier to change or extend implementations without affecting the dependent components.
3. **Testability:** Using interfaces makes it easier to substitute mock implementations for testing purposes.


## Java 8 interface improvements

### 1. Default Methods:

- **Definition:** Default methods allow interfaces to provide a default implementation for a method.
- **Purpose:** This feature enables adding new methods to interfaces without breaking existing implementations.
- **Example:**
  ```java
  interface Greetable {
      default void greet() {
          System.out.println("Hello, World!");
      }
  }

  class Greeting implements Greetable {
      // No need to implement greet() in Greeting class
  }
  ```

### 2. Static Methods:

- **Definition:** Interfaces can now have static methods.
- **Purpose:** Static methods provide a way to group utility methods related to the interface.
- **Example:**
  ```java
  interface MathOperation {
      static int add(int a, int b) {
          return a + b;
      }
  }

  class Calculator implements MathOperation {
      // No need to implement static method in Calculator class
  }

  // Usage:
  int result = MathOperation.add(3, 4);
  ```

### 3. Functional Interfaces:

- **Definition:** Functional interfaces are interfaces with a single abstract method (SAM). Introduced to support lambda expressions.
- **Purpose:** Enables the use of lambda expressions for concise and expressive code.
- **Example:**
  ```java
  @FunctionalInterface
  interface MyFunction {
      int operate(int x, int y);
  }

  // Usage of lambda expression:
  MyFunction add = (a, b) -> a + b;
  int result = add.operate(3, 4);
  ```

### 4. Lambda Expressions:

- **Definition:** Lambda expressions provide a concise way to express instances of functional interfaces (single abstract method interfaces).
- **Purpose:** Simplifies code, especially when working with functional interfaces.
- **Example:**
  ```java
  interface MyComparator {
      int compare(int a, int b);
  }

  // Usage of lambda expression:
  MyComparator compare = (a, b) -> a - b;
  int result = compare.compare(5, 3);
  ```

### 5. Stream API:

- **Definition:** The Stream API provides a functional approach to processing collections of data.
- **Purpose:** Facilitates parallel processing, filtering, and transformation of data in a declarative way.
- **Example:**
  ```java
  List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice");

  long count = names.stream()
                   .filter(name -> name.length() > 3)
                   .count();
  ```

### 6. Default Methods for Functional Interfaces:

- **Definition:** Default methods can be added to functional interfaces.
- **Purpose:** Allows extending existing functional interfaces without breaking compatibility.
- **Example:**
  ```java
  @FunctionalInterface
  interface MyFunction {
      int operate(int x, int y);

      default int addOne(int x) {
          return operate(x, 1);
      }
  }

  MyFunction add = (a, b) -> a + b;
  int result = add.addOne(5); // Uses default method
  ```
