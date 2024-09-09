# Command Pattern in Java: Empowering Flexible Command Execution

## Intent of Design Pattern

The Command design pattern is a behavioral pattern used in Java programming. It encapsulates a request as an object, allowing for parameterization of clients with queues, requests, and operations. This pattern also supports undoable operations, enhancing flexibility in managing and executing commands

## Detailed Explanation with Real-World Examples

Imagine a smart home system where you can control devices such as lights, thermostats, and security cameras through a central application. Each command to operate these devices is encapsulated as an object, enabling the system to queue, execute sequentially, and undo commands if necessary. This approach decouples control logic from device implementation, allowing easy addition of new devices or features without altering the core application. This flexibility and functionality illustrate the practical application of the Command design pattern in Java programming.

## When to Use

* Parameterize objects with actions to perform, offering an object-oriented alternative to callbacks found in procedural languages. Commands can be registered and executed later.
* Specify, queue, and execute requests at different times, allowing commands to exist independently of the original request and even be transferred across processes.
* Support undo functionality, where the Command’s execute operation stores state and includes an un-execute operation to reverse previous actions. This allows for unlimited undo and redo capabilities by maintaining a history list.
* Log changes to reapply them after a system crash. By adding load and store operations to the Command interface, you can maintain a persistent log of changes and recover by reloading and re-executing commands from this log.
* Structure a system around high-level operations built on primitive operations, which is common in transaction-based systems. The Command pattern models transactions by providing a common interface for invoking and extending operations.
* Keep a history of requests.
* Implement callback functionality.
* Implement undo functionality.

## Structure

## Pseudocode
```code
    // The base command class defines the common interface for all
// concrete commands.
abstract class Command is
    protected field app: Application
    protected field editor: Editor
    protected field backup: text

    constructor Command(app: Application, editor: Editor) is
        this.app = app
        this.editor = editor

    // Make a backup of the editor's state.
    method saveBackup() is
        backup = editor.text

    // Restore the editor's state.
    method undo() is
        editor.text = backup

    // The execution method is declared abstract to force all
    // concrete commands to provide their own implementations.
    // The method must return true or false depending on whether
    // the command changes the editor's state.
    abstract method execute()


// The concrete commands go here.
class CopyCommand extends Command is
    // The copy command isn't saved to the history since it
    // doesn't change the editor's state.
    method execute() is
        app.clipboard = editor.getSelection()
        return false

class CutCommand extends Command is
    // The cut command does change the editor's state, therefore
    // it must be saved to the history. And it'll be saved as
    // long as the method returns true.
    method execute() is
        saveBackup()
        app.clipboard = editor.getSelection()
        editor.deleteSelection()
        return true

class PasteCommand extends Command is
    method execute() is
        saveBackup()
        editor.replaceSelection(app.clipboard)
        return true

// The undo operation is also a command.
class UndoCommand extends Command is
    method execute() is
        app.undo()
        return false


// The global command history is just a stack.
class CommandHistory is
    private field history: array of Command

    // Last in...
    method push(c: Command) is
        // Push the command to the end of the history array.

    // ...first out
    method pop():Command is
        // Get the most recent command from the history.


// The editor class has actual text editing operations. It plays
// the role of a receiver: all commands end up delegating
// execution to the editor's methods.
class Editor is
    field text: string

    method getSelection() is
        // Return selected text.

    method deleteSelection() is
        // Delete selected text.

    method replaceSelection(text) is
        // Insert the clipboard's contents at the current
        // position.


// The application class sets up object relations. It acts as a
// sender: when something needs to be done, it creates a command
// object and executes it.
class Application is
    field clipboard: string
    field editors: array of Editors
    field activeEditor: Editor
    field history: CommandHistory

    // The code which assigns commands to UI objects may look
    // like this.
    method createUI() is
        // ...
        copy = function() { executeCommand(
            new CopyCommand(this, activeEditor)) }
        copyButton.setCommand(copy)
        shortcuts.onKeyPress("Ctrl+C", copy)

        cut = function() { executeCommand(
            new CutCommand(this, activeEditor)) }
        cutButton.setCommand(cut)
        shortcuts.onKeyPress("Ctrl+X", cut)

        paste = function() { executeCommand(
            new PasteCommand(this, activeEditor)) }
        pasteButton.setCommand(paste)
        shortcuts.onKeyPress("Ctrl+V", paste)

        undo = function() { executeCommand(
            new UndoCommand(this, activeEditor)) }
        undoButton.setCommand(undo)
        shortcuts.onKeyPress("Ctrl+Z", undo)

    // Execute a command and check whether it has to be added to
    // the history.
    method executeCommand(command) is
        if (command.execute())
            history.push(command)

    // Take the most recent command from the history and run its
    // undo method. Note that we don't know the class of that
    // command. But we don't have to, since the command knows
    // how to undo its own action.
    method undo() is
        command = history.pop()
        if (command != null)
            command.undo()
```

## How to Implement
1) Declare the command interface with a single execution method.

2) Start extracting requests into concrete command classes that implement the command interface. Each class must have a set of fields for storing the request arguments along with a reference to the actual receiver object. All these values must be initialized via the command’s constructor.

3) Identify classes that will act as senders. Add the fields for storing commands into these classes. Senders should communicate with their commands only via the command interface. Senders usually don’t create command objects on their own, but rather get them from the client code.

4) Change the senders so they execute the command instead of sending a request to the receiver directly.

5) The client should initialize objects in the following order:
   Create receivers.
   Create commands, and associate them with receivers if needed.
   Create senders, and associate them with specific commands.



Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  