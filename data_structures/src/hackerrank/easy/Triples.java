package hackerrank.easy;

public class Triples {
	
		/* Given an array of N distinct integers and an integer threshold t, how many
	  		how many (a,b,c) indexes exist that satisfy BOTH of the following constraints?
	  		
	  		d[a] < d[b] < d[c]
	  		d[a] + d[b] + d[c] <= t
	  		
	  		Returns a long of the number of (a,b,c) triplets that exist given the above conditions
		*/
	
	public static long triplets (int[] d, int t) {
		//if we sort the array
		//nlogn --> put them in order ex [1,4,2,0] --> [0,1,3,4] --> no need to sort
		//then iterate through --> n for n elements 
		//runtime is nlogn + n --> nlogn
		
		//example2: [1,4,3,2,5]
		
		long numberOfTriplets = 0;
		
		if(d.length<3) {
			return numberOfTriplets;
		}else {
		
			for(int i=0; i< d.length; i++) {
				//get first element
				for(int j = i + 1; j < d.length; j++)
					//get second element
					for(int k= j+1; k < d.length ; k++) {
						//get third element
						
						if(d[i] + d[j] + d[k] <= t) {
							if((d[i] < d[j] && d[i] < d[k]) ||
							   (d[i] < d[k] && d[i] < d[j]) ||
							   (d[j] < d[i] && d[j] < d[k]) ||
							   (d[j] < d[k] && d[j]< d[i]) ||
							   (d[k] < d[i] && d[k]< d[j]) ||
							   (d[k] < d[j] && d[k]< d[i])) {
								System.out.println("d[k]: " +  d[k] + " d[i]: " + d[i] + " d[j]: " + d[j]);
								numberOfTriplets++;
							}
						}
					}
			}
		}
		
		return numberOfTriplets;
	}
	
	public static void main (String[] args) {
		//int[]arr = {1,4,3,2,5}; --> UNORDERED list, pass
		//int[] arr  = {1,2,3,4,5}; //--> ORDERED list, pass
		//int[] arr = {1,2}; // too small, return 0 --> pass
		//int[] arr = {1,2,3}; // return 1 --> pass
		// int[] arr = {2,3,1}; // return 1 --> pass
		//int[] arr = {2,4,1,5,7};  // with threshold 11 --> 5, pass
		//int thresh = 11;
		int[] arr = {1,2,3,4,6};  // with threshold 11 --> 5, pass
		int thresh = 8;
		long number = triplets(arr, thresh);
		System.out.println("Distinct triplets: " + number);
		return;
	}
	
	//this runtime is bad. O(n^3)

}
