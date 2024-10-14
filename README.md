#Stack Data Structure in Java
Definition
---------------
->A stack is a linear data structure that stores elements in a particular order, following the Last In First Out (LIFO) principle. This means the most recently added element is the first to be removed. Stacks can be visualized as a collection of items piled on top of one another, similar to a stack of plates.

Characteristics of Stacks
-------------------------------
->LIFO Principle: The last element added to the stack is the first one to be removed.
->Dynamic Size: Unlike fixed-size data structures (like arrays), stacks can grow and shrink as needed.
->Limited Access: Access to stack elements is restricted to the top of the stack. You cannot access elements in the middle or at the bottom directly.
->Support for Operations: Stacks primarily support the following operations: push, pop, peek, isEmpty, and size.

Basic Operations Explained
========================
Push:
Definition: Adds an element to the top of the stack.
Time Complexity: O(1).
Implementation: In a linked list implementation, this is done by adding a new node to the end of the list.
Pop:

Definition: Removes the element from the top of the stack and returns it.
Time Complexity: O(1).
Implementation: In a linked list, this involves removing the last node.
Peek:

Definition: Retrieves the top element of the stack without removing it.
Time Complexity: O(1).
Implementation: Accessing the last node in the linked list or the last index in an array.
isEmpty:

Definition: Checks whether the stack contains any elements.
Time Complexity: O(1).
Implementation: Simply checks if the size of the stack is zero.
Size:

Definition: Returns the number of elements currently in the stack.
Time Complexity: O(1).
Implementation: Maintains a count variable that is updated with every push and pop operation.

Implementation in Java
============================
Using a LinkedList for stack implementation is a common approach due to its dynamic nature. Here’s a detailed implementation:

java
================
import java.util.LinkedList;

class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(int item) {
        stack.addLast(item);  // Add item to the end of the list
    }

    public int pop() {
        if (!isEmpty()) {
            return stack.removeLast();  // Remove and return the last item
        }
        throw new IllegalStateException("Stack is empty. Cannot perform pop operation.");
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.getLast();  // Return the last item without removing it
        }
        throw new IllegalStateException("Stack is empty. Cannot perform peek operation.");
    }

    public boolean isEmpty() {
        return stack.isEmpty();  // Check if the list is empty
    }

    public int size() {
        return stack.size();  // Return the size of the list
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();
        myStack.push(10);
        myStack.push(20);
        System.out.println(myStack.pop());  // Output: 20
        System.out.println(myStack.peek()); // Output: 10
        System.out.println("Stack size: " + myStack.size()); // Output: 1
    }
}
Advanced Concepts
======================
Applications of Stacks:
------------------------
Function Call Management: The call stack manages function calls in programming languages. When a function is called, its execution context is pushed onto the stack. When the function returns, its context is popped off.
Expression Evaluation: Stacks are used to evaluate expressions in postfix notation (Reverse Polish Notation) and to convert between different expression formats (infix, postfix).
Backtracking Algorithms: In algorithms like maze solving, stacks can help keep track of the path taken and allow for backtracking when a dead end is encountered.
Browser History Management: Stacks can manage the "back" functionality of web browsers, storing pages in the order they were visited.
Memory Usage:

Stacks can lead to memory overflow if they grow too large, especially in recursive algorithms. This is known as a stack overflow error. It’s essential to be aware of the maximum stack depth, which can be a constraint in certain applications.
Stack Implementation Alternatives:

While the java.util.Stack class is available, it is often better to use Deque from the java.util package, which provides more flexibility and efficiency. Example:
java
------------
import java.util.ArrayDeque;
import java.util.Deque;

class Stack {
    private Deque<Integer> stack;

    public Stack() {
        stack = new ArrayDeque<>();
    }

    public void push(int item) {
        stack.push(item);
    }

    public int pop() {
        if (!isEmpty()) {
            return stack.pop();
        }
        throw new IllegalStateException("Stack is empty.");
    }

    public int peek() {
        if (!isEmpty()) {
            return stack.peek();
        }
        throw new IllegalStateException("Stack is empty.");
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}
Common Interview Questions
------------------------------
1.What is a stack, and how does it differ from a queue?

->A stack uses LIFO, while a queue uses FIFO (First In First Out). You can think of stacks as a stack of plates and queues as a line of people.
2.How would you implement a stack using an array?

->You can create a fixed-size array and maintain an index to represent the top of the stack. When the index reaches the maximum size, the stack is full.
3.Explain how you would check for balanced parentheses using a stack.

->You can iterate through the string and push opening brackets onto the stack. For every closing bracket, pop the stack and check for matches. If the stack is empty at the end, the parentheses are balanced.
4.What happens when you pop from an empty stack?

->An exception should be thrown, indicating that the stack is empty and no element can be removed.
How do you handle stack overflow?

Implement checks to limit the size of the stack or use dynamic data structures (like linked lists) that can grow as needed. For -------recursive functions, consider refactoring to an iterative approach.
---------------------------------------------------
Discuss the space complexity of a stack.

The space complexity is O(n), where n is the number of elements in the stack. Each element requires space proportional to the number of elements stored.
Can a stack be implemented using recursion? If so, how?

Yes, a stack can be simulated using recursion by using the call stack itself, but this is usually not efficient for large datasets due to the limitations of stack depth.
What are some real-world applications of stacks?

Stacks are used in function call management, expression evaluation, backtracking algorithms, and undo mechanisms in applications.
Conclusion
The stack data structure is fundamental in computer science and programming. Its LIFO nature and restricted access make it a powerful tool for various applications. Understanding stacks thoroughly is crucial for solving many algorithmic problems and is a frequent topic in technical interviews.
