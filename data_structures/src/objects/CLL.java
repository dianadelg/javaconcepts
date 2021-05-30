package objects;

public class CLL {
	Node rear;
	int size;
	
	CLL(){
		rear=null;
		size=0;
	}
	
	public void addToFront(int data) {
		Node node = new Node(data,null);
		if(this.rear==null) {
			//means initialized but nothing added to it. Empty
			node.next=node;
			rear=node;
			size++;
			return;
			//this is the circular part
		}
			//means at least one object
			node.next=rear.next;
			rear.next=node;
			size++;
	}
	
	public void search(int target) {
		if(this.rear==null) {
			System.out.println("Empty list");
			return;
		}
		
		Node ptr=rear.next; //this is the front of the list
		do {
			//not back at the front
			if(ptr.data==target) {
				System.out.println("found");
				return;
			}
			ptr=ptr.next;
		}while(ptr!=rear.next);
		//if here, not found
		System.out.println("not found");
	}
	
	public void traverse() {
		Node ptr=rear.next; //front of the list
		do {
			System.out.print(ptr.data+" -- ");
		}while(ptr!=rear.next);
		
		System.out.println();
	}
	
	public void deleteFront() {
		if(rear==null || rear.next==rear) {
			//if empty or only one object
			if(rear==null) {
				return;
			}else {
				rear=null;
				size=0;
			}
			return;
		}
		rear.next=rear.next.next;
		size--;
	}
}
