package notes;

import objects.GNode;
import objects.Node;


public class GNodeDriver {

	/*
	 * Used to pass any data type into the Node
	 */
	public static void main (String[] args) {
		GNode<String> front = new GNode<String>("hello", null);
		printList(front);
	}


public static <T> void printList(GNode<T> node) {
	if (node==null){
        System.out.println("Empty list");
        return;
    }
    GNode<T> ptr = node;
    while (ptr!=null){
        System.out.print(ptr.data+"--");
        ptr=ptr.next;
    }
    System.out.println();
    return;
}
	
}
