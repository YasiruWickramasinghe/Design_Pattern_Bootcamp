# Chain of Responsibility Pattern in Java: Building Robust Request Handling Mechanisms

## Intent of Design Pattern

The Chain of Responsibility pattern in Java is a behavioral design pattern that decouples the sender of a request from its receivers by giving more than one object a chance to handle the request. The receiving objects are chained and the request is passed along the chain until an object handles it.

## Detailed Explanation with Real-World Examples

A real-world example of the Chain of Responsibility pattern in Java is a technical support call center. When implementing this Java design pattern, each level of support represents a handler in the chain. When a customer calls in with an issue, the call is first received by a front-line support representative. If the issue is simple, the representative handles it directly. If the issue is more complex, the representative forwards the call to a second-level support technician. This process continues, with the call being escalated through multiple levels of support until it reaches a specialist who can resolve the problem. Each level of support represents a handler in the chain, and the call is passed along the chain until it finds an appropriate handler, thereby decoupling the request from the specific receiver.

## When to Use

* More than one object may handle a request, and the handler isn't known a priori. The handler should be ascertained automatically.
* You want to issue a request to one of several objects without specifying the receiver explicitly.
* The set of objects that can handle a request should be specified dynamically

## Structure

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_1_Chain_of_Responsibility_Pattern/Diagram/Chain_of_Responsibility.png)

## Pseudocode
```code
// The handler interface declares a method for executing a
// request.
interface ComponentWithContextualHelp is
    method showHelp()


// The base class for simple components.
abstract class Component implements ComponentWithContextualHelp is
    field tooltipText: string

    // The component's container acts as the next link in the
    // chain of handlers.
    protected field container: Container

    // The component shows a tooltip if there's help text
    // assigned to it. Otherwise it forwards the call to the
    // container, if it exists.
    method showHelp() is
        if (tooltipText != null)
            // Show tooltip.
        else
            container.showHelp()


// Containers can contain both simple components and other
// containers as children. The chain relationships are
// established here. The class inherits showHelp behavior from
// its parent.
abstract class Container extends Component is
    protected field children: array of Component

    method add(child) is
        children.add(child)
        child.container = this


// Primitive components may be fine with default help
// implementation...
class Button extends Component is
    // ...

// But complex components may override the default
// implementation. If the help text can't be provided in a new
// way, the component can always call the base implementation
// (see Component class).
class Panel extends Container is
    field modalHelpText: string

    method showHelp() is
        if (modalHelpText != null)
            // Show a modal window with the help text.
        else
            super.showHelp()

// ...same as above...
class Dialog extends Container is
    field wikiPageURL: string

    method showHelp() is
        if (wikiPageURL != null)
            // Open the wiki help page.
        else
            super.showHelp()


// Client code.
class Application is
    // Every application configures the chain differently.
    method createUI() is
        dialog = new Dialog("Budget Reports")
        dialog.wikiPageURL = "http://..."
        panel = new Panel(0, 0, 400, 800)
        panel.modalHelpText = "This panel does..."
        ok = new Button(250, 760, 50, 20, "OK")
        ok.tooltipText = "This is an OK button that..."
        cancel = new Button(320, 760, 50, 20, "Cancel")
        // ...
        panel.add(ok)
        panel.add(cancel)
        dialog.add(panel)

    // Imagine what happens here.
    method onF1KeyPress() is
        component = this.getComponentAtMouseCoords()
        component.showHelp()
```

## How to Implement
1) Declare the handler interface and describe the signature of a method for handling requests.
   Decide how the client will pass the request data into the method. The most flexible way is to convert the request into an object and pass it to the handling method as an argument.

2) To eliminate duplicate boilerplate code in concrete handlers, it might be worth creating an abstract base handler class, derived from the handler interface.
   This class should have a field for storing a reference to the next handler in the chain. Consider making the class immutable. However, if you plan to modify chains at runtime, you need to define a setter for altering the value of the reference field.
   You can also implement the convenient default behavior for the handling method, which is to forward the request to the next object unless there’s none left. Concrete handlers will be able to use this behavior by calling the parent method.

3) One by one create concrete handler subclasses and implement their handling methods. Each handler should make two decisions when receiving a request:
   Whether it’ll process the request.
   Whether it’ll pass the request along the chain.

4) The client may either assemble chains on its own or receive pre-built chains from other objects. In the latter case, you must implement some factory classes to build chains according to the configuration or environment settings.

5) The client may trigger any handler in the chain, not just the first one. The request will be passed along the chain until some handler refuses to pass it further or until it reaches the end of the chain.

6) Due to the dynamic nature of the chain, the client should be ready to handle the following scenarios:
   The chain may consist of a single link.
   Some requests may not reach the end of the chain.
   Others may reach the end of the chain unhandled.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  