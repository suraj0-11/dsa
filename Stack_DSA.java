import java.util.*;

public class Stack_DSA {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        
        // System.out.println(stack.empty());
        stack.push("Minecraft");
        stack.push("game");
        stack.push("suraj");
        stack.push("haha");

        // System.out.println(stack.pop());
        // System.out.println(stack.peek());

        System.out.println(stack.search("suraj"));        

        System.out.println(stack);

        // for( int i = 0; i< 10000; i++) {
        //     stack.push("sur");
        // }

    }
}