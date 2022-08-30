package com.hacker.rank.practice;

import java.util.Arrays;

public class ArrangeBinaries {

	public static void main(String[] args) {
		int[] arr = {1, 0, 1, 0, 0, 0, 1, 0, 1};
		int beginIndex=0;
		int endIndex=arr.length-1;
		
		
		while(beginIndex != endIndex) {
			 if(beginIndex<arr.length && arr[beginIndex]==0  ) {
				 beginIndex++;
			 }
			 else if(endIndex>-1 && arr[endIndex]==1) {
				 endIndex--;
			 }
			 if(arr[beginIndex]==1 && arr[endIndex]==0) {
				int temp = arr[endIndex];
				arr[endIndex] = arr[beginIndex];
				arr[beginIndex] = temp;
			 }
			 
		}
		
		Arrays.stream(arr).filter(elment->elment!=-1).forEach(element->System.out.println(element));
	}


}
