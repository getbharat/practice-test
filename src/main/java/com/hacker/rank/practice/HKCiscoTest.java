package com.hacker.rank.practice;

import java.util.HashSet;
import java.util.Scanner;

class InvalidInputException extends Exception {
    
}

class Employee {
   
   private int id = 0;
   private String name = null;
   private boolean male = true;
    
    Employee(int id, String name,  boolean male) {
       super();
       this.id = id;
       this.name = name;
       this.male = male;
   }
     
   @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ",  male=" + male + "]";
    }   
    
    @Override
    public int hashCode() {
        return id + name.hashCode() + Boolean.valueOf(male).hashCode();
    }
       
   
}

public class HKCiscoTest {
    
    /*
    * Validate the input and create Employee object
    * If any of the given input is not valid throw InvalidInputException();
    */
    public Employee createEmployee(String record) throws InvalidInputException {
        
        //Complete the code     
        String[] data = record.split(",");
        if(data.length==3){
        	  int  id = Integer.parseInt(data[0]);
              String name = data[1];
              Boolean  male = Boolean.parseBoolean(data[2]);
              return new Employee(id, name, male);
        }else {
        	throw new InvalidInputException();
        }
        
      
             
                
    }
    
    public static void main(String[] str) {
        
        //Input is expected as comma separated values for Employee object like id(int), name (String),isMale(boolean)"
        // 1,John,true
        Scanner scan = new Scanner(System.in);
        HashSet<Employee> employeeSet = new HashSet<>();
        
        /*Process each line and create Employee object using the "createEmployee" method add in employeeSet*/
        HKCiscoTest t = new HKCiscoTest();
        while (scan.hasNextLine()) {
            try {
                String record = scan.nextLine();
                if(record.isBlank()) {
                    break;
                }
                employeeSet.add(t.createEmployee(record));
                
            }catch(Exception e) {
                System.out.println(e.getClass().getName());
                System.exit(0);
            }

        }
        scan.close();
        
        //Don't delete or modify this print statement
        System.out.println("Employees info : "+ employeeSet);
   
    }

}