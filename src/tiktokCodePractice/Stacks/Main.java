package tiktokCodePractice.Stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        // stack = LIFO data structure. Last-IN Firt-Out
        //         stores objects into a sort of "vertical tower"
        //         push() to add to the top
        //         pop() to remove from the top

        // declare stack - making a stack that stores strings 
        Stack<String> stack = new Stack<>();

        // stacks have five unique methods
        //   1. push() - push item on top of stack
        //   2. pop() - pop item of off stack 
        //   3. peek() - peek at item on top of stack 
        //   4. empty() - check if stack is empty 
        //   5. search() - search for item in stack 

        // System.out.println(stack.empty());

        // push some game in stack 
        stack.push("God of War");
        stack.push("Call of duty");
        stack.push("Batman");
        stack.push("Doom");
        stack.push("Border Land");

        // pop item off top of stack 
        stack.pop();
   
        // when you pop an item off of the stack you can reasign it 
        String myGame = stack.pop();
        System.out.println(myGame);

        // Every need to look at whats on top of stack use peek()
        System.out.println("peak(): " + stack.peek());

        // search stack
        System.out.println("Position of 'Call of duty' in stack: " + stack.search("Call of duty"));


        System.out.println(stack);


        // stacks run out of memeroy
        //  for (int i = 0; i < 100000000; i++ ) {
        //      stack.push("Fallout");
        //  }
        //  System.out.println(stack);


    }
    
}
