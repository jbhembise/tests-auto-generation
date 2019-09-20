package jbhembise.testauto.example3;

import java.util.ArrayList;
import java.util.List;

public class Stack2 {

    private static final int MAX_SIZE = 6;

    private List<Object> elts;

    public Stack2() {
        this.elts = new ArrayList<>();
    }

    public void push(Object object) {
        if (this.elts.size() >= MAX_SIZE) {
            throw new IllegalStateException("Could not add more than " + MAX_SIZE + " elements to the stack");
        }
        this.elts.add(object);
    }

    public void pop() {
        if (this.elts.isEmpty()) {
            throw new IllegalStateException("Could not pop an element from an empty stack");
        }
        this.elts.remove(this.elts.size() - 1);
    }

    public void clear() {
        this.elts.clear();
    }

    public Object last() {
        return this.elts.get(this.elts.size() - 1);
    }

    public boolean isEmpty() {
        return this.elts.size() == 0;
    }

    public boolean isFull() {
        return this.elts.size() == MAX_SIZE;
    }

    public int size() {
        return this.elts.size();
    }

}
