package exercises.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void shouldBeCreatedAndHaveCorrectSize() {
        Stack stack = new Stack(3);
        assertEquals(3, stack.size());
    }

    @Test
    public void shouldPopPushedElement() {
        Stack stack = new Stack(1);
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    public void shouldPopPushedElement2() {
        Stack stack = new Stack(1);
        stack.push(2);
        assertEquals(2, stack.pop());
    }

    @Test
    public void shouldPopPushedElements() {
        Stack stack = new Stack(2);
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

//    @Test
//    public void shouldContain2PushedElements() {
//        Stack stack = new Stack(3);
//        stack.push(1);
//        stack.push(2);
//
//        assertTrue(stack.contains(1));
//        assertTrue(stack.contains(2));
//    }
//
//    @Test
//    public void shouldNotContainNotPushedElement() {
//        Stack stack = new Stack(3);
//        stack.push(1);
//        assertFalse(stack.contains(2));
//    }


}
