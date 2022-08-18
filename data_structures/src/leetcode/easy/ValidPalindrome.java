package leetcode.easy;

/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */

public class ValidPalindrome {
	
	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		System.out.println(s + "    is a palindrome?:  " + isPalindrome(s));
		
		String s1 = "racecar";
		System.out.println(s1 + "    is a palindrome?:  " + isPalindrome(s1));
		
		String s2 = "aracecar";
		System.out.println(s2 + "    is a palindrome?:  " + isPalindrome(s2));
		
	}
	
	public static boolean isPalindrome (String s) {
		//first, take string and remove all spaces and punctuation
		s = s.replaceAll("\\s+",""); // spaces
		s=s.replaceAll("\\p{Punct}", ""); // punctuation
		//convert cases to all lowercase for matching purposes
		s=s.toLowerCase();
		System.out.println(s);
		
		//now check if palindrome
		
		for(int i = 0; i < (s.length()/2); i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		
		//if it comes out of loop, means palindrome
		return true;
	}

}
