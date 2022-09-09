package pack;

public class Main 
{
	public static void main(String[] args) 
	{
		Salesman PrisonersWithJobs[] = 
		{
			new Salesman("Bob", 600),
			new Salesman("Mike", 300),
			new Salesman("Steve", 400),
			new Salesman("Jose", 200),
			new Salesman("Carlos", 500),
			new Salesman("Sam", 100),
			new Salesman("Charleston Entertainment Cheese III", 700),
			new Salesman("JoeBama", 800)
		};
		
		
		
		Salesman BestPrisoners[] = Salesman.topFive(PrisonersWithJobs);
		for(int i=0; i<BestPrisoners.length; i++)
		{
			System.out.println(BestPrisoners[i].name);
		}
	
	}
}


//return tacos