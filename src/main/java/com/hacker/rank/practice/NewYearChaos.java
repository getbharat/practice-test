package com.hacker.rank.practice;

import java.util.Arrays;
import java.util.List;

public class NewYearChaos {

	public static void main(String[] args) {
		//List<Integer> q = Arrays.asList(2, 1, 5, 3, 4);
		List<Integer> q = Arrays.asList(2, 5, 1, 3, 4);
		int num = 1;
		int bribe = 0;
		boolean tooChaotic = false;
		for (int i = 0; i < q.size(); i++) {
			if (num != q.get(i)) {
				int temp = q.get(i) - num;
				if (temp >= 3) {
					System.out.println("Too chaotic");
					tooChaotic = true;
					break;
				} else {
					int index = i;
					for (int j = 1; j <= temp; j++) {
						int temp1 = q.get(index);
						q.set(index, q.get(i + j));
						q.set(i + j, temp1);
						index++;
					}
					bribe = bribe + temp;
				}
			}
			num++;
		}

		if (!tooChaotic) {
			System.out.println(bribe);

		}

	}

}
