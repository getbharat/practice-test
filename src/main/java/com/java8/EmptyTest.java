package com.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmptyTest {

	public static void main(String[] args) {

     List<String> li = new ArrayList<>(10);
     retrieveMetadata(li); 
      
	}
	public static List<String> retrieveMetadata(Collection<String> keys) {
	  
	    if (keys.isEmpty())
	      return new ArrayList<String>(); 
	    try {
	      
	    	throw new Exception();
	    } catch (Exception exception) {
	      String message = String.format("Could not retrieve data from NIMS domain '%s' for '%s'", new Object[] { "ABC", keys });
         
	      System.out.print(message);
	    } 
	    return new ArrayList<String>(); 

	  }

}
