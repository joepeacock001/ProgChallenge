package progChallenge;

public class widget {
	
	private String name;
	private double price;
	
	public widget(String n, double p)
	{
		name = n;
		price = p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int hashCode()
	{
		int total = 0;
		for (int i=0;i<name.length();i++)
		{
			total = total + (int)name.charAt(i);
		}
		return total;
	}
	
	public String toString()
	{
		return name;
	}
	
	

}
