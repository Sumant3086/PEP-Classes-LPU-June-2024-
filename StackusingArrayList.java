import java.util.ArrayList;
import java.util.EmptyStackException;

class Stack {
    private ArrayList<Integer> list;

    Stack() {
        list = new ArrayList<>();
    }

    boolean isEmpty() {
        return list.isEmpty();
    }

    void push(int x) {
        list.add(x);
        System.out.println(x + " pushed into stack");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        } else {
            return list.remove(list.size() - 1);
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        } else {
            return list.get(list.size() - 1);
        }
    }
}

public class StackusingArrayList {

    // Function to evaluate postfix expressions
        public static void main(String args[]) {
        Stack stack = new Stack();

        // Basic stack operations
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println("Top element is " + stack.peek());

       
    }
}
