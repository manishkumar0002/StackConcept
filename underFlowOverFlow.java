package StackDSAEx;

import java.util.Stack;

public class underFlowOverFlow {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);// 1 2 3 4 5
        st.pop();
        System.out.println(st);// 1 2 3 4
        st.pop();
        System.out.println(st);// 1 2 3
        st.pop();
        System.out.println(st);// 1 2
        st.pop();
        System.out.println(st);// 1
        st.pop();
        System.out.println(st);// empty
        System.out.println("underflow");//if stack is empty you are trying to st.pop() or st.peek() through a stack exception
        st.pop();//errror
        System.out.println(st);// throgh a exception ;-> Exception in thread "main" java.util.EmptyStackException
        /*at java.base/java.util.Stack.peek(Stack.java:101)
        at java.base/java.util.Stack.pop(Stack.java:83)
        at StackDSAEx.underFlowOverFlow.main(underFlowOverFlow.java:24)*/

    }
}
