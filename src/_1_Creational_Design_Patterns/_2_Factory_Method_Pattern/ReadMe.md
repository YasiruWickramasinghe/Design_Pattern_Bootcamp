# Factory Pattern in Java: Streamlining Object Creation

## Intent of  Design Pattern

The Factory Design Pattern in Java is a creational pattern that defines an interface for creating an object but allows subclasses to alter the type of objects that will be created. This pattern promotes flexibility and scalability in your codebase.

## Detailed Explanation with Real-World Examples

Imagine a scenario in a bakery where different types of cakes are made using a Factory Design Pattern. The bakery's CakeFactory handles the creation process, allowing easy addition of new cake types without altering the core cake-making process. The CakeFactory can produce various types of cakes such as chocolate cake, vanilla cake, and strawberry cake. Instead of the bakery staff manually selecting ingredients and following specific recipes for each type of cake, they use the CakeFactory to handle the process. The customer simply requests a cake type, and the CakeFactory determines the appropriate ingredients and recipe to use, then creates the specific type of cake. This setup allows the bakery to easily add new cake types without modifying the core cake-making process, promoting flexibility and scalability.

## When to Use

* Use the Factory Design Pattern in Java when the class does not know beforehand the exact types and dependencies of the objects it needs to create.
* When a method returns one of several possible classes that share a common super class and wants to encapsulate the logic of which object to create.
* The pattern is commonly used when designing frameworks or libraries to give the best flexibility and isolation from concrete class types

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
