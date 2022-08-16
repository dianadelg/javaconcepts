package objects;

public class LinkedList {
	public Node front = new Node();
	private int listSize = 0;
	
	public LinkedList(int data){
		this.front.data=data;
		this.front.next=null;
		this.listSize++;
	}
	
	public LinkedList() {
		this.front=null;
	}
	
	public int getSize() {
		return this.listSize;
	}
	
	public void addNode(int data) {
		//adds to the front
		Node temp = new Node(data, null); //point the next node to the front
    	if(this.front==null) {
    		this.front=temp;
    		this.listSize++;
    	}
        temp.next = front;
        this.front = temp;
        this.listSize++;
	}
	
	public void addNodeEnd(int data) {
		
		Node temp = new Node(data, null);
				
	       // check base case, header is null.
	       if (this.front == null) {
	    	   this.front=temp;
	    	   this.listSize++;
	    	   return;
	       }

	       Node ptr = front;
	       Node lag = front;
	       // loop until we find the end of the list
	       while ((ptr != null)) {
	    	   lag=ptr;
	           ptr = ptr.next;
	       }

	       //Once here, it means we reached the end
	       lag.next = new Node(data, null);
	       this.listSize++;
	       return;
	}
	
	public void printList() {
		Node ptr=this.front;
		for(int i=0; i<this.listSize; i++) {
			System.out.print(ptr.data+"---");
			ptr=ptr.next;
		}
		System.out.println();
	}
}
