package progChallenge;

public class HashTable<E> {
	
	private Node[] table;
	private int size;
	int numStored = 0;
	
	public HashTable(int s)
	{
		table = new Node[s];
		size = s;
	}
	
	public void resize()
	{
		size = size*2;
		Node temp;
		Node[] newTable = new Node[size-1];
		for (int i=0;i<size;i++)
		{
			if (table[i] != null)
			{
				temp = table[i];
				add(temp, newTable);
				while(temp.getNext() != null)
				{
					add(temp.getNext(), newTable);
					temp = temp.getNext();
				}
			}
		}
	}

	public int hash(E toHash)
	{
		return toHash.hashCode()%size;
	}
	
	public void add(E toAdd, Node[] arr)
	{
		if (numStored/arr.length >=2) resize();
		
		int hash = hash(toAdd);
		Node temp = new Node(null, toAdd);
		if (arr[hash] == null)
		{
			arr[hash] = temp;
		}
		else
		{
			temp.setNext(arr[hash]);
			arr[hash] = temp;
		}
		numStored++;
	}
	
	public void add(Node toAdd, Node[] arr)
	{
		if (numStored/arr.length >=2) resize();
		int hash = hash((E)toAdd.getData());
		if (arr[hash] == null)
		{
			arr[hash] = toAdd;
		}
		else
		{
			toAdd.setNext(arr[hash]);
			arr[hash] = toAdd;
		}
		numStored++;
	}
	
}







