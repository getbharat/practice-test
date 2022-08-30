package com.hacker.rank.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdProblem {
	
	int count1=0;
	
	public static void main(String[] args) {
		new LambdProblem().lambda();
	}
		
	public void lambda(){
		int count2 = 0;
		AtomicInteger count3 = new AtomicInteger();
		final Integer count4 = Integer.valueOf(0);
		
		final List<String> list = new ArrayList<>();
		list.add("abc");
		
		list.forEach(item->{
			count1++;
			//count2++;
			count3.incrementAndGet();
			//count4++;
			
		});
	}

}
