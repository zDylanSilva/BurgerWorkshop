# Burger code (BUILDER PATTERN)

## 1. Builder Pattern Concept

This is a creational design pattern whose purpose is to separate the construction of a complex object from its final representation. This allows the same construction process to create different representations of the object.

## 2. Usefulness in the Food Ordering System

In the specific case of the hamburger, the pattern serves to:

* Manage complexity: It avoids the use of traditional builders with too many parameters that are difficult to read.

* Segmenting attributes: It allows mandatory elements (bread and meat) to be handled differently from optional elements (cheese and additional ingredients).

* Ensuring consistency: It ensures that the object is immutable and that its creation is carried out only through controlled steps.

* Code readability: It facilitates the creation of different hamburger configurations through an easy-to-follow step-by-step process.

## 3. Compiling the code

The `Main` class can be found in the test package.

Since this is a simple example it only contains 2 `packages` and 2 `classes`, make sure to compile and debug them.
