package leetcode.easy;
import java.util.*;

public class PalindromeNumber {

	    public boolean isPalindrome(int x) {
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
	            System.out.println(character);
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
