package exercises.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class StackTest {

    @Test
    public void shouldCreateStack() {
        Stack stack = new Stack(3);
        assertNotNull(stack);
    }

    @Test
    public void shouldHaveSize3() {
        Stack stack = new Stack(3);
        assertEquals(3, stack.size());
    }

    @Test
    public void shouldHaveSize2() {
        Stack stack = new Stack(2);
        assertEquals(2, stack.size());
    }

    @Test
    public void shouldPushElement() {
        Stack stack = new Stack(3);
        stack.push(1);
        assertTrue(stack.contains(1));
    }
}
