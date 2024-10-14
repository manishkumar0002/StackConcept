package StackDSAEx;

import java.util.Stack;

public class displayStack {
    public static void displayRecursion(Stack<Integer> st){
        if (st.size()==0) return; //base case of recursion
        int top =st.pop();
        System.out.print(top+" ");
        displayRecursion(st);//recursion call
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(23);
        st.push(90);
        st.push(5);
        st.push(34);
        System.out.print(st+" ");
        displayRecursion(st);
        System.out.print(st+" ");
       /*  1st method to display rev elemnt in a stack
       System.out.print(st+" ");
        System.out.println();

        Stack<Integer> rst=new Stack<>();
        while (st.size()>0){
            rst.push(st.pop());
        }
        while(rst.size()>0){
            int x=rst.pop();
            System.out.print(x+" ");
            st.push(x);
        }

        *//*  #2nd methid to display a stack in rev order
       int n =st.size();
        int[] arr=new int[n];
        for (int i =n-1; i>=0 ; i--){
            arr[i]=st.pop();
        }
        for (int i=0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }*/


    }
}
