# Singleton Pattern in Java: Implementing Global Access Points in Java Applications

## Intent of Design Pattern

Ensure a Java class only has one instance, and provide a global point of access to this singleton instance.

## Detailed Explanation with Real-World Examples

A real-world analogy for the Singleton pattern is a government issuing a passport. In a country, each citizen can only be issued one valid passport at a time. The passport office ensures that no duplicate passports are issued to the same person. Whenever a citizen needs to travel, they must use this single passport, which serves as the unique, globally recognized identifier for their travel credentials. This controlled access and unique instance management mirrors how the Singleton pattern ensures efficient object management in Java applications.

## When to Use

* There must be exactly one instance of a class, and it must be accessible to clients from a well-known access point
* When the sole instance should be extensible by subclassing, and clients should be able to use an extended instance without modifying their code

## Structure
![Diagram](https://github.com/YasiruWickramasinghe/Design_Pattern_Bootcamp/blob/main/src/_1_Creational_Design_Patterns/_1_Singleton_Pattern/Diagram/Singleton.png)

## Pseudocode
```code
// The Database class defines the `getInstance` method that lets
// clients access the same instance of a database connection
// throughout the program.

class Database is
    // The field for storing the singleton instance should be
    // declared static.
    private static field instance: Database

    // The singleton's constructor should always be private to
    // prevent direct construction calls with the `new`
    // operator.
    private constructor Database() is
        // Some initialization code, such as the actual
        // connection to a database server.
        // ...

    // The static method that controls access to the singleton
    // instance.
    public static method getInstance() is
        if (Database.instance == null) then
            acquireThreadLock() and then
                // Ensure that the instance hasn't yet been
                // initialized by another thread while this one
                // has been waiting for the lock's release.
                if (Database.instance == null) then
                    Database.instance = new Database()
        return Database.instance

    // Finally, any singleton should define some business logic
    // which can be executed on its instance.
    public method query(sql) is
        // For instance, all database queries of an app go
        // through this method. Therefore, you can place
        // throttling or caching logic here.
        // ...

class Application is
    method main() is
        Database foo = Database.getInstance()
        foo.query("SELECT ...")
        // ...
        Database bar = Database.getInstance()
        bar.query("SELECT ...")
        // The variable `bar` will contain the same object as
        // the variable `foo`.
```

## How to Implement
1) Add a private static field to the class for storing the singleton instance.

2) Declare a public static creation method for getting the singleton instance.

3) Implement “lazy initialization” inside the static method. It should create a new object on its first call and put it into the static field. The method should always return that instance on all subsequent calls.

4) Make the constructor of the class private. The static method of the class will still be able to call the constructor, but not the other objects.

5) Go over the client code and replace all direct calls to the singleton’s constructor with calls to its static creation method.


Resource - h t t p s : / / j a v a - d e s i g n - p a t t e r n s . c o m /
         - h t t p s : / / r e f a c t o r i n g . g u r u /  