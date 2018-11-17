import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

public class SimpleStackImplTest {

    @Test
    public  void  testCreateEmptySimpleStack () {
    // Test  case
    // Code  under  test
        SimpleStack  stack = new  SimpleStackImpl ();
    //  Assertions (oracle)
        assertTrue("A new  stack  should  be  empty ", stack.isEmpty ());
        assertEquals("A new  stack  has no  element" ,0,stack.getSize ());
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void getSize() {
    }

    @Test
    public void push() {
        //  Setup  the "state of the  world"
        SimpleStack  stack = new SimpleStackImpl ();
        Item  item = new Item ( new Object());
        // Code  under  test
        stack.push(item);
        //  assertions (oracle)
        assertFalse("The  stack  must be not  empty", stack.isEmpty ());
        assertEquals("The  stack  shoult  contain 1 item", 1,stack.getSize ());
        assertSame("Pushed  itm  should  be on top of  stack", item ,stack.peek ());
    }

    @Test
    public void peek() {

    }

    @Test(expected = EmptyStackException.class)
    public void pop() {
        //  Setup  the "state of the  world"
        SimpleStack  stack = new SimpleStackImpl ();
        // Code  under  test
        stack.pop();
        //  should  throws  an  EmptyStackException
    }
}