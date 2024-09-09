# Factory Pattern in Java: Streamlining Object Creation

## Intent of  Design Pattern

The Factory Design Pattern in Java is a creational pattern that defines an interface for creating an object but allows subclasses to alter the type of objects that will be created. This pattern promotes flexibility and scalability in your codebase.

## Detailed Explanation with Real-World Examples

Imagine a scenario in a bakery where different types of cakes are made using a Factory Design Pattern. The bakery's CakeFactory handles the creation process, allowing easy addition of new cake types without altering the core cake-making process. The CakeFactory can produce various types of cakes such as chocolate cake, vanilla cake, and strawberry cake. Instead of the bakery staff manually selecting ingredients and following specific recipes for each type of cake, they use the CakeFactory to handle the process. The customer simply requests a cake type, and the CakeFactory determines the appropriate ingredients and recipe to use, then creates the specific type of cake. This setup allows the bakery to easily add new cake types without modifying the core cake-making process, promoting flexibility and scalability.

## When to Use

* Use the Factory Design Pattern in Java when the class does not know beforehand the exact types and dependencies of the objects it needs to create.
* When a method returns one of several possible classes that share a common super class and wants to encapsulate the logic of which object to create.
* The pattern is commonly used when designing frameworks or libraries to give the best flexibility and isolation from concrete class types

## Structure

## Pseudocode
```code
// The creator class declares the factory method that must
// return an object of a product class. The creator's subclasses
// usually provide the implementation of this method.
class Dialog is
    // The creator may also provide some default implementation
    // of the factory method.
    abstract method createButton():Button

    // Note that, despite its name, the creator's primary
    // responsibility isn't creating products. It usually
    // contains some core business logic that relies on product
    // objects returned by the factory method. Subclasses can
    // indirectly change that business logic by overriding the
    // factory method and returning a different type of product
    // from it.
    method render() is
        // Call the factory method to create a product object.
        Button okButton = createButton()
        // Now use the product.
        okButton.onClick(closeDialog)
        okButton.render()


// Concrete creators override the factory method to change the
// resulting product's type.
class WindowsDialog extends Dialog is
    method createButton():Button is
        return new WindowsButton()

class WebDialog extends Dialog is
    method createButton():Button is
        return new HTMLButton()


// The product interface declares the operations that all
// concrete products must implement.
interface Button is
    method render()
    method onClick(f)

// Concrete products provide various implementations of the
// product interface.
class WindowsButton implements Button is
    method render(a, b) is
        // Render a button in Windows style.
    method onClick(f) is
        // Bind a native OS click event.

class HTMLButton implements Button is
    method render(a, b) is
        // Return an HTML representation of a button.
    method onClick(f) is
        // Bind a web browser click event.


class Application is
    field dialog: Dialog

    // The application picks a creator's type depending on the
    // current configuration or environment settings.
    method initialize() is
        config = readApplicationConfigFile()

        if (config.OS == "Windows") then
            dialog = new WindowsDialog()
        else if (config.OS == "Web") then
            dialog = new WebDialog()
        else
            throw new Exception("Error! Unknown operating system.")

    // The client code works with an instance of a concrete
    // creator, albeit through its base interface. As long as
    // the client keeps working with the creator via the base
    // interface, you can pass it any creator's subclass.
    method main() is
        this.initialize()
        dialog.render()
```

## How to Implement

1) Make all products follow the same interface. This interface should declare methods that make sense in every product.

2) Add an empty factory method inside the creator class. The return type of the method should match the common product interface.

3) In the creator’s code find all references to product constructors. One by one, replace them with calls to the factory method, while extracting the product creation code into the factory method.
   You might need to add a temporary parameter to the factory method to control the type of returned product.
   At this point, the code of the factory method may look pretty ugly. It may have a large switch statement that picks which product class to instantiate. But don’t worry, we’ll fix it soon enough.

4) Now, create a set of creator subclasses for each type of product listed in the factory method. Override the factory method in the subclasses and extract the appropriate bits of construction code from the base method.

5) If there are too many product types and it doesn’t make sense to create subclasses for all of them, you can reuse the control parameter from the base class in subclasses.
   For instance, imagine that you have the following hierarchy of classes: the base Mail class with a couple of subclasses: AirMail and GroundMail; the Transport classes are Plane, Truck and Train. While the AirMail class only uses Plane objects, GroundMail may work with both Truck and Train objects. You can create a new subclass (say TrainMail) to handle both cases, but there’s another option. The client code can pass an argument to the factory method of the GroundMail class to control which product it wants to receive.

6) If, after all of the extractions, the base factory method has become empty, you can make it abstract. If there’s something left, you can make it a default behavior of the method.



Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
- h t t p s : / / r e f a c t o r i n g . g u r u /  
