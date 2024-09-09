# Facade Pattern in Java: Simplifying Complex System Interfaces

## Intent of Design Pattern

The Facade Design Pattern provides a unified interface to a set of interfaces in a subsystem. This Java design pattern simplifies complex system interactions

## Detailed Explanation with Real-World Examples

Imagine a home theater system with multiple components: a DVD player, projector, surround sound system, and lights. Each component has a complex interface with numerous functions and settings. To simplify the use of the home theater system, a remote control (the Facade) is provided. The remote control offers a unified interface with simple buttons like "Play Movie," "Stop," "Pause," and "Volume Up/Down," which internally communicate with the various components, managing their interactions. This makes the system easier to use without needing to understand the detailed operations of each component.

## When to Use

* You want to provide a simple interface to a complex subsystem.
* Subsystems are getting more complex and depend on multiple classes, but most clients only need a part of the functionality.
* There is a need to layer your subsystems. Use a facade to define an entry point to each subsystem level.
* You want to reduce dependencies and enhance code readability in Java development

## Structure

## Pseudocode
```code
// These are some of the classes of a complex 3rd-party video
// conversion framework. We don't control that code, therefore
// can't simplify it.

class VideoFile
// ...

class OggCompressionCodec
// ...

class MPEG4CompressionCodec
// ...

class CodecFactory
// ...

class BitrateReader
// ...

class AudioMixer
// ...


// We create a facade class to hide the framework's complexity
// behind a simple interface. It's a trade-off between
// functionality and simplicity.
class VideoConverter is
    method convert(filename, format):File is
        file = new VideoFile(filename)
        sourceCodec = (new CodecFactory).extract(file)
        if (format == "mp4")
            destinationCodec = new MPEG4CompressionCodec()
        else
            destinationCodec = new OggCompressionCodec()
        buffer = BitrateReader.read(filename, sourceCodec)
        result = BitrateReader.convert(buffer, destinationCodec)
        result = (new AudioMixer()).fix(result)
        return new File(result)

// Application classes don't depend on a billion classes
// provided by the complex framework. Also, if you decide to
// switch frameworks, you only need to rewrite the facade class.
class Application is
    method main() is
        convertor = new VideoConverter()
        mp4 = convertor.convert("funny-cats-video.ogg", "mp4")
        mp4.save()
```

## How to Implement
1) Check whether it’s possible to provide a simpler interface than what an existing subsystem already provides. You’re on the right track if this interface makes the client code independent from many of the subsystem’s classes.

2) Declare and implement this interface in a new facade class. The facade should redirect the calls from the client code to appropriate objects of the subsystem. The facade should be responsible for initializing the subsystem and managing its further life cycle unless the client code already does this.

3) To get the full benefit from the pattern, make all the client code communicate with the subsystem only via the facade. Now the client code is protected from any changes in the subsystem code. For example, when a subsystem gets upgraded to a new version, you will only need to modify the code in the facade.

4) If the facade becomes too big, consider extracting part of its behavior to a new, refined facade class.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  