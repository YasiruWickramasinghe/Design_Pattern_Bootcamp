package _3_Behavioral_Design_Patterns._3_Iterator_Pattern.Pattern_Code;

public class NameIterator implements Iterator {
    int index;
    String[] names;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        if (index < names.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext()) {
            return names[index++];
        }
        return null;
    }
}
