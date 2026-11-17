package Pilas;

import java.util.EmptyStackException;

public class ArrayStack<T> implements StackADT<T> {

    private final int DEFAULT_CAPACITY = 10;
    private int top;
    private T[] stack;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        top = 0;
        stack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int initialCapacity) {
        top = 0;
        int capacity = (initialCapacity > 0) ? initialCapacity : DEFAULT_CAPACITY;
        stack = (T[]) (new Object[capacity]);
    }

    @Override
    public void push(T element) {
        if (size() == stack.length) {
            expandCapacity();
        }
        stack[top] = element;
        top++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        top--;
        T result = stack[top];
        stack[top] = null; 
        return result;
    }

    @Override
    public T peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public int size() {
        return top;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        T[] space = (T[]) (new Object[stack.length * 2]);
        for (int i = 0; i < stack.length; i++) {
            space[i] = stack[i];
        }
        stack = space;
    }

    @Override
    public String toString() {
        String pila = "";
        for (int i = top - 1; i >= 0; i--) {
            pila = pila + stack[i] + "\n";
        }
        return pila;
    }
}
