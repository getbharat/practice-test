package com.hacker.rank.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MissingOverlapRange {
	private static int Min = 1;
	private static int Max = 50;

	public static void main(String[] args) {

		final List<Interval> list = new ArrayList<>();

		list.add(new Interval(10, 15));
		list.add(new Interval(1, 6));
		list.add(new Interval(14, 18));
		list.add(new Interval(7, 9));
		list.add(new Interval(19, 34));
		list.add(new Interval(35, 50));
		boolean isMissingOrOvelappingRange = false;

		for (final Interval interval : list) {
			isMissingOrOvelappingRange = checkStart(interval.getStart(), list);
			if (isMissingOrOvelappingRange) {
				System.out.println("Missing or Ovelapping Range");
				break;
			}
			isMissingOrOvelappingRange = checkEnd(interval.getEnd(), list);
			if (isMissingOrOvelappingRange) {
				System.out.println("Missing or Ovelapping Range");
				break;
			}
		}
		if (isMissingOrOvelappingRange == false) {
			System.out.println("No Missing or Ovelapping Range");
		}

	}

	private static boolean checkEnd(int num, List<Interval> list) {

		return !(list.stream().filter(interval -> (num == Max || num + 1 == interval.getStart())).findFirst()
				.isPresent());

	}

	private static boolean checkStart(int num, List<Interval> list) {
		return !(list.stream().filter(interval -> (num == Min || num - 1 == interval.getEnd())).findFirst()
				.isPresent());
	}
}
