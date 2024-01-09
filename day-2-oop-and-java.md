## IDEs

- **IntelliJ IDEA**
- **Eclipse:** 
- **VS Code:** Visual Studio Code


## Access Modifiers

Access modifiers define the visibility and accessibility of classes, methods, and variables in object-oriented programming.

- **private:** Limits access to the members within the same class.

- **public:** Allows unrestricted access to the members from any other class.

- **protected:** Provides access to the members within the same class and its subclasses.

- **default:** Also known as package-private, allows access within the same package.


## Object-Oriented Programming (OOP) in Java

### 1. Class and Object

**Class:** A class is a blueprint or template for creating objects. It defines the properties (attributes) and behaviors (methods) that objects of the class will have.

**Object:** An object is an instance of a class, created using the class blueprint. Objects encapsulate data and behavior.

```java
// Example of a simple class in Java
public class Car {
    // Attributes
    String brand;
    int year;

    // Method
    void startEngine() {
        System.out.println("Engine started");
    }
}

// Creating an object of the Car class
Car myCar = new Car();
myCar.brand = "Toyota";
myCar.year = 2022;
myCar.startEngine();
```

### 2. Encapsulation

Encapsulation is the bundling of data (attributes) and methods that operate on that data within a single unit, i.e., a class. Access modifiers (public, private, protected) control the visibility of class members.

```java
public class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
```

### 3. Inheritance

Inheritance allows a class (subclass or derived class) to inherit properties and behaviors from another class (superclass or base class). It promotes code reuse and establishes an "is-a" relationship.

```java
// Example of inheritance in Java
public class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Creating an object of the Dog class
Dog myDog = new Dog();
myDog.eat();  // Inherited from Animal
myDog.bark();
```

### 4. Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common superclass through method overriding and method overloading. Method overloading involves having multiple methods with the same name but different parameter lists. Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its superclass.

```java
// Example of polymorphism in Java
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a square");
    }
}

// Polymorphic behavior
Shape myShape = new Circle();
myShape.draw();  // Calls the draw method of Circle
```

