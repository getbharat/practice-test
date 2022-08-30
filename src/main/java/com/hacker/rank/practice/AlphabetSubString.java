package com.hacker.rank.practice;

public class AlphabetSubString {

	public static void main(String[] args) {
		char[] arr = "XXABCXCDEFGHIJKwrwLMNOPsafdfsQRSTUVnmWXYZZAAA".toCharArray();
		int MIN = 65;
		int length = 0;
		int MAX = 90;
		boolean countEnable = false;
		for (char c : arr) {
			if (MIN <= MAX && c == MIN) {
				MIN++;
				countEnable = true;
				if(MIN==91) {
					length++;	
				}
			}
			
			if (countEnable && MIN<=MAX) {
				length++;
			}
		}
		System.out.print(length);
	}

}
