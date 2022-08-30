package com.hacker.rank.practice;

public class RepeatedString {

	public static void main(String[] args) {
		String s = "bcbccacaacbbacabcabccacbccbababbbbabcccbbcbcaccababccbcbcaabbbaabbcaabbbbbbabcbcbbcaccbccaabacbbacbc";
		long n = 649606239668L;
		char[] arr = s.toCharArray();
		long count = 0;
		for (char c : arr) {
			if (c == 'a') {
				count++;
			}
		}
		int length = s.length();
		long x = n / length;
		int remainder = (int) (n % length);

		int count1 = 0;
		if (remainder > 0) {
			final String subString = s.substring(0, remainder);
			for (char c : subString.toCharArray())
				if (c == 'a') {
					count1++;
				}
		}
		
		long totalCount = count * x + count1;
		
		System.out.println(totalCount);

	}

}
