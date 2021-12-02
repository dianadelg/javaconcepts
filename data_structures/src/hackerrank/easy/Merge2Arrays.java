package hackerrank.easy;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Merge2Arrays {

	//Given two sorted arrays, merge them into a single, sorted array with all items in non-decreasing order
	/*
	 * Example
	 * a = [1,2,3] --> int a[n]
	 * b = [2,5,5] --> int b[n]
	 * 
	 * c = [1,2,2,3,5,5]  --> int c[n+n]
	 */
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		String line = "";
		int lineCount=0;
		int arrayASize=-1;
		int arrayBSize=-1;
		int[] A = null;
		int[] B = null;
		int indexA = 0;
		int indexB = 0;
		while(scanner.hasNextLine()) {
			line = scanner.nextLine();
			if(line.isEmpty() || line == null) {
				//throw new NoSuchElementException("Empty line");
				break;
			}else {
				lineCount++;
			}
			

			if(lineCount == 1) {
				//this is array size 1
				arrayASize= Integer.parseInt(line); //parse the string to an int
				System.out.println("arrayASize: " + arrayASize);
				A = new int[arrayASize];
			}else if (lineCount==arrayASize+2) {
				//this is array size2
				arrayBSize = Integer.parseInt(line);
				System.out.println("arrayBSize: " + arrayBSize);
				B = new int[arrayBSize];
			}else if (lineCount<=arrayASize+1) {
				A[indexA] = Integer.parseInt(line);
				indexA++;
				//this is elements in arrayA
			}else if (lineCount>arrayASize+1) {
				//this is elements in arrayB
				B[indexB] = Integer.parseInt(line);;
				indexB++;
			}
			
		}
		scanner.close();
		
		//print array A
		System.out.println(Arrays.toString(A));
		
		//print array B
		System.out.println(Arrays.toString(B));
		
		int[] C= mergeArrays(A,B);
		//print ordered array
		System.out.println(Arrays.toString(C));
	}
	
	public static int[] mergeArrays (int a[], int b[]) {
		int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    while (i < a.length && j < b.length) {
	    	//while there are still elements in each array/we did not go over both indexes
	    	//System.out.println("index i : " + i + "  index j :" + j + "   index k : " + k);
	        if (a[i] < b[j]){
	            answer[k] = a[i];
	            i++;
	        }else {
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    //comes to these if we finish loop B array entirely and not A
	    while (i < a.length) {
	    	//System.out.println(" LOOP 2    index i : " + i + "  index j :" + j + "   index k : " + k);
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    //comes to this if we finish loop A array entirely and not B
	    while (j < b.length) {
	    	//System.out.println(" LOOP 3    index i : " + i + "  index j :" + j + "   index k : " + k);
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    return answer;
	}
	
	// this is an O(a.length + b.length solution)
	// which is necessary because we need to scan through each entire array to make sure we get all elements
	//optimized for small inputs
}