package StackDSAEx;

import java.util.Stack;
// stack known as LIFO / FILO
public class basicsOfStacks {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);

        // peak :-> The primary purpose of peek() is to retrieve the top element of the stack without removing it.
        System.out.println(st.peek());
        System.out.println(st);
       // in pop() ;-> this method tyhe elemnt of a stack
        st.pop();
        System.out.println(st);
    }
}
