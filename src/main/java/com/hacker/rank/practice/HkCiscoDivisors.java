package com.hacker.rank.practice;

import java.util.ArrayList;

public class HkCiscoDivisors {

	public static void main(String[] args) {
		int number = 28;
	      ArrayList<Integer> listOdDivisors = new ArrayList<>();
	      for(int i=2; i<number; i++){
	          if(number%i==0){
	              listOdDivisors.add(i);
	          }
	      }
	      int sumOfDivisors = listOdDivisors.stream().mapToInt(i->i.intValue()).sum();
	      
	      if(sumOfDivisors== number){
	          System.out.print("Perfect");
	      }
	      else if(sumOfDivisors<number){
	    	  System.out.print("Deficient");
	      }  
	      else{
	    	  System.out.print("Abundant");
	      }    
	    }
	    

}
