# Interpreter Pattern in Java: Building Custom Parsers for Java Applications

## Intent of Design Pattern

The Interpreter design pattern is used to define a grammatical representation for a language and provides an interpreter to handle this grammar. This pattern is useful in scenarios where a specific set of rules or grammar needs to be interpreted and acted upon, such as in arithmetic expressions or scripting languages

## Detailed Explanation with Real-World Examples

Consider a calculator application designed to interpret and calculate expressions entered by users. The application uses the Interpreter pattern in Java to parse and evaluate arithmetic expressions such as "5 + 3 * 2". Here, the Interpreter translates each part of the expression into objects that represent numbers and operations. These objects follow a defined grammar that allows the application to understand and compute the result correctly based on the rules of arithmetic. Each element of the expression corresponds to a class in the program's structure, simplifying the parsing and evaluation process for any inputted arithmetic formula.

## When to Use

Use the Interpreter design pattern when there is a language to interpret, and you can represent statements in the language as abstract syntax trees. The Interpreter pattern works best when

* The grammar is simple. For complex grammars, the class hierarchy for the grammar becomes large and unmanageable. Tools such as parser generators are a better alternative in such cases. They can interpret expressions without building abstract syntax trees, which can save space and possibly time.
* Efficiency is not a critical concern. The most efficient interpreters are usually not implemented by interpreting parse trees directly but by first translating them into another form. For example, regular expressions are often transformed into state machines. But even then, the translator can be implemented by the Interpreter pattern, so the pattern is still applicable

## Structure

![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_3_Behavioral_Design_Patterns/_10_Interpreter_Pattern/Diagram/Interpriter.png)

## Pseudocode
```code
// Context class stores information that the interpreter can use
class InterpreterContext is
    method getVariableValue(variable: String): int is
        // Retrieve value of a variable from some context (e.g., a map or database)
        return variableStore.get(variable)

// Abstract expression interface that declares an interpret method
abstract class Expression is
    abstract method interpret(context: InterpreterContext): int

// Terminal expressions, such as variables or constants
class NumberExpression extends Expression is
    field number: int

    constructor NumberExpression(number: int) is
        this.number = number

    method interpret(context: InterpreterContext): int is
        return this.number

class VariableExpression extends Expression is
    field variable: String

    constructor VariableExpression(variable: String) is
        this.variable = variable

    method interpret(context: InterpreterContext): int is
        return context.getVariableValue(this.variable)

// Non-terminal expressions, such as operations
class AddExpression extends Expression is
    field leftExpression: Expression
    field rightExpression: Expression

    constructor AddExpression(left: Expression, right: Expression) is
        this.leftExpression = left
        this.rightExpression = right

    method interpret(context: InterpreterContext): int is
        return leftExpression.interpret(context) + rightExpression.interpret(context)

class SubtractExpression extends Expression is
    field leftExpression: Expression
    field rightExpression: Expression

    constructor SubtractExpression(left: Expression, right: Expression) is
        this.leftExpression = left
        this.rightExpression = right

    method interpret(context: InterpreterContext): int is
        return leftExpression.interpret(context) - rightExpression.interpret(context)

// More complex operations can be added similarly, like MultiplyExpression, DivideExpression, etc.


// Example of usage:
method main() is
    // Create a context
    context = new InterpreterContext()

    // Create expressions for 5 + 10 - 3
    expression = new SubtractExpression(
                    new AddExpression(
                        new NumberExpression(5),
                        new NumberExpression(10)
                    ),
                    new NumberExpression(3)
                )

    // Interpret the expression using the context
    result = expression.interpret(context)

    print("Result: " + result) // Output: Result: 12

```

## How to Implement
1) Define the Grammar: Decide what kind of expressions or grammar you need to interpret (e.g., arithmetic operations, logical conditions).

2) Create Context: The context class provides necessary information for the interpreter. For example, in a mathematical expression interpreter, the context might hold variable values.

3) Create the Abstract Expression Interface: This interface should declare the interpret() method that each concrete expression class will implement.

4) Implement Terminal Expressions: These classes represent individual values in the language, such as constants or variables.

5) Implement Non-terminal Expressions: These classes define operations that act on expressions, such as addition, subtraction, or more complex operations. Each expression has references to other expressions, forming a tree-like structure.

6) Interpretation: The client creates a complex expression (composed of terminal and non-terminal expressions) and calls the interpret() method to evaluate the result based on the context.


Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  