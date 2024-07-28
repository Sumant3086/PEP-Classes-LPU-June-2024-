
class Node {
    int data;
    Node next;

    Node(int d) {
        data=d;
        next=null;
    }
}
 
class Stack {
    Node top;

    Stack() {
        top = null;
    }

    boolean isEmpty() {
        return (top == null);
    }

    void push(int x) {
        Node newNode = new Node(x);
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        System.out.println(x + " pushed into stack");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            throw new java.util.EmptyStackException();
        } else {
            int x = top.data;
            top = top.next;
            return x;
        }
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            throw new java.util.EmptyStackException();
        } else {
            return top.data;
        }
    }
}
 
public class StackUsingLinkedList {    

    

    public static void main(String args[]) {
        Stack stack = new Stack();
 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println("Top element is " + stack.peek());

      
    }
}
