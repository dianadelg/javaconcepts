package leetcode.easy;

import java.util.Arrays;

public class ReverseString {
	public static void reverseString(char[] s) {
        //input: arr of size n
        //output: arr of size n
        //error/conditions: if size 1 --> return array
        
        //case 1: swap each letter --> runtime would be O(n/2) because would only go
        //through half of the list
            // space --> O(1) because we are not creating a new array
        
        for(int i=0; i<=(s.length/2)-1; i++){
            // 0 1 2
            char front = s[i];
            char back = s[s.length-1-i];
            //do the swap
            s[i] = back;
            s[s.length-1-i] = front;
        }
        
        System.out.println(Arrays.toString(s));
        return;
    }
	
	public static void main (String[] args) {
		char[] s = {'A',' ','m','a','n',',',' ','a',' ','p','l','a','n',',',' ','a',' ','c','a','n','a','l',':',' ','P','a','n','a','m','a'};
		//char [] s = {'h','a','n','d'};
		System.out.println("original string: ");
		System.out.println(Arrays.toString(s));
		System.out.println("reversed string: ");
		reverseString(s);
	}
	
	/*
	 * 
	 * Leetcode Stats:
	 * Runtime: 1 ms, faster than 89.00% of Java online submissions for Reverse String.
       Memory Usage: 54.9 MB, less than 30.87% of Java online submissions for Reverse String.
	 * 
	 * */
}
