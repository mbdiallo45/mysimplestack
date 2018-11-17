import java.util.EmptyStackException;
import java.util.Stack;

public class SimpleStackImpl implements  SimpleStack {
    private Stack<Object> wrappedstack = new Stack<>();

    @Override
    public boolean isEmpty() {
        return wrappedstack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedstack.size();
    }

    @Override
    public void push(Item item) {
        wrappedstack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item)wrappedstack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedstack.pop();
    }
}