package com.string.validation;

import java.util.Stack;

public class ValidateString {

	public static void main(String[] args) {

          String s = "[]}​{​()";
          
          Stack<Character> stack = new Stack<>();
          
          boolean isInvalid = false;
          for(Character ch : s.toCharArray()) {
        	  
        	  push(ch, stack);
        	  if(pop(ch, stack)) {
        		  isInvalid = true;
        		  break;
        	  }
        	  
          }
          if(isInvalid) {
        	  System.out.print("isInvalid");
          }
          else {
        	  System.out.print("Valid");
          }

	}

	private static boolean pop(Character ch, Stack<Character> stack) {

		if ((ch == ')' || ch == '}' || ch == ']')) {

			if(validateChar(stack.get(stack.size()-1), ch)) {
				stack.pop();
				return false;
			}
			else {
				return true;
			}

		}
		return false;

	}

	private static boolean validateChar(Character character, Character ch) {

		switch (character + "" + ch) {
		case "()":
			return true;
		case "{}":
			return true;
		case "[]":
			return true;
		default:
			return false;
		}

	}

	private static void push(Character ch, Stack<Character> stack) {
		if ((ch == '(' || ch == '{' || ch == '[')) {
			stack.push(ch);
		}

	}

}
