package homework30_32_33;

import java.util.Optional;

public class Stack<T> implements Stackable<T> {
    private final Object[] elements;
    private int top;
    private final int capacity;

    public Stack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be > 0");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public void push(T item) {
        if (isFull()) {
            throw new StackFullException("Стек повний! Не можна додати: " + item);
        }
        elements[++top] = item;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void pop() {
        if (isEmpty()) {
            throw new StackEmptyException("Стек порожній! Немає елементів.");
        }
        T item = (T) elements[top];
        elements[top] = null;
        top--;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void peek() {
        if (isEmpty()) {
            throw new StackEmptyException("Стек порожній!");
        }
    }

    // повертає Optional
    @Override
    @SuppressWarnings("unchecked")
    public Optional<T> popOptional() {
        if (isEmpty()) {
            return Optional.empty();
        }
        T item = (T) elements[top];
        elements[top] = null;
        top--;
        return Optional.of(item);
    }
}
