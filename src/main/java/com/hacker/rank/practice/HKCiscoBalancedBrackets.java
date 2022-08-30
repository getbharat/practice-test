package com.hacker.rank.practice;

import java.util.Stack;

public class HKCiscoBalancedBrackets {

	public static void main(String[] args) {

       String brackets = "[({)}";
       //String brackets = "[({)}]";
      //String brackets = "[({})]";
       final Stack<Character> stack = new Stack<>();
       
       for(char c : brackets.toCharArray()) {
    	   
    	   switch(c) {
    	   case '(':
    	   push(c, stack);
    	   break;
    	   case '[':
           push(c, stack);
           break;
    	   case '{':
           push(c, stack);
           break;
           
    	   case ')':
           pop('(', stack);
           break;
    	   case ']':
           pop('[', stack);
           break;
    	   case '}':
           pop('{', stack);
           break;
           default:
           break;
    	   }
    	   
       }
       
       if(stack.isEmpty()) {
    	   System.out.println("Balanced");
       }
       else {
    	   System.out.println("Not Balanced");
       }

	}

	private static void push(char c, final Stack<Character> stack) {
		stack.push(c);
	}

	
	private static void pop(char c, final Stack<Character> stack) {
		if(!stack.isEmpty() && stack.lastElement() == c) {
			stack.pop();
		}
		
	}

}
