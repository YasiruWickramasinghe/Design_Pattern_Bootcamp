# Abstract Factory Pattern in Java: Mastering Object Creation Elegantly

## Intent of Design Pattern

The Abstract Factory pattern in Java provides an interface for creating families of related or dependent objects without specifying their concrete classes, enhancing modularity and flexibility in software design.

## Detailed Explanation with Real-World Examples

Imagine a furniture company that uses the Abstract Factory pattern in Java to produce various styles of furniture: modern, Victorian, and rustic. Each style includes products like chairs, tables, and sofas. To ensure consistency within each style, the company uses an Abstract Factory pattern.

In this scenario, the Abstract Factory is an interface for creating families of related furniture objects (chairs, tables, sofas). Each concrete factory (ModernFurnitureFactory, VictorianFurnitureFactory, RusticFurnitureFactory) implements the Abstract Factory interface and creates a set of products that match the specific style. This way, clients can create a whole set of modern or Victorian furniture without worrying about the details of their instantiation. This maintains a consistent style and allows easy swapping of one style of furniture for another.

## When to Use

* The system should be independent of how its products are created, composed, and represented.
* You need to configure the system with one of multiple families of products.
* A family of related product objects must be used together, enforcing consistency.
* You want to provide a class library of products, exposing only their interfaces, not their implementations.
* The lifetime of dependencies is shorter than the consumer's lifetime.
* Dependencies need to be constructed using runtime values or parameters.
* You need to choose which product to use from a family at runtime.
* Adding new products or families should not require changes to existing code.

## Structure

## Pseudocode
```code
// The abstract factory interface declares a set of methods that
// return different abstract products. These products are called
// a family and are related by a high-level theme or concept.
// Products of one family are usually able to collaborate among
// themselves. A family of products may have several variants,
// but the products of one variant are incompatible with the
// products of another variant.

interface GUIFactory is
    method createButton():Button
    method createCheckbox():Checkbox


// Concrete factories produce a family of products that belong
// to a single variant. The factory guarantees that the
// resulting products are compatible. Signatures of the concrete
// factory's methods return an abstract product, while inside
// the method a concrete product is instantiated.
class WinFactory implements GUIFactory is
    method createButton():Button is
        return new WinButton()
    method createCheckbox():Checkbox is
        return new WinCheckbox()

// Each concrete factory has a corresponding product variant.
class MacFactory implements GUIFactory is
    method createButton():Button is
        return new MacButton()
    method createCheckbox():Checkbox is
        return new MacCheckbox()


// Each distinct product of a product family should have a base
// interface. All variants of the product must implement this
// interface.
interface Button is
    method paint()

// Concrete products are created by corresponding concrete
// factories.
class WinButton implements Button is
    method paint() is
        // Render a button in Windows style.

class MacButton implements Button is
    method paint() is
        // Render a button in macOS style.

// Here's the base interface of another product. All products
// can interact with each other, but proper interaction is
// possible only between products of the same concrete variant.
interface Checkbox is
    method paint()

class WinCheckbox implements Checkbox is
    method paint() is
        // Render a checkbox in Windows style.

class MacCheckbox implements Checkbox is
    method paint() is
        // Render a checkbox in macOS style.


// The client code works with factories and products only
// through abstract types: GUIFactory, Button and Checkbox. This
// lets you pass any factory or product subclass to the client
// code without breaking it.
class Application is
    private field factory: GUIFactory
    private field button: Button
    constructor Application(factory: GUIFactory) is
        this.factory = factory
    method createUI() is
        this.button = factory.createButton()
    method paint() is
        button.paint()


// The application picks the factory type depending on the
// current configuration or environment settings and creates it
// at runtime (usually at the initialization stage).
class ApplicationConfigurator is
    method main() is
        config = readApplicationConfigFile()

        if (config.OS == "Windows") then
            factory = new WinFactory()
        else if (config.OS == "Mac") then
            factory = new MacFactory()
        else
            throw new Exception("Error! Unknown operating system.")

        Application app = new Application(factory)
```

## How to Implement

1) Map out a matrix of distinct product types versus variants of these products.

2) Declare abstract product interfaces for all product types. Then make all concrete product classes implement these interfaces.

3) Declare the abstract factory interface with a set of creation methods for all abstract products.

4) Implement a set of concrete factory classes, one for each product variant.

5) Create factory initialization code somewhere in the app. It should instantiate one of the concrete factory classes, depending on the application configuration or the current environment. Pass this factory object to all classes that construct products.

6) Scan through the code and find all direct calls to product constructors. Replace them with calls to the appropriate creation method on the factory object.


Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  