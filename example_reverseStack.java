package StackDSAEx;

import java.util.Stack;

public class example_reverseStack {

    private static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    private static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        reverseStack(s);
        pushAtBottom(s,top);
    }

    private static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);


        reverseStack(s);
        printStack(s);
    }


}
