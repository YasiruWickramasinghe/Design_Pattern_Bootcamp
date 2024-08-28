package _2_Structural_Design_Patterns._1_Adapter_Pattern;

// Client code that uses the Target interface
public class Client {
    public static void main(String[] args) {
        // Creating an Adaptee instance
        Adaptee adaptee = new Adaptee();

        // Creating an Adapter instance and passing the Adaptee instance
        Target adapter = new Adapter(adaptee);

        // Using the Target interface to make a request
        adapter.request();
    }
}

