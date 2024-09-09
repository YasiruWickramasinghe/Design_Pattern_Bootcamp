# Template Method Pattern in Java: Streamlining Complex Algorithms with Predefined Scaffolds

## Intent of Design Pattern

Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure

## Detailed Explanation with Real-World Examples

A real-world analogy for the Template Method pattern can be seen in the preparation of a cup of tea or coffee. The overall process (algorithm) is the same: boil water, brew the beverage, pour into cup, and add condiments. However, the specific steps of brewing the beverage differ. For tea, you steep the tea leaves in hot water, while for coffee, you brew ground coffee beans. The Template Method pattern encapsulates the invariant steps of the process (boiling water, pouring, adding condiments) in a base class, while allowing subclasses to define the specific brewing steps, thus ensuring the overall structure of making a hot drink is consistent while allowing customization where needed.

## When to Use

* To implement the invariant parts of an algorithm once and leave it up to subclasses to implement the behavior that can vary
* When common behavior among subclasses should be factored and localized in a common class to avoid code duplication. This is a good example of "refactoring to generalize" as described by Opdyke and Johnson. You first identify the differences in the existing code and then separate the differences into new operations. Finally, you replace the differing code with a template method that calls one of these new operations
* To control subclasses extensions. You can define a template method that calls "hook" operations at specific points, thereby permitting extensions only at those points

## Structure

## Pseudocode
```code
// The abstract class defines a template method that contains a
// skeleton of some algorithm composed of calls, usually to
// abstract primitive operations. Concrete subclasses implement
// these operations, but leave the template method itself
// intact.
class GameAI is
    // The template method defines the skeleton of an algorithm.
    method turn() is
        collectResources()
        buildStructures()
        buildUnits()
        attack()

    // Some of the steps may be implemented right in a base
    // class.
    method collectResources() is
        foreach (s in this.builtStructures) do
            s.collect()

    // And some of them may be defined as abstract.
    abstract method buildStructures()
    abstract method buildUnits()

    // A class can have several template methods.
    method attack() is
        enemy = closestEnemy()
        if (enemy == null)
            sendScouts(map.center)
        else
            sendWarriors(enemy.position)

    abstract method sendScouts(position)
    abstract method sendWarriors(position)

// Concrete classes have to implement all abstract operations of
// the base class but they must not override the template method
// itself.
class OrcsAI extends GameAI is
    method buildStructures() is
        if (there are some resources) then
            // Build farms, then barracks, then stronghold.

    method buildUnits() is
        if (there are plenty of resources) then
            if (there are no scouts)
                // Build peon, add it to scouts group.
            else
                // Build grunt, add it to warriors group.

    // ...

    method sendScouts(position) is
        if (scouts.length > 0) then
            // Send scouts to position.

    method sendWarriors(position) is
        if (warriors.length > 5) then
            // Send warriors to position.

// Subclasses can also override some operations with a default
// implementation.
class MonstersAI extends GameAI is
    method collectResources() is
        // Monsters don't collect resources.

    method buildStructures() is
        // Monsters don't build structures.

    method buildUnits() is
        // Monsters don't build units.
```

## How to Implement
1) Analyze the target algorithm to see whether you can break it into steps. Consider which steps are common to all subclasses and which ones will always be unique.

2) Create the abstract base class and declare the template method and a set of abstract methods representing the algorithm’s steps. Outline the algorithm’s structure in the template method by executing corresponding steps. Consider making the template method final to prevent subclasses from overriding it.

3) It’s okay if all the steps end up being abstract. However, some steps might benefit from having a default implementation. Subclasses don’t have to implement those methods.

4) Think of adding hooks between the crucial steps of the algorithm.

5) For each variation of the algorithm, create a new concrete subclass. It must implement all of the abstract steps, but may also override some of the optional ones.


Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  