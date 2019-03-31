public class Alexandria // this is a class
{
	private String name;
	private int age;
	
	
	
	public Alexandria(String name,int age)// constructor's name needs to be the same of the class name
	{
		this.name=name;
		this.age= age;
		
	}
	
	public void attack(String n)
	{
		System.out.println(this.name+" attacks "+n);
	}
	
	public void destroy(String n)
	{
		System.out.println(this.name+" destorys "+n);
	}

	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	

	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	

	
}