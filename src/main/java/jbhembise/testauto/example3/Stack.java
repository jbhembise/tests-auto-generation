package jbhembise.testauto.example3;

import java.util.ArrayList;
import java.util.List;

public class Stack {

    private static final int MAX_SIZE = 6;

    private List<Object> elts;
    private int size = 0;

    public Stack() {
        this.elts = new ArrayList<>();
    }

    public void push(Object object) {
        if (this.size >= MAX_SIZE) {
            throw new IllegalStateException("Could not add more than " + MAX_SIZE + " elements to the stack");
        }
        this.elts.add(object);
        this.size++;
    }

    public void pop() {
        if (this.elts.isEmpty()) {
            throw new IllegalStateException("Could not pop an element from an empty stack");
        }
        this.elts.remove(this.size - 1);
        this.size--;
    }

    public void clear() {
        this.elts.clear();
        this.size = 0;
    }

    public Object last() {
        return this.elts.get(this.size - 1);
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean isFull() {
        return this.size == MAX_SIZE;
    }

    public int size() {
        return this.size;
    }

}
