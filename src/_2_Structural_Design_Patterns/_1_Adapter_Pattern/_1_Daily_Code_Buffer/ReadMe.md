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

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /