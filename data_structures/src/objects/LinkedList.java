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
	
	public void printList() {
		Node ptr=this.front;
		for(int i=0; i<this.listSize; i++) {
			System.out.print(ptr.data+"---");
			ptr=ptr.next;
		}
	}
}
