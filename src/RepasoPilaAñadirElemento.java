import java.util.*;
import java.io.*;

class StackDemo {
    public static void main(String args[])
    {
        Stack stack1 = new Stack();

        Stack<String> stack2 = new Stack<String>();
        stack1.push(4);
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}
