package homework30_32_33;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(2);

        System.out.println("=== Тест 1: Виняток StackEmptyException ===");
        try {
            stack.pop(); // тут має бути виняток
        } catch (StackEmptyException e) {
            System.out.println("Піймали виняток: " + e.getMessage());
        }

        System.out.println("\n=== Тест 2: Виняток StackFullException ===");
        try {
            stack.push(10);
            stack.push(20);
            stack.push(30); // тут має бути виняток
        } catch (StackFullException e) {
            System.out.println("Піймали виняток: " + e.getMessage());
        }

        System.out.println("\n=== Тест 3: peek() на порожньому стеку ===");
        try {
            Stack<String> s2 = new Stack<>(1);
            s2.peek();  // виняток
        } catch (StackEmptyException e) {
            System.out.println("Піймали виняток: " + e.getMessage());
        }
    }
}
