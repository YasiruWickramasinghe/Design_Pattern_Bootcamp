# Adapter Pattern in Java: Seamless Integration of Incompatible Systems

## Intent of Design Pattern

The Adapter Design Pattern in Java converts the interface of a class into another interface that clients expect, enabling compatibility

## Detailed Explanation with Real-World Examples

Consider that you have some pictures on your memory card and you need to transfer them to your computer. To transfer them, you need some kind of adapter that is compatible with your computer ports so that you can attach a memory card to your computer. In this case card reader is an adapter. Another example would be the famous power adapter; a three-legged plug can't be connected to a two-pronged outlet, it needs to use a power adapter that makes it compatible with the two-pronged outlets. Yet another example would be a translator translating words spoken by one person to another

## When to Use

* You want to use an existing class, and its interface does not match the one you need
* You want to create a reusable class that cooperates with unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces
* You need to use several existing subclasses, but it's impractical to adapt their interface by subclassing everyone. An object adapter can adapt the interface of its parent class.
* Most of the applications using third-party libraries use adapters as a middle layer between the application and the 3rd party library to decouple the application from the library. If another library has to be used only an adapter for the new library is required without having to change the application cod

## Structure

## Pseudocode
```code
// Say you have two classes with compatible interfaces:
// RoundHole and RoundPeg.
class RoundHole is
    constructor RoundHole(radius) { ... }

    method getRadius() is
        // Return the radius of the hole.

    method fits(peg: RoundPeg) is
        return this.getRadius() >= peg.getRadius()

class RoundPeg is
    constructor RoundPeg(radius) { ... }

    method getRadius() is
        // Return the radius of the peg.


// But there's an incompatible class: SquarePeg.
class SquarePeg is
    constructor SquarePeg(width) { ... }

    method getWidth() is
        // Return the square peg width.


// An adapter class lets you fit square pegs into round holes.
// It extends the RoundPeg class to let the adapter objects act
// as round pegs.
class SquarePegAdapter extends RoundPeg is
    // In reality, the adapter contains an instance of the
    // SquarePeg class.
    private field peg: SquarePeg

    constructor SquarePegAdapter(peg: SquarePeg) is
        this.peg = peg

    method getRadius() is
        // The adapter pretends that it's a round peg with a
        // radius that could fit the square peg that the adapter
        // actually wraps.
        return peg.getWidth() * Math.sqrt(2) / 2


// Somewhere in client code.
hole = new RoundHole(5)
rpeg = new RoundPeg(5)
hole.fits(rpeg) // true

small_sqpeg = new SquarePeg(5)
large_sqpeg = new SquarePeg(10)
hole.fits(small_sqpeg) // this won't compile (incompatible types)

small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg)
large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg)
hole.fits(small_sqpeg_adapter) // true
hole.fits(large_sqpeg_adapter) // false
```

## How to Implement
1) Make sure that you have at least two classes with incompatible interfaces:
    A useful service class, which you can’t change (often 3rd-party, legacy or with lots of existing dependencies).
    One or several client classes that would benefit from using the service class.

2) Declare the client interface and describe how clients communicate with the service.

3) Create the adapter class and make it follow the client interface. Leave all the methods empty for now.

4) Add a field to the adapter class to store a reference to the service object. The common practice is to initialize this field via the constructor, but sometimes it’s more convenient to pass it to the adapter when calling its methods.

5) One by one, implement all methods of the client interface in the adapter class. The adapter should delegate most of the real work to the service object, handling only the interface or data format conversion.

6) Clients should use the adapter via the client interface. This will let you change or extend the adapters without affecting the client code.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  