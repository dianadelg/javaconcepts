package objects;

public class GNode <T>  {
	public T data;
	public GNode<T> next;
	
	public GNode (T data, GNode<T> next) {
		this.data = data;
		this.next = next;
	}
}

/*
 * Generic node --> pass in any data type and it will work
 * 
 */
