package objects;

public class DLL<T> {
	//need a front to the list to access it
	DLLNode<T> front;
	int size;

	//constructor 
	public DLL(){
		front=null;
		size=0;
	}
	
	//add to front of the list
	public void addToFront(T data) {
		DLLNode<T> node = new DLLNode<T>(data, null, front);
		//create node with data to be added to it with the prev being null and the next being front
				
		if (front != null) {
			//if list is not null, then make the front of the list's previous node as the new node
			front.prev = node;
			//reassign the current front.prev node 
		}
		//else make the new node the front
		front = node;
		//reassign the front 
		size++;
		//increase size
	}
	
	//traverse same as singly linked list
	public void traverse() {
		DLLNode<T> ptr = front;
		//start at front
		while (ptr != null) {
			System.out.print(ptr.data + " <-> ");
			ptr = ptr.next;
		}
		System.out.println();
	}
	
	//add a node after a specific number
	public void addAfter(T target, T data) {
		DLLNode<T> ptr = front;
		//make a ptr
		while (ptr != null && !ptr.data.equals(target)) {
			ptr = ptr.next;
			//iterate until target data is found
		}
		if (ptr == null) {
			return;
			//means not found or linked list was empty to begin with so we cannot add
		}
		DLLNode<T> node = new DLLNode<T>(data, ptr, ptr.next);
		//new node with the data and add after ptr
		ptr.next = node;
		//set the ptrs
		if (node.next != null) {
			node.next.prev = node;
		}
		size++;
	}
	
	//delete after a target is found
	public void delete(T target) {
		DLLNode<T> ptr = front;
		//start at front
		while (ptr != null && !ptr.data.equals(target)) {
			ptr = ptr.next;
			//iterate until target
		}
		if (ptr == null) {
			return;
			//if not found or empty, return
		}
		else {
			if (ptr.prev != null) {
				ptr.prev.next = ptr.next;
				//if previous not null (not head)
				//set ptr.prev.next as this new node
			}
			else {
				front = ptr.next;
				//if prev is null so this is the head
				//set front as the next item of the new node
			}
			if (ptr.next != null) {
				//if node.next is not last item
				ptr.next.prev = ptr.prev;
			}
		}
	}

}
