# Decorator Pattern in Java: Extending Classes Dynamically

## Intent of Design Pattern

The Decorator pattern allows for the dynamic addition of responsibilities to objects without modifying their existing code. It achieves this by providing a way to "wrap" objects within objects of similar interface, enhancing Java design patterns flexibility

## Detailed Explanation with Real-World Examples

Imagine a coffee shop where you can customize your coffee order. You start with a basic coffee, and you can add different ingredients like milk, sugar, whipped cream, and so on. Each addition is like a decorator in the Decorator design pattern. The base coffee object can be decorated with additional functionality (flavors, toppings) dynamically. For example, you can start with a plain coffee object, then wrap it with a milk decorator, followed by a sugar decorator, and finally a whipped cream decorator. Each decorator adds new features or modifies the behavior of the coffee object, similar to how the Decorator pattern works in software design.

## When to Use

* Add responsibilities to individual objects dynamically and transparently, that is, without affecting other objects, a key feature of Java design patterns.
* For responsibilities that can be withdrawn.
* When extending a class is impractical due to the proliferation of subclasses that could result.
* For when a class definition might be hidden or otherwise unavailable for subclassing.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /