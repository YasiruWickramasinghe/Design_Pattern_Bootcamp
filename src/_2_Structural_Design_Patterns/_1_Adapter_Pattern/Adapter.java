package _2_Structural_Design_Patterns._1_Adapter_Pattern;

// Adapter class that adapts the Adaptee to the Target interface
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
