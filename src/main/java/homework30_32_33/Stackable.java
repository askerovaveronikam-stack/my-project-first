package homework30_32_33;

public interface Stackable<T> {
    boolean isEmpty();
    boolean isFull();
    void push(T item);
    void pop();
    void peek();

    // Новий метод!
    java.util.Optional<T> popOptional();
}


