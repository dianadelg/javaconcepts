package leetcode.easy;

public class RomanToInt {
		public static void main (String[] args) {
			romanToInt("MCMXCIV");
		}
		
		/*
		 * 	runtime --> get string, split to each letter and hold in array --> O(n) --> changed to do in-place substring. This eliminated the need for an array
		 *  so now we just iterate through string
			then loop through each letter--> O(n) because we must check all letters otherwise number will be incorrect
			case statement --> O(1) --> does not depend on input size. Depends on roman numeral cases, which is fixed
			addition, if/else/ subtraction --> O(1) but done n times for each letter
		 *  TOTAL RUNTIME --> O(n)
		 *  
		 *  So removing print statements and changing from array split --> made our runtime go from 155ms to 22ms to 12ms!
		 */
	    public static int romanToInt(String s) {
	        int total = 0;
	        int prev = 0;
	        for(int i=s.length()-1; i>=0; i--){
	            int tempTotal = 0;
	            int tempVal = 0;
	            switch(String.valueOf(s.charAt(i))){
	                case "I":
	                    tempVal = 1;
	                    if(prev==5 || prev==10){
	                      tempTotal = prev-tempVal; 
	                      total-= prev;
	                    }else {
	                    	tempTotal = tempVal;
	                    }
	                    prev=tempVal;
	                    total+=tempTotal;
	                    break;
	                case "V":
	                    tempVal = 5;
	                    prev=tempVal;
	                    total+=tempVal;
	                    break;
	                case "X":
	                    tempVal = 10;
	                    if(prev==50 || prev==100){
	                    	tempTotal = prev-tempVal; 
		                      total-= prev;
		                    }
	                    	else {
	                    		tempTotal = tempVal;
		                    }
	                    	prev=tempVal;
		                    total+=tempTotal;
	                    break;
	                case "L":
	                    tempVal = 50;
	                    prev=tempVal;
	                    total+=tempVal;
	                    break;
	                case "C":
	                    tempVal = 100;
	                    if(prev==500 || prev==1000){
	                    	tempTotal = prev-tempVal; 
		                      total-= prev;
		                }else {
		                	tempTotal = tempVal;
	                    }
	                    prev=tempVal;
	                    total+=tempTotal;
	                    break;
	                case "D":
	                    tempVal = 500;
	                    prev=tempVal;
	                    total+=tempVal;
	                    break;
	                case "M":
	                    tempVal = 1000;
	                    prev=tempVal;
	                    total+=tempVal;
	                    break;
	                default:
	                    break;
	            }
	        }
	        System.out.println(total);
	        return total;
	    }
	}
