package cp;
import java.util.*;
import java.util.Arrays;

public class run {
	 public static void main (String[]args){
		 int num, temp, digit, count = 0;
		 int check =0;
		 int fina = 0;
	        
	        //getting the number from user
	       for (num = 0; num<10000;num++) {
	        
	        //making a copy of the input number
	    
	    	temp = num;
	        
	        while(temp > 0)
	        {
	            digit = temp % 10;
	            //System.out.println("Digit at place "+count+" is: "+digit);
	            if(digit==5) {
	            	check++;
	            }
	            
	            temp = temp / 10;
	            
	        }	
	        
	    // System.out.println(check+ "num is" + num);
	        
	        if(check == 1) {
	        	fina++;
	        	//
	        }check =0;
	        }
	       System.out.println(fina );
		 } 
}