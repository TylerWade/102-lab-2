public class Example // this is main class
{
	public static void main(String [] args)
	{
		Alexandria object1 = new Alexandria("Rick G",45);
				
		Alexandria object2 = new Alexandria("Carl G",18);
		
		Hilltop h1 = new Hilltop("Maggie",26,86);
		
		
		
		
		System.out.println(h1.getName());
		
		Savior savior1=new Savior("Neagan");
		
		savior1.attack(object2.getName());

		object1.attack(savior1.getName());

		object1.destroy(savior1.getName());

	}
}