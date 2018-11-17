import java.util.EmptyStackException;

public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */
    public boolean isEmpty();

    /**
     * Returns the number of Items in this stack
     */

    public int getSize();

    /**
     * Pushes an item onto the top of this stack
     * null item is allowed
     */
    public void push(Item item );

    /**
     * Looks at the top of this stack without removing it from the stack
     */

    public Item peek() throws EmptyStackException;

    /**
     * Removes
     */
    public Item pop() throws EmptyStackException;

}
