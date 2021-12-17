package hackerrank.easy;

import java.util.Arrays;

public class FrequentStop {
	
	//input is n --> number of stops. Each stop is from 1...n
	//input is --> int[] --> containing instances of 1..n, this are the paths we will be taking
		// ex n = 4, int[] = [1, 2, 4, 2, 1]
	//let m be the number of paths
		//in the above case, paths are 4 paths
		//1 to 2
		//2 to 4
		//4 to 2
		//2 to 1
	//path is circular array
		// so 1 --> 2 --> 3 --> 4 --> 1 --> 2 etc
	//and finally, in the above
	//in the above case, paths are:
			//1 to 2 --> 1, 2
			//2 to 4 --> 2, 3, 4
			//4 to 2 --> 4, 1, 2
			//2 to 1 --> 2, 3, 4, 1
					// 1 stopped at 3 times
					// 2 stopped at 4 times
					// 3 stopped at 2 times
					//	4 stopped at 3 times
	//given this, which is the stop that is the most frequently visited?
		//if 2+ stops are visited equally, then pick the MINIMUM number stop visited
	//in the above case, output would be: 
		// 2
	
	public static int getFrequentStop(int n, int[] stops) {
		int[] frequency = new int[n]; //create adjacent array to hold frequencies
		//because we know there are 1..n stops, we can create an array that will store these
		//where stops are 1...2...3..4
		//in adjacent array, att[0] --> holds frequency of stop 1, arr[1] --> holds frequency of stop 2

		//System.out.println("Stops:     " + Arrays.toString((stops)));
		for(int i = 0; i < stops.length-1; i++) {
			int starting = stops[i];
			int ending = stops[i+1];
			//System.out.println("starting: " + starting + "   ending: " + ending);
			
			int x = starting;
			do {
				//System.out.println("x: " + x); //1             //2 
				frequency[x-1] = frequency[x-1] + 1;
				//System.out.println("Frequency:     " + Arrays.toString((frequency)));
				if(x==n) { // 1 == 4? no. 2 == 4? no               2 == 4
					if(ending!=n) {
						x=1; // issue is when x = n and it is the end, it is coming in here and then looping
					}else {
						x++;
					}
				}else {
					x++; // x == 2.....x==3
				}
			}while(x!=ending);
			if(x==ending) {
				//should get here when we break out
				//System.out.println("At final stop");
				frequency[x-1] = frequency[x-1] + 1;
			}
			//System.out.println("Frequency:     " + Arrays.toString((frequency)));
		}
		
		System.out.println("-------------------------------------------");
		System.out.println(Arrays.toString((stops)));
		System.out.println(Arrays.toString((frequency)));
		
		//get max frequency. If multiple, get min stop number
		int maxIndex = -1;
		int maxValue = -1;
		for(int i = 0; i < frequency.length; i++) {
			if(frequency[i]==maxValue) {
				if(i<maxIndex) {
					maxIndex = i;
				}
			}else if(frequency[i] > maxValue) {
				maxIndex = i;
				maxValue = frequency[i];
			}
		}
		return maxIndex+1; //to offset for arrays starting with 0
		
	}
	
	public static void main(String[] args) {
		int n = 4;
		//int [] arr = {4,1};// ---> 4 1  --> 1
		//int [] arr = {2, 4}; // --> 2
		//int [] arr = {1, 2, 4, 2, 1}; // above case
		int [] arr = {1, 4, 2}; //--> 1 2 3 4, 
								//    4 1 2        --> 1
		int frequentStop = getFrequentStop(n, arr);
		System.out.println("Most frequent stop is: " + frequentStop);
	}

}


/* 
 * ALGO NOTES
 * 
 * 
 * //take array

[1,2,4,2,1]

//iterate to get each path

1 2
 - while having these as start and finish
- set a counter x at start. x = 1 While x <= 2(end)
 - increase freq of 1 (start --> if == end, complete)

- set counter x = 2
 - increase freq of 2 (start + 1 --> if == end, complete)

2 4
 - while having these as start to finish

set a counter x at start. x = 2. while 2 <= 4 (end)
 - increase freq of 2 (start --> if == end, complete)

x is now 3
 - increase freq of 3 (start + 1 --> if == end, complete)

x is now 4
 - increase freq of 4 (start + 2 --> if == end, complete)

4 2
 - while having these as start to finish
 - increase freq of 4 (start --> if == end, complete. If == n, increase n position frequency and then set counter to 1)
 - increase freq of 1 (start + 1 -->           " ")
 - increase freq of 2 (start + 2 --> >"")

2 1
- increase freq of 2. If 2 == end, complete. If 2 == n (4), change n to 1. Else --> this is issue
*/
