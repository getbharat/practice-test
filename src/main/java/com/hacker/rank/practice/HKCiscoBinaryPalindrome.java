package com.hacker.rank.practice;

public class HKCiscoBinaryPalindrome {

	public static void main(String[] args) {
		int maximum = 13;
		int sum = 0;
		 for(int i = 1; i<=maximum; i++){
             if(i==1)
             {
                 sum = sum + i;
             }
             else 
             {
                 if(checkIfPalindrome(i))
                 {
                     sum = sum + i;
                 }
             }

        }
        
       System.out.println("Sum"+sum);;

    }
    private static boolean checkIfPalindrome(int number)
    {
        
        String num = new StringBuilder(String.valueOf(number)).toString();
        String reverseNum = new StringBuilder(String.valueOf(number)).reverse().toString();
        if(num.toString().equals(reverseNum.toString()))
        {
            
        StringBuilder binaryForm = getBinary(number);
        String binaryNumber = binaryForm.toString();
        String binaryNumberReverse = binaryForm.reverse().toString();
        
          
            if(!binaryForm.equals(" ") && binaryNumberReverse.equals(binaryNumber))
            {
                return true;
            }
            else
            {
               return false;
            }
        }
        else{
            return false;
        }
    }
    
    private static StringBuilder getBinary(int number){
        final StringBuilder binaryRep =  new StringBuilder();
        
        while(number>=1){
            int remainder = number%2;
            number = number/2;
            binaryRep.append(remainder);
        }

        System.out.println(binaryRep);
        return binaryRep;
    }
}
