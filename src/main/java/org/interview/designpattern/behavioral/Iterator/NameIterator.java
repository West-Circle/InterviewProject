package org.interview.designpattern.behavioral.Iterator;

public class NameIterator implements Iterator {
    public String[] names = { "Robert", "John", "Julie", "Lora" };

    private int index;

    @Override
    public boolean hasNext() {
        if (index < names.length)
            return true;
        return false;
    }

    @Override
    public Object next() {
        if (this.hasNext())
            return names[index++];
        return null;
    }
}
