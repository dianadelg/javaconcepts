package leetcode.easy;

import java.util.HashSet;

/*
 * 
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

		Example 1:
		
		Input: nums = [1,2,3,1]
		Output: true
		Example 2:
		
		Input: nums = [1,2,3,4]
		Output: false
 * 
 */

public class ContainsDuplicate {
	
	public static void main (String[] args) {
		int[] nums = {1,2,3,1};
		int[] nums2 = {1,2,3,4};
		
		System.out.println("{1,2,3,1} contains duplicate?:  "  + containsDuplicate(nums));
		System.out.println("{1,2,3,4} contains duplicate?:  "  + containsDuplicate(nums2));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		if(nums.length == 0 || nums==null) {
			return false;
		}
		
		HashSet<Integer> numbers = new HashSet<Integer>(); // create new hashset, hashset doesn't allow duplicates
	    for(int x: nums){
	        if(numbers.add(x)==false){ // returns true if it didn't already exist in hashmap, false if already exists
	        	return true;
	        }
	    }
	    
	    return false; // if here, it means no duplicates
		
	}
	
	/**
	 * runtime: O(n) -- in the worst case, must look through all numbers at least once to see if there is a duplicate or not
	 * only doing a single pass because hashset .add will return true if it gets added, false if not (no duplicates)
	 * Space: O(n) -- had to create second hashset, which at worst case, would be size of list if all items are unique
	 */

}
