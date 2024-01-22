package _1_Creational_Design_Patterns._1_Singleton_Pattern;

public class Main {
    public static void main(String[] args) {
        // Get the instance of Singleton
        Singleton instance1 = Singleton.getInstance();

        // Try to create another instance
        Singleton instance2 = Singleton.getInstance();

        // Check if both instances refer to the same object
        if (instance1 == instance2) {
            System.out.println("Both instances are the same. Singleton pattern is working.");
        } else {
            System.out.println("Error! Singleton pattern is not working.");
        }
    }
}
