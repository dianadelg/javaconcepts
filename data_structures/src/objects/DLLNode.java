package objects;

public class DLLNode<T> {
	DLLNode<T> prev;
	T data;
	DLLNode<T> next;
	
	public DLLNode(T data, DLLNode<T> prev, DLLNode<T> next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}
	
}
