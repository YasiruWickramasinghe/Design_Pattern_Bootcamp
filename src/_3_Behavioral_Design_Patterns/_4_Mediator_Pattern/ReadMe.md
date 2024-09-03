# Mediator Pattern in Java: Simplifying Object Communications in Complex Systems

## Intent of Design Pattern

The Mediator design pattern is intended to reduce the complexity of communication between multiple objects or classes in a system. It achieves this by providing a centralized mediator class that handles the interactions between different classes, thus reducing their direct dependencies on each other

## Detailed Explanation with Real-World Examples

Imagine an air traffic control system at a busy airport, where the air traffic controller acts as a mediator. In this scenario, numerous airplanes wish to take off, land, or navigate around the airport's airspace. Instead of each pilot communicating directly with every other pilot, which could lead to confusion and potential accidents, all communication goes through the air traffic controller. The controller receives requests, processes them, and gives clear, organized instructions to each pilot. This centralized system reduces the complexity of communications and ensures safety and efficiency in managing the airport's operations. This is analogous to the Mediator design pattern in software, where a central mediator class handles and coordinates the interaction between different objects or systems.

## When to Use

* A set of objects communicate in well-defined but complex ways. The resulting interdependencies are unstructured and difficult to understand
* Reusing an object is difficult because it refers to and communicates with many other objects
* A behavior that's distributed between several classes should be customizable without a lot of subclassing

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /