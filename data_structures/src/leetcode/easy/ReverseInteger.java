package leetcode.easy;
/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 
 Testcases:
 123
-123
120
0

Your runtime --> iterating through loop that takes O(log n) time because there are roughly log_10(n) digits in n
and all of the checks we do are constant and not contingent on input size
Your space --> O(1), not contingent on input size, will take the same time regardless of digits
 
 */
public class ReverseInteger {
	public static void main (String[]args) {
		int num = -2147483412;
		System.out.println(Reverse(num));
	}
	public static int Reverse(int x) {
	        long revNum = 0;
	        boolean isNegative=false;
	        if(x<0){
	            isNegative=true;
	            x=x*(-1);
	        }
	        if(x==0){
	            return 0;
	        }
	        int length = (int) (Math.log10(x) + 1);
	        for(int i = length-1; i>=0;i--){
	            //124 length = 3
	        	
	            revNum += ((Math.pow(10,i))*(x%(10)));
	            x=x/10;           
	        }
	        
	        if (revNum < Integer.MIN_VALUE || revNum > Integer.MAX_VALUE) {
	            return 0;
	        } else {
	            if(isNegative==true){
	                return (int)revNum*(-1);
	            }else{
	                return (int)revNum;
	            }
	        }
	    }
	
}
