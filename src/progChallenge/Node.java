package progChallenge;

public class Node<E> {

	private Node next;
	private E data;
	
	public Node (Node n, E d)
	{
		next = n;
		data = d;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}
	
	
}
