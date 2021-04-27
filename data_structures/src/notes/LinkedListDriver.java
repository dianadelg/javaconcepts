package notes;

import objects.LinkedList;

public class LinkedListDriver {
	
	public static void main (String[]args) {
		LinkedList list = new LinkedList(10);
		list.printList();
		System.out.println("List size: " + list.getSize());
		list.addNode(100);
		list.printList();
		System.out.println("List size: " + list.getSize());
		
	}

}
