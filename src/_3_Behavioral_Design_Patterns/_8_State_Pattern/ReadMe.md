# State Pattern in Java: Enhancing Behavior Dynamics with State Encapsulation

## Intent of Design Pattern

Enable an object to alter its behavior dynamically as its internal state changes, optimizing Java application responsiveness.

## Detailed Explanation with Real-World Examples

Imagine a traffic light system at an intersection. The traffic light can be in one of three states: Green, Yellow, or Red. Depending on the current state, the traffic light's behavior changes:

1) Green State: Cars are allowed to pass through the intersection.
2) Yellow State: Cars are warned that the light will soon turn red, so they should prepare to stop.
3) Red State: Cars must stop and wait for the light to turn green.

In this scenario, the traffic light uses the State design pattern. Each state (Green, Yellow, Red) is represented by a different object that defines what happens in that particular state. The traffic light (context) delegates the behavior to the current state object. When the state changes (e.g., from Green to Yellow), the traffic light updates its state object and changes its behavior accordingly

## When to Use

* An object's behavior depends on its state, and it must change its behavior at runtime depending on that state.
* Operations have large, multipart conditional statements that depend on the object's state

## Structure

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_8_State_Pattern/Diagram/State.png)

## Pseudocode
```code
// The AudioPlayer class acts as a context. It also maintains a
// reference to an instance of one of the state classes that
// represents the current state of the audio player.
class AudioPlayer is
    field state: State
    field UI, volume, playlist, currentSong

    constructor AudioPlayer() is
        this.state = new ReadyState(this)

        // Context delegates handling user input to a state
        // object. Naturally, the outcome depends on what state
        // is currently active, since each state can handle the
        // input differently.
        UI = new UserInterface()
        UI.lockButton.onClick(this.clickLock)
        UI.playButton.onClick(this.clickPlay)
        UI.nextButton.onClick(this.clickNext)
        UI.prevButton.onClick(this.clickPrevious)

    // Other objects must be able to switch the audio player's
    // active state.
    method changeState(state: State) is
        this.state = state

    // UI methods delegate execution to the active state.
    method clickLock() is
        state.clickLock()
    method clickPlay() is
        state.clickPlay()
    method clickNext() is
        state.clickNext()
    method clickPrevious() is
        state.clickPrevious()

    // A state may call some service methods on the context.
    method startPlayback() is
        // ...
    method stopPlayback() is
        // ...
    method nextSong() is
        // ...
    method previousSong() is
        // ...
    method fastForward(time) is
        // ...
    method rewind(time) is
        // ...


// The base state class declares methods that all concrete
// states should implement and also provides a backreference to
// the context object associated with the state. States can use
// the backreference to transition the context to another state.
abstract class State is
    protected field player: AudioPlayer

    // Context passes itself through the state constructor. This
    // may help a state fetch some useful context data if it's
    // needed.
    constructor State(player) is
        this.player = player

    abstract method clickLock()
    abstract method clickPlay()
    abstract method clickNext()
    abstract method clickPrevious()


// Concrete states implement various behaviors associated with a
// state of the context.
class LockedState extends State is

    // When you unlock a locked player, it may assume one of two
    // states.
    method clickLock() is
        if (player.playing)
            player.changeState(new PlayingState(player))
        else
            player.changeState(new ReadyState(player))

    method clickPlay() is
        // Locked, so do nothing.

    method clickNext() is
        // Locked, so do nothing.

    method clickPrevious() is
        // Locked, so do nothing.


// They can also trigger state transitions in the context.
class ReadyState extends State is
    method clickLock() is
        player.changeState(new LockedState(player))

    method clickPlay() is
        player.startPlayback()
        player.changeState(new PlayingState(player))

    method clickNext() is
        player.nextSong()

    method clickPrevious() is
        player.previousSong()


class PlayingState extends State is
    method clickLock() is
        player.changeState(new LockedState(player))

    method clickPlay() is
        player.stopPlayback()
        player.changeState(new ReadyState(player))

    method clickNext() is
        if (event.doubleclick)
            player.nextSong()
        else
            player.fastForward(5)

    method clickPrevious() is
        if (event.doubleclick)
            player.previous()
        else
            player.rewind(5)
```

## How to Implement
1) Decide what class will act as the context. It could be an existing class which already has the state-dependent code; or a new class, if the state-specific code is distributed across multiple classes.

2) Declare the state interface. Although it may mirror all the methods declared in the context, aim only for those that may contain state-specific behavior.

3) For every actual state, create a class that derives from the state interface. Then go over the methods of the context and extract all code related to that state into your newly created class.
   While moving the code to the state class, you might discover that it depends on private members of the context. There are several workarounds:

   Make these fields or methods public.
   Turn the behavior you’re extracting into a public method in the context and call it from the state class. This way is ugly but quick, and you can always fix it later.
   Nest the state classes into the context class, but only if your programming language supports nesting classes.

4) In the context class, add a reference field of the state interface type and a public setter that allows overriding the value of that field.

5) Go over the method of the context again and replace empty state conditionals with calls to corresponding methods of the state object.

6) To switch the state of the context, create an instance of one of the state classes and pass it to the context. You can do this within the context itself, or in various states, or in the client. Wherever this is done, the class becomes dependent on the concrete state class that it instantiates.

Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  