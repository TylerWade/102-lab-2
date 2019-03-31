public class Hilltop extends Alexandria
{
	private double strength;
	
	
	public Hilltop(String name,int age,double strenght)
	{
		super(name,age);
		this.strength=strength;
	}
	
	public double getStrength()
	{
		return strength;
	}
	
	public void setStrength(double strength)
	{
		this.strength=strength;
	}
}