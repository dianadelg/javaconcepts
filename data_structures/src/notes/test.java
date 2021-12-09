package notes;

import java.util.ArrayList;
import java.util.List;

public class test {
	
	public static void main(String[] args) {
		List<Integer> magic = new ArrayList<Integer>();
		List<Integer> dist = new ArrayList<Integer>();
		System.out.println(getStartPoint(magic, dist));
	}
	
	//Aladdin magic carpet

	private static int getStartPoint(List<Integer> magic, List<Integer> dist) {
		int start = 0;
		int magicTraveled = 0; //tvalue
		int length = magic.size();
		int magicRemaining = 0;
		
	    for(int i=0;i<length;i++){
	    	int remaining = magic.get(i) - dist.get(i);
	    	//System.out.println(remaining);
	        magicRemaining += remaining; //need to do yours as +=
	        if(magicRemaining < 0){
	           start = i+1;
	           magicTraveled += magicRemaining;
	           magicRemaining = 0; //need to add this in
	        }
	    }
	    if(magicTraveled + magicRemaining >= 0) {
	    	return start;
	    }else {
	    	return -1;
	    }
	   // return d + r >= 0 ? s : -1;
	}
	
	

}
