package com.hacker.rank.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Given an array of n Player objects, write a comparator that sorts them 
		 * in order of decreasing score; if 2 or more players have the same score, sort those players 
		 * alphabetically by name.
		 * Input: 
		 * 5 
		 * amy 100 david 100 heraldo 50 aakansha 75 aleksa 150 
		 * Output:
		 * aleksa 150 amy 100 david 100 aakansha 75 heraldo 50
		 */
		 
		List<Player> players = new ArrayList<>();
		players.add(new Player("Ammy", 100));
		players.add(new Player("david", 100));
		
		Comparator<Player> comparator = new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				int compare = 0;
				if(o1.getScore()>o2.getScore()) {
					compare= 1;
				}
				else if (o1.getScore()<o2.getScore()) {
					compare= -1	;
				}
				else if(o1.getScore()<o2.getScore()) {
					compare = compareByName(o1, o2);
				}
				return compare;
			}

			private int compareByName(Player o1, Player o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		};
		
	}

}
