package homework30_32_33;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void testPopOnEmptyStackThrows() {
        Stack<Integer> stack = new Stack<>(2);

        assertThrows(StackEmptyException.class, stack::pop);
    }

    @Test
    void testPushOnFullStackThrows() {
        Stack<Integer> stack = new Stack<>(1);

        stack.push(10);

        assertThrows(StackFullException.class, () -> stack.push(20));
    }

    @Test
    void testPopOptionalEmpty() {
        Stack<Integer> stack = new Stack<>(3);

        Optional<Integer> result = stack.popOptional();

        assertTrue(result.isEmpty());
    }

    @Test
    void testPopOptionalReturnsElement() {
        Stack<Integer> stack = new Stack<>(3);

        stack.push(100);

        Optional<Integer> result = stack.popOptional();

        assertTrue(result.isPresent());
        assertEquals(100, result.get());
    }
}

