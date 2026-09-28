# Task 2: Exploration of Inheritance and Polymorphism (Pages 63-66)

This folder contains the implementation of the `Shape`, `Square`, `Circle`, and `Cylinder` classes.
A `MainShape` class is also provided to interactively create these shapes and demonstrate polymorphism via an interactive CLI menu.

## OOP Concepts Demonstrated
- **Encapsulation**: Used `private` and `protected` modifiers on properties like `side`, `radius`, `color`, and `height`.
- **Inheritance**: `Square` and `Circle` inherit from `Shape`. `Cylinder` inherits from `Circle`.
- **Polymorphism**: The method `printInfo()` is overridden in each child class. An array/list of `Shape` objects iterates over different shapes and correctly calls their respective `printInfo()` methods at runtime (dynamic binding).

## How to compile and run
```bash
javac *.java
java MainShape
```
