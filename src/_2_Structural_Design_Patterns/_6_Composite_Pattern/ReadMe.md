# Composite Pattern in Java: Building Flexible Tree Structures

## Intent of Design Pattern

Compose objects into tree structures to represent part-whole hierarchies. The Composite Design Pattern lets clients treat individual objects and compositions of objects uniformly

## Detailed Explanation with Real-World Examples

In a real-world example, consider a company with a complex organizational structure. The company consists of various departments, each of which can contain sub-departments, and ultimately individual employees. The Composite Design Pattern can be used to represent this structure. Each department and employee are treated as a node in a tree structure, where departments can contain other departments or employees, but employees are leaf nodes with no children. This allows the company to perform operations uniformly, such as calculating total salaries or printing the organizational chart, by treating individual employees and entire departments in the same way.

## When to Use

* You want to represent part-whole hierarchies of objects.
* You want clients to be able to ignore the difference between compositions of objects and individual objects. Clients will treat all objects in the composite structure uniformly

## Structure

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_2_Structural_Design_Patterns/_6_Composite_Pattern/Diagram/Composite.png)

## Pseudocode
## How to Implement


Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  