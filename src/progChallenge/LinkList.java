package progChallenge;

public class LinkList {

	private Node head;
	private int length = 0;
	boolean isSorted = false;
	
	public LinkList(Node h)
	{
		head = h;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public Node getHead()
	{
		return head;
	}
	
	
	
	public void insert(Node toInsert)
	{
		toInsert.setNext(head.getNext());
		head.setNext(toInsert);
		isSorted = false;
	}
	
	public Node find(String toFind)
	{
		Node temp = head;
		while (temp.getNext() != null)
		{
			if (temp.getNext().getData().toString().compareTo(toFind) == 0) return temp.getNext();
			else if (isSorted && toFind.compareTo(temp.getNext().toString()) > 0) break; 
			else temp = temp.getNext();
		}
		return null;
	}
	
	public String toString()
	{
		return null;
	}
	
}
