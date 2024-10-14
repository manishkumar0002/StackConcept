package StackDSAEx;

import java.util.Scanner;
import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n; // size of a stack
        System.out.print("enter the size of the stack : ");
        n =sc.nextInt();
        System.out.print("enter the elemnt insert in stack ");
        for (int i =0; i<=n ; i++){
            int value=sc.nextInt();
            st.push(value);
        }
        System.out.print(st+" ");

        // reverse order of stack same above stack e;lemtn
        System.out.println("reverse order ");
        Stack<Integer> rst=new Stack<>();
          while(st.size()>0){
              rst.push(st.pop());
              /*int x=st.peek();
              rst.push(x);// that line push the lemtn in reverse order
              st.pop();// that delet the lement in above of stack*/
          }
        System.out.println(rst+" ");

    }
}
