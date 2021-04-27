package objects;

public class Node {
    public int data;
    public Node next;
    
    public Node(int data,  Node next){
        //the constructor -- complete with data and ptr to next node
        this.data = data;
        this.next=next;
    }
    
    public Node() {
    	//remember from software meth
    }
}
