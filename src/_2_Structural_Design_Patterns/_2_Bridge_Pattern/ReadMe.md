# Bridge Pattern in Java: Decouple Abstraction from Implementation

## Intent of Design Pattern

The Bridge design pattern is a structural pattern in Java that decouples an abstraction from its implementation, allowing both to vary independently. This pattern is essential for developing flexible and extensible software systems

## Detailed Explanation with Real-World Examples

In Java, the Bridge pattern is commonly used in GUI frameworks, database drivers, and device drivers. For instance, a universal remote control (abstraction) can operate various TV brands (implementations) through a consistent interface.

Imagine a universal remote control (abstraction) that can operate different brands and types of televisions (implementations). The remote control provides a consistent interface for operations like turning on/off, changing channels, and adjusting the volume. Each television brand or type has its own specific implementation of these operations. By using the Bridge pattern, the remote control interface is decoupled from the television implementations, allowing the remote control to work with any television regardless of its brand or internal workings. This separation allows new television models to be added without changing the remote control's code, and different remote controls can be developed to work with the same set of televisions.

## When to Use

* You need to avoid a permanent binding between an abstraction and its implementation, such as when the implementation must be chosen or switched at runtime.
* Both the abstractions and their implementations should be extendable via subclassing, allowing independent extension of each component.
* Changes to the implementation of an abstraction should not affect clients, meaning their code should not require recompilation.
* You encounter a large number of classes in your hierarchy, indicating the need to split an object into two parts, a concept referred to as "nested generalizations" by Rumbaugh.
* You want to share an implementation among multiple objects, potentially using reference counting, while keeping this detail hidden from the client, as exemplified by Coplien's String class, where multiple objects can share the same string representation

## Structure

## Pseudocode
```code
// The "abstraction" defines the interface for the "control"
// part of the two class hierarchies. It maintains a reference
// to an object of the "implementation" hierarchy and delegates
// all of the real work to this object.
class RemoteControl is
    protected field device: Device
    constructor RemoteControl(device: Device) is
        this.device = device
    method togglePower() is
        if (device.isEnabled()) then
            device.disable()
        else
            device.enable()
    method volumeDown() is
        device.setVolume(device.getVolume() - 10)
    method volumeUp() is
        device.setVolume(device.getVolume() + 10)
    method channelDown() is
        device.setChannel(device.getChannel() - 1)
    method channelUp() is
        device.setChannel(device.getChannel() + 1)


// You can extend classes from the abstraction hierarchy
// independently from device classes.
class AdvancedRemoteControl extends RemoteControl is
    method mute() is
        device.setVolume(0)


// The "implementation" interface declares methods common to all
// concrete implementation classes. It doesn't have to match the
// abstraction's interface. In fact, the two interfaces can be
// entirely different. Typically the implementation interface
// provides only primitive operations, while the abstraction
// defines higher-level operations based on those primitives.
interface Device is
    method isEnabled()
    method enable()
    method disable()
    method getVolume()
    method setVolume(percent)
    method getChannel()
    method setChannel(channel)


// All devices follow the same interface.
class Tv implements Device is
    // ...

class Radio implements Device is
    // ...


// Somewhere in client code.
tv = new Tv()
remote = new RemoteControl(tv)
remote.togglePower()

radio = new Radio()
remote = new AdvancedRemoteControl(radio)
```

## How to Implement
1) Identify the orthogonal dimensions in your classes. These independent concepts could be: abstraction/platform, domain/infrastructure, front-end/back-end, or interface/implementation.

2) See what operations the client needs and define them in the base abstraction class.

3) Determine the operations available on all platforms. Declare the ones that the abstraction needs in the general implementation interface.

4) For all platforms in your domain create concrete implementation classes, but make sure they all follow the implementation interface.

5) Inside the abstraction class, add a reference field for the implementation type. The abstraction delegates most of the work to the implementation object that’s referenced in that field.

6) If you have several variants of high-level logic, create refined abstractions for each variant by extending the base abstraction class.

7) The client code should pass an implementation object to the abstraction’s constructor to associate one with the other. After that, the client can forget about the implementation and work only with the abstraction object.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  