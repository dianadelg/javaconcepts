package leetcode.easy;

import objects.LinkedList;
import objects.Node;

/*
 * Merge two sorted linked lists 
 * lists are user defined objects
 */

public class MergeSortedLists {

	
	 public static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
		 LinkedList finalList = new LinkedList();
		 
	        if(list1.getSize() == 0 && list2.getSize() == 0){
	           System.out.println("Both lists null");
	        	return list1;
	        }else if(list1.getSize() == 0){
	            return list2;
	        }else if(list2.getSize() == 0){
	            return list1;
	        }else{
                //means they are both not null
	            Node ptr1 = list1.front;
	            Node ptr2 = list2.front; //grabs first element
	            int inter = 0;

    
	                while(ptr1 != null && ptr2 != null){
	                	inter++;
	                //1         2 3
	                //4         3 1
	                //grab first element
	                	if(ptr1.data < ptr2.data) {
	                		finalList.addNodeEnd(ptr1.data);
	                		//finalList.printList();
	                		ptr1=ptr1.next;
	                	}else if(ptr1.data > ptr2.data) {
	                		finalList.addNodeEnd(ptr2.data);
	                		//finalList.printList();
	                		ptr2=ptr2.next;
	                	}else {
	                		finalList.addNodeEnd(ptr1.data);
	                		finalList.addNodeEnd(ptr2.data);
	                		//finalList.printList();
	                		ptr1 = ptr1.next;
	                		ptr2 = ptr2.next;               	
	                	}
	                }
	                //if here, it means one of those are null
	                if(ptr1 == null){
//	                	System.out.println("list1 is null");
	                    while(ptr2 != null){
	                    	finalList.addNodeEnd(ptr2.data);
		                    ptr2 = ptr2.next;
	                    }
	                }else{
//	                	System.out.println("list2 is null");
	                    while(ptr1 != null){
	                        //add LinkedList to the end
	                    	finalList.addNodeEnd(ptr1.data);
	                    	
		                     ptr1 = ptr1.next;
	                    }                    
	                }
	        }
	            
	            
	        //finalList.printList();
	        return finalList;
	        
	    }//end of merge solutions method
	    

	public static void main (String[] args) {
		LinkedList diana = new LinkedList();
		diana.addNodeEnd(1);
		diana.addNodeEnd(4);
		diana.addNodeEnd(8);
		diana.addNodeEnd(9);
		
		LinkedList kyle = new LinkedList();
		kyle.addNodeEnd(2);
		kyle.addNodeEnd(3);
		kyle.addNodeEnd(7);
		
		LinkedList finalResult = mergeTwoLists(diana,kyle);
		finalResult.printList();  //test case 1 2 3 and null passed
		// test case null and 1 2 3 passed
		// test case both null passed 
		//  test case 1 4 8    and 2 3 7 passed 
		// test case 2 3 7    and 1 4 8 passed
		//  test case 1 4 8 9    and 2 3 7 passed 
		// test case 2 3 7 10    and 1 4 8 passed
		
		
	}
}
