# Design Patterns

## 1) Solid Principle

The SOLID principles are a set of design principles for object-oriented programming that aim to make code more maintainable, flexible, and reusable

### i) Single Responsibility Principle (SRP)
A class should have only one reason to change.

### ii) Open-Closed Principle (OCP)
Classes should be open for extension but closed for modification

### iii) SLiskov Substitution Principle (LSP)
Objects of a derived class should be substitutable for objects of the base class.

### iv) Interface Segregation Principle (ISP)
Clients should not be forced to depend on interfaces they do not use.

### v) Dependency Inversion Principle
Depend on abstractions, not concretions.

# Design Patterns Category

Explore this Java repository to understand and implement Creational, Structural, and Behavioral design patterns. Enhance your coding practices and build scalable, maintainable software using these proven principles.

## 1) Creational Design Patterns

### i) Singleton Pattern
Ensures a class has only one instance and provides a global access point to it.
Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_1_Creational_Design_Patterns/_1_Singleton_Pattern/Diagram/Singleton.png)


### ii) Factory Method Pattern
Defines an interface for creating objects, but lets subclasses decide which class to instantiate.
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_1_Creational_Design_Patterns/_2_Factory_Method_Pattern/Diagram/Factory.png)

### iii) Abstract Factory Pattern
Provides an interface to create families of related objects without specifying their concrete classes.
Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_1_Creational_Design_Patterns/_3_Abstract_Factory_Pattern/Diagram/Abstract_Factory.png)

### iv) Builder Pattern
Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_1_Creational_Design_Patterns/_4_Builder_Pattern/Diagram/Builder.png)

### v) Prototype Pattern
Creates new objects by copying an existing object (a prototype) rather than creating from scratch.
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_1_Creational_Design_Patterns/_5_Prototype_Pattern/Diagram/Prototype.png)

## 2) Structural Design Patterns

### i) Adapter Pattern
Converts one interface into another that a client expects, making incompatible systems work together.
Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_1_Adapter_Pattern/Diagram/Adapter.png)

### ii) Bridge Pattern
Separates an object’s abstraction from its implementation so they can vary independently.
Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation—which can be developed independently of each other.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_2_Bridge_Pattern/Diagram/Bridge.png)

### iii) Decorator Pattern
Adds behavior or responsibilities to an object dynamically without altering its structure.
Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_3_Decorator_Pattern/Diagram/Decorator.png)

### iv) Facade Pattern
Provides a simplified interface to a complex subsystem or set of classes.
Facade is a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_4_Facade_Pattern/Diagram/facade.png)

### v) proxy Pattern
Acts as a placeholder or intermediary, controlling access to another object.
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_5_Proxy_Pattern/Diagram/Proxy.png)

### vi) Composite Pattern
Treats individual objects and compositions of objects uniformly, allowing a tree-like structure to represent part-whole hierarchies.
Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_6_Composite_Pattern/Diagram/Composite.png)

## 3) Behavioral Design Patterns

### i) Chain of Responsibility Pattern
Passes a request along a chain of handlers until one handles it.
Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_1_Chain_of_Responsibility_Pattern/Diagram/Chain_of_Responsibility.png)

### ii) Command Pattern
Encapsulates a request as an object, allowing parameterization and queuing of requests.
Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_2_Command_Pattern/Diagram/Command.png)

### iii) Iterator Pattern
Provides a way to access elements of a collection sequentially without exposing its underlying structure
Iterator is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_3_Iterator_Pattern/Diagram/Iterator.png)

### iv)Mediator Pattern
Centralizes complex communication between objects, reducing their direct dependencies
Mediator is a behavioral design pattern that lets you reduce chaotic dependencies between objects. The pattern restricts direct communications between the objects and forces them to collaborate only via a mediator object.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_4_Mediator_Pattern/Diagram/Mediator.png)

### v) Observer Pattern
Notifies multiple objects (observers) about changes in the state of another object (subject).
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_5_Observer_Pattern/Diagram/Observer.png)

### vi) Flyweight Pattern
Minimizes memory use by sharing common parts of objects instead of creating new ones for every instance
Flyweight is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_6_Flyweight_Pattern/Diagram/FlyWeight.png)

### vii) Interpreter Pattern
Defines a grammar and interprets sentences in that language.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_7_Interpreter_Pattern/Diagram/Interpriter.png)

### viii) State Pattern
Changes an object’s behavior when its internal state changes.
State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_8_State_Pattern/Diagram/State.png)

### ix) Template Method Pattern
Defines the skeleton of an algorithm, allowing subclasses to override specific steps without changing the structure.
Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_9_Template_Method_Pattern/Diagram/Template_Method.png)

### x) Strategy Pattern
Defines a family of algorithms and lets clients choose which one to use.
Strategy is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_10_Strategy_Pattern/Diagram/Stratergy.png)

# Referencce

* https://refactoring.guru/ 
* https://java-design-patterns.com/principles/
* https://www.youtube.com/playlist?list=PLhfxuQVMs-nxlIlZon5tkhI5X-lE2UG4K
* https://www.youtube.com/watch?v=x2y_lsIdC6c



