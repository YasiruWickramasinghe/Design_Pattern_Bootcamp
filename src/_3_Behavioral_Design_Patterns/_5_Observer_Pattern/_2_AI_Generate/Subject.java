package _3_Behavioral_Design_Patterns._5_Observer_Pattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
