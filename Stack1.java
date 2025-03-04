import java.util.*;

public class Stack1{
    public static void main(String[] args) {
      Stack<Integer> stack=new Stack<Integer>();
      stack.push(20);
      stack.push(40);
      stack.push(50);
      stack.push(60);
      stack.push(70);
      stack.push(80);
      stack.push(90);
      stack.push(10);
      stack.push(5);

      System.out.println("popping Element is :"+stack.pop());

      System.out.println("Top element is :"+stack.peek());
    }
}