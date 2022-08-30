package com.hacker.rank.practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		System.out.println(factorial(num));
	}
	
	private static int factorial(int num) {
		 if(num == 0 || num == 1) {
			 return 1;
		 }
		 else {
			 return num * factorial(num-1);
		 }
	}

}
