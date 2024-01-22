package _1_Creational_Design_Patterns._1_Singleton_Pattern;

public class Singleton {
    // Private static instance of the class
    private static Singleton instance;

    // Private constructor to prevent instantiation from outside the class
    private Singleton() {}

    // Public method to get the instance of the class
    public static Singleton getInstance() {
        // Lazy initialization - create the instance only if it doesn't exist yet
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

