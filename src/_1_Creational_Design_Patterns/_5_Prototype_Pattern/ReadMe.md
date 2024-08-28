# Prototype Pattern in Java: Mastering Object Cloning for Efficient Instantiation

## Intent of Design Pattern

The Prototype pattern is used to specify the kinds of objects to create using a prototypical instance, and create new instances through object cloning

## Detailed Explanation with Real-World Examples

Imagine a company that manufactures custom-designed furniture. Instead of creating each piece from scratch every time an order is placed, they keep prototypes of their most popular designs. When a customer places an order for a specific design, the company simply clones the prototype of that design and makes the necessary customizations. This approach saves time and resources as the basic structure and design details are already in place, allowing the company to quickly fulfill orders with consistent quality.

In this scenario, the furniture prototypes act like object prototypes in software, enabling efficient creation of new, customized pieces based on existing models.

## When to Use

* When the classes to instantiate are specified at run-time, for example, by dynamic loading.
* To avoid building a class hierarchy of factories that parallels the class hierarchy of products.
* When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.
* When object creation is expensive compared to cloning.
* When the concrete classes to instantiate are unknown until runtime.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /