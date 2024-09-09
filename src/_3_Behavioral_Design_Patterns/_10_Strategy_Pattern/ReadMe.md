# Strategy Pattern in Java: Streamlining Object Behaviors with Interchangeable Algorithms

## Intent of Design Pattern

Define a family of algorithms in Java, encapsulate each one, and make them interchangeable to enhance software development using the Strategy design pattern. Strategy lets the algorithm vary independently of the clients that use it

## Detailed Explanation with Real-World Examples

A practical real-world example of the Strategy design pattern in Java is evident in car navigation systems, where algorithm flexibility is paramount. Different navigation algorithms (such as shortest route, fastest route, and scenic route) can be used to determine the best path from one location to another. Each algorithm encapsulates a specific strategy for calculating the route. The user (client) can switch between these algorithms based on their preferences without changing the navigation system itself. This allows for flexible and interchangeable navigation strategies within the same system.

## When to Use

* You need to use different variants of an algorithm within an object and want to switch algorithms at runtime.
* There are multiple related classes that differ only in their behavior.
* An algorithm uses data that clients shouldn't know about.
* A class defines many behaviors and these appear as multiple conditional statements in its operations

## Structure

## Pseudocode
```code
// The strategy interface declares operations common to all
// supported versions of some algorithm. The context uses this
// interface to call the algorithm defined by the concrete
// strategies.
interface Strategy is
    method execute(a, b)

// Concrete strategies implement the algorithm while following
// the base strategy interface. The interface makes them
// interchangeable in the context.
class ConcreteStrategyAdd implements Strategy is
    method execute(a, b) is
        return a + b

class ConcreteStrategySubtract implements Strategy is
    method execute(a, b) is
        return a - b

class ConcreteStrategyMultiply implements Strategy is
    method execute(a, b) is
        return a * b

// The context defines the interface of interest to clients.
class Context is
    // The context maintains a reference to one of the strategy
    // objects. The context doesn't know the concrete class of a
    // strategy. It should work with all strategies via the
    // strategy interface.
    private strategy: Strategy

    // Usually the context accepts a strategy through the
    // constructor, and also provides a setter so that the
    // strategy can be switched at runtime.
    method setStrategy(Strategy strategy) is
        this.strategy = strategy

    // The context delegates some work to the strategy object
    // instead of implementing multiple versions of the
    // algorithm on its own.
    method executeStrategy(int a, int b) is
        return strategy.execute(a, b)


// The client code picks a concrete strategy and passes it to
// the context. The client should be aware of the differences
// between strategies in order to make the right choice.
class ExampleApplication is
    method main() is
        Create context object.

        Read first number.
        Read last number.
        Read the desired action from user input.

        if (action == addition) then
            context.setStrategy(new ConcreteStrategyAdd())

        if (action == subtraction) then
            context.setStrategy(new ConcreteStrategySubtract())

        if (action == multiplication) then
            context.setStrategy(new ConcreteStrategyMultiply())

        result = context.executeStrategy(First number, Second number)

        Print result.
```

## How to Implement
1) In the context class, identify an algorithm that’s prone to frequent changes. It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime.

2) Declare the strategy interface common to all variants of the algorithm.

3) One by one, extract all algorithms into their own classes. They should all implement the strategy interface.

4) In the context class, add a field for storing a reference to a strategy object. Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. The context may define an interface which lets the strategy access its data.

5) Clients of the context must associate it with a suitable strategy that matches the way they expect the context to perform its primary job.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  