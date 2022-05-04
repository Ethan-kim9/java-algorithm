package dataStructure.stack;

import java.util.Stack;

public class MakingStack extends Stack {
    public MakingStack() {
        super();
    }

    @Override
    public Object push(Object item) {
        return super.push(item);
    }

    @Override
    public synchronized Object pop() {
        return super.pop();
    }

    @Override
    public synchronized Object peek() {
        return super.peek();
    }

    @Override
    public boolean empty() {
        return super.empty();
    }

    @Override
    public synchronized int search(Object o) {
        return super.search(o);
    }
}
