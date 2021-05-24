package leetcode.easy;
import java.util.*;

public class PalindromeNumber {
	//the better way to approach this would've been to start backwards and analyze the beginning and end
	//because in the best case, a number is like 1122 and you immediately see 1 and 2 (front and end) != and therefore,
	//it's no. 
	//we would only need to go to halfway --> to the middle of the number and compare
	//because if 1221 --> you see 12 and 21 which is flipped
	
	//yours runs in log(n) time, which is the number of digits in x
	//but creating a stack caused extra space. Not the best. Should revisit
	
	public static void main (String[]args) {
		System.out.println(isPalindrome(1211));
	}

	    public static boolean isPalindrome(int x) {
	        if(x<0){
	            return false;
	            //we know a negative will NEVER be a palindrome
	        }
	        String original = Integer.toString(x);
	        String reverse = "";
	        //use a stack
	        Stack<Character> sta = new Stack<Character>();
	        for(int i=0; i<=original.length()-1; i++){
	            //parse through and put on the stack 
	            char character = original.charAt(i);
	            sta.push(character);
	        }
	        
	        //once done, put in string
	        for(int t = 0; t<=original.length()-1; t++){
	        reverse = reverse + sta.pop();
	        }
	        System.out.println(reverse);
	        
	        if(reverse.equals(original)){
	            return true;
	        }
	        return false;
	        
	    }
	
}
