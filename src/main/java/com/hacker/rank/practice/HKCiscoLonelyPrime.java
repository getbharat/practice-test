package com.hacker.rank.practice;

public class HKCiscoLonelyPrime {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 6, 8, 14, 12, 18, 23, 28 };

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 1) {
                int count=0;
				for (int j = 1; j <= arr[i]; j++) {
					if(j!=1 && arr[i]%j == 0) {
						count++;
					}
					if(count>1) {
						break;
					}

				}
				if(count==1) {
					System.out.print("Lonely Prime is "+ arr[i]);
					break;
				}
			}
		}

	}

}
