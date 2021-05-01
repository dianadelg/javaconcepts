package leetcode.easy;
/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */

/*
 * Test Cases:
 * [2,7,11,15]
	9
	[3,2,4]
	6
	[3,3]
	6
	
	Your own cases:
	//[1,2] target 3
    //[1,1,2] target 3
    //[1,0,5,2] target 3
    //[0,1,5,2,4]
    //[0,8,2,1]
     * 
     * Your runtime = O(n^2) ehhh --> I think there was a way to do it with hashmaps but im tired
     * Your space = O(n) for new array --> optimize by just returning return new int [] = {i,y}; then it is O(1)
 */
public class TwoSum {
	public static void main (String[]args) {
		int[] arr = {1,2,3};
		int[] solution = twoSum(arr,3);
		System.out.println(solution[0]+","+solution[1]);
	}
	public static int[] twoSum(int[] nums, int target) {
	        int[] arr = new int[2];
			if(nums.length == 0 || nums.length == 1) {
				//return arr
				 throw new IllegalArgumentException("Input array too small");
			} //again, told there is at least one solution which means
	        //there must be at least 2 numbers in the array
	        for(int i=0; i<nums.length; i++){
	        	//.length not .length(); 
	            for(int y=i+1; y<nums.length; y++){
	                if(nums[i]+nums[y]==target){
	                    arr[0]=i;
	                    arr[1]=y;
	                    return arr;
	                }
	            }
	        }
	        //did this because we have to return something, but are promised there exists at least one solution
	        //return arr;
	        //would be better to throw an NIAE
	        throw new IllegalArgumentException("No solution exists");
	    }
	}
