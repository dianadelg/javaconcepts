package notes;

import objects.Node;

public class NodeLinkedListDriver {
	
	public static void main(String []args){
		Node front;
        //declare --> next Node is null until we add data to the linked list
        front= null;
        printList(front); //should say nothing in it
        
        front = new Node(10, null);
        //when we do this, we get the address for this node back
        printList(front); // should only print 10
        
        //Now add a node to make this an actual list
        front.next = new Node(50, null);
        printList(front); //prints 10 -- 50
        //so we use the front, and add the next node to where this node is pointing to
        
        //can keep chaining front.next.next.next to get that many next nodes and add to it like front.next.next = new Node...
        //but usually just use a loop
        
        
        /*
            Adding to the front of a linked list
        */
        
            front=addFront (front, 1);
            printList(front); // 1--10--50
            
         /*
            Adding to the end
        */
        
            front=addBack (front, 80); 
            printList(front); // 1--10--50--80
        /*
            Add at a position after a given value in the list
        */    
            front=addAnywhere (front, 20, 10);
            printList(front); //should be 1--10--20--50--80
            
            front=addAnywhere (front,999,100000 );
            printList(front); //should be 1--10--20--50--80
            //should not add because it is not in the list
            System.out.println("DELETING");
            System.out.println("_________________________________");         
            
        /*
            Delete item not in list
        */   
            front = delete(front,0);
            printList(front); //1--10--20--50-80--
        

        /*
            Delete front
        */  
            front = delete(front,1);
            printList(front); //10--20--50-80--
         
        /*
            Delete end
        */
            
            front = delete(front,80);
            printList(front); //10--20--50--
        
        /*
            Delete somewhere in middle
        */
           
            front = delete(front,20);
            printList(front); //10--50--
            front = delete(front,10); //50--
            printList(front);
            front = delete(front,20); //already deleted 20 from before, just make sure it doesn't say correct
            printList(front); //50--
            front=delete(front,50); //empty
            printList(front);
            
            
        /*
            Delete from empty list
        */
            front = delete(front,80);
            printList(front); 
            
     }


    public static Node addFront (Node front, int data){
        Node temp = new Node(data, null); //point the next node to the front
    	if(front==null) {
    		front=temp;
    		return front;
    	}
        temp.next = front;
        front = temp;
        return front; //return the updated front. 
    }
    
    public static Node addBack (Node front, int data){
        Node temp = new Node (data, null);
        //check if list passed in is null
         if(front == null){
            front = temp;
            return front;
        }
        //else add to back
        Node ptr = front;
        while (ptr.next!=null){
            ptr=ptr.next;
        }
        //when it breaks out, it means ptr.next is null or we are at the end of the node
        
        ptr.next=temp;
        return front; //could also return void 
    }
    
    public static Node addAnywhere (Node front, int data, int addAfter){
        //let's say we want to add after value 500
        Node temp = new Node (data, null);
        if(front == null){
            front = temp;
            return front;
        }
        Node ptr = front;
        Node lag = ptr;
        while(ptr != null){
            if(ptr.data==addAfter){
                temp.next=ptr.next;
                ptr.next=temp;
                return front;
            }
            lag=ptr;
            ptr=ptr.next;
        }
        System.out.println("Not added. Node value " + data + " not in list!");
        //if we get here, means it wasn't found
        //so we will just not add it
        return front;
        
    }
    
    public static Node delete(Node front, int data) {
    	if(front==null) {
    		//nothing to delete
    		throw new IllegalArgumentException("Empty list. Nothing to delete");
    	}
    	
    	if(front.data == data) {
    		//delete only item and return null
    		System.out.println("Item was first item in list. Deleting.");
    		front=front.next;
    		return front;
    	}
    	Node ptr=front;
    	Node lag = ptr;
    	while(ptr!=null) {
    		if(ptr.data==data) {
    			//then delete the item
    			lag.next = ptr.next;
    			System.out.println("Item "+data + " deleted from list.");
    			return front;
    		}
    		lag=ptr;
    		ptr=ptr.next;
    	}
    	System.out.println("Item "+data + " not found in list and cannot be deleted.");
    	//if we get here, it means we did not find it
    	return front;
    }
    
    public static void printList(Node front){
        if (front==null){
            System.out.println("Empty list");
            return;
        }
        Node ptr = front;
        while (ptr!=null){
            System.out.print(ptr.data+"--");
            ptr=ptr.next;
        }
        System.out.println();
        return;
    }

}

