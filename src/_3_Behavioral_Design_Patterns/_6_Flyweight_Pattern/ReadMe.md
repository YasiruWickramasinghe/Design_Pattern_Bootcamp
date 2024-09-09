# Flyweight Pattern in Java: Maximizing Memory Efficiency with Shared Object Instances

## Intent of Design Pattern

The Flyweight design pattern in Java is crucial for optimizing memory usage and enhancing application performance. By minimizing the number of objects created, it significantly reduces the memory footprint. The primary goal of the Flyweight pattern is to share as much data as possible among similar objects, thereby improving efficiency and performance

## Detailed Explanation with Real-World Examples

A real-world application of the Flyweight pattern in Java can be seen in text editors like Microsoft Word or Google Docs. These applications use Flyweight to efficiently manage memory by sharing character objects, reducing the memory footprint significantly. In such applications, each character in a document could potentially be a separate object, which would be highly inefficient in terms of memory usage. Instead, the Flyweight pattern can be used to share character objects. For instance, all instances of the letter 'A' can share a single 'A' object with its intrinsic state (e.g., the shape of the character). The extrinsic state, such as the position, font, and color, can be stored separately and applied as needed. This way, the application efficiently manages memory by reusing existing objects for characters that appear multiple times

## When to Use

* The Flyweight pattern is particularly effective in Java applications that use a large number of objects.
* When storage costs are high due to the quantity of objects, Flyweight helps by sharing intrinsic data and managing extrinsic state separately.
* Most of the object state can be made extrinsic.
* Many groups of objects may be replaced by relatively few shared objects once the extrinsic state is removed.
* The application doesn't depend on object identity. Since flyweight objects may be shared, identity tests will return true for conceptually distinct objects

## Structure

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_6_Flyweight_Pattern/Diagram/FlyWeight.png)

## Pseudocode
```code
// The flyweight class contains a portion of the state of a
// tree. These fields store values that are unique for each
// particular tree. For instance, you won't find here the tree
// coordinates. But the texture and colors shared between many
// trees are here. Since this data is usually BIG, you'd waste a
// lot of memory by keeping it in each tree object. Instead, we
// can extract texture, color and other repeating data into a
// separate object which lots of individual tree objects can
// reference.
class TreeType is
    field name
    field color
    field texture
    constructor TreeType(name, color, texture) { ... }
    method draw(canvas, x, y) is
        // 1. Create a bitmap of a given type, color & texture.
        // 2. Draw the bitmap on the canvas at X and Y coords.

// Flyweight factory decides whether to re-use existing
// flyweight or to create a new object.
class TreeFactory is
    static field treeTypes: collection of tree types
    static method getTreeType(name, color, texture) is
        type = treeTypes.find(name, color, texture)
        if (type == null)
            type = new TreeType(name, color, texture)
            treeTypes.add(type)
        return type

// The contextual object contains the extrinsic part of the tree
// state. An application can create billions of these since they
// are pretty small: just two integer coordinates and one
// reference field.
class Tree is
    field x,y
    field type: TreeType
    constructor Tree(x, y, type) { ... }
    method draw(canvas) is
        type.draw(canvas, this.x, this.y)

// The Tree and the Forest classes are the flyweight's clients.
// You can merge them if you don't plan to develop the Tree
// class any further.
class Forest is
    field trees: collection of Trees

    method plantTree(x, y, name, color, texture) is
        type = TreeFactory.getTreeType(name, color, texture)
        tree = new Tree(x, y, type)
        trees.add(tree)

    method draw(canvas) is
        foreach (tree in trees) do
            tree.draw(canvas)
```

## How to Implement
1) Divide fields of a class that will become a flyweight into two parts:
   the intrinsic state: the fields that contain unchanging data duplicated across many objects
   the extrinsic state: the fields that contain contextual data unique to each object

2) Leave the fields that represent the intrinsic state in the class, but make sure they’re immutable. They should take their initial values only inside the constructor.

3) Go over methods that use fields of the extrinsic state. For each field used in the method, introduce a new parameter and use it instead of the field.

4) Optionally, create a factory class to manage the pool of flyweights. It should check for an existing flyweight before creating a new one. Once the factory is in place, clients must only request flyweights through it. They should describe the desired flyweight by passing its intrinsic state to the factory.

5) The client must store or calculate values of the extrinsic state (context) to be able to call methods of flyweight objects. For the sake of convenience, the extrinsic state along with the flyweight-referencing field may be moved to a separate context class.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  