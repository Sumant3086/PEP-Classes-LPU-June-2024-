import java.util.EmptyStackException;

class Stack {
    static final int MAX=1000;
    int top;
    int[] a=new int[MAX];  
    Stack(){
        top=-1;
    }
    boolean isEmpty(){
        return(top<0);
    }
    boolean isFull() {
        return(top>=(MAX-1));
    }
    boolean push(int x){
        if(isFull()){
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top]=x;
            return true;
        }
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            throw new EmptyStackException();
        }else{
            return a[top--];
        }
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            throw new EmptyStackException();
        }else{
            return a[top];
        }
    }
}
public class StackUsingArray {

    public static int evaluatePostfix(String exp) {
        Stack stack=new Stack();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);

            if(Character.isDigit(c)){
                stack.push(c-'0');
            }else{
                int val1=stack.pop();
                int val2=stack.pop();
                switch(c){
                    case'+':
                        stack.push(val2+val1);
                        break;
                    case'-':
                        stack.push(val2-val1);
                        break;
                    case '*':
                        stack.push(val2*val1);
                        break;
                    case '/':
                        stack.push(val2/val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
 
    public static boolean areParenthesesBalanced(String exp) {
        Stack stack=new Stack();
        for (int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(c=='(' || c=='[' || c=='{'){
                stack.push(c);
            }else if(c==')' || c==']' || c=='}'){
                if (stack.isEmpty()) 
                return false;
                char top=(char) stack.pop();
                if (!isMatchingPair(top,c))
                 return false;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isMatchingPair(char char1, char char2) {
        if (char1 == '(' && char2 == ')') return true;
        else if (char1 == '{' && char2 == '}') return true;
        else if (char1 == '[' && char2 == ']') return true;
        return false;
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
 
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop() + " Popped from stack");
        System.out.println("Top element is " + stack.peek());
 
        String postfix = "231*+9-";
        System.out.println("Postfix evaluation of " + postfix + " is " + evaluatePostfix(postfix));
 
        String expression = "{()}[]";
        System.out.println("Parentheses are balanced: " + areParenthesesBalanced(expression));
    }
}
