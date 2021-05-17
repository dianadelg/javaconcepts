package leetcode.easy;

public class RomanNumeral {
		public static void main (String[] args) {
			romanToInt("IV");
		}
		//look at this later
	    public static int romanToInt(String s) {
	        int total = 0;
	        int prev = 0;
	        int tempVal = 0;
	        String[] arr = s.split("");
	        for(int i=arr.length-1; i>=0; i--){
	            String num = arr[i];
	            int tempTotal = 0;
	            System.out.println("num:"+num);
	            switch(num){
	                case "I":
	                	System.out.println("prev: " + prev);
	                    tempVal = 1;
	                    if(prev==5 || prev==10){
	                      System.out.println("prev here: " + prev + " temp val here: " + tempVal);
	                      tempTotal = prev-tempVal; 
	                      prev=tempVal;
	                      
	                      System.out.println("tempTotal diana: " + tempTotal);
	                    }else {
	                    System.out.println("total: " + total + " tempTotal: " +tempTotal+ "temp Val: " + tempVal);
	                    total+=tempTotal;
	    	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    }
	                    break;
	                case "V":
	                	System.out.println("prev: " + prev);
	                    tempVal = 5;
	                    prev=tempVal;
	                    total+=tempVal;
	    	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    break;
	                case "X":
	                	System.out.println("prev: " + prev);
	                    tempVal = 10;
	                    if(prev==50 || prev==100){
	                    	 tempTotal = prev-tempVal; 
	                    	 prev=tempVal;
		                    }
	                    total+=tempTotal;
	    	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    break;
	                case "L":
	                	System.out.println("prev: " + prev);
	                    tempVal = 50;
	                    prev=tempVal;
	                    total+=tempVal;
	    	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    break;
	                case "C":
	                	System.out.println("prev: " + prev);
	                    tempVal = 100;
	                    if(prev==500 || prev==1000){
	                    	 tempTotal = prev-tempVal; 
	                    	 prev=tempVal;
		                    }
	                    total+=tempTotal;
	     	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    break;
	                case "D":
	                	System.out.println("prev: " + prev);
	                    tempVal = 500;
	                    prev=tempVal;
	                    total+=tempVal;
	    	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    break;
	                case "M":
	                	System.out.println("prev: " + prev);
	                    tempVal = 1000;
	                    prev=tempVal;
	                    total+=tempVal;
	    	            System.out.println("total: " + total + " tempTotal: " +tempTotal);
	                    break;
	                default:
	                    break;
	            }
	        }
	        System.out.println(total);
	        return total;
	    }
	}
