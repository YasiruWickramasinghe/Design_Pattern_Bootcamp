package _3_Behavioral_Design_Patterns._3_Iterator_Pattern.Pattern_Code;

public class NameRepository implements Container {
    public String[] names = {"John", "Jane", "Jack", "Julie"};

    @Override
    public Iterator getIterator() {
        return new NameIterator(names);
    }
}

