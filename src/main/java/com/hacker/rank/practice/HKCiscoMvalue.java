package com.hacker.rank.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HKCiscoMvalue {

	public static void main(String[] args) {
		final ArrayList<Integer> tickets = new ArrayList<>();
		tickets.add(10);
		tickets.add(12);
		tickets.add(1);
		tickets.add(10);
		tickets.add(4);
		
		//tickets.add(4);
		//tickets.add(13);
		//tickets.add(2);
		//tickets.add(3);

        Collections.sort(tickets);
        List<Integer> li= new ArrayList<>();
        int mValue=0;
        
        int index = 0;
		while (index < tickets.size() - 1) {
			if (Math.abs(tickets.get(index) - tickets.get(index + 1)) <= 1) {
				if (li.size()>0 && li.get(li.size() - 1) != tickets.get(index + 1)) {
					li.add(tickets.get(index));
				}
				li.add(tickets.get(index + 1));
				index++;
			} else {
				if(mValue< li.size()) {
					mValue = li.size();
				}
				li = new ArrayList<>();
				li.add(tickets.get(index + 1));
				index++;
			}

		}
    
        System.out.print(mValue);
	}

}
