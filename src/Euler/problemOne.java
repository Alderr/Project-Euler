
//Purpose: 	Find the sum of all the multiples of 3 or 5 below 1000.


public class problemOne
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		//variables
		int total = 0;
		int howMany = 1000;
		
		//main
		for(int i = 0; i < howMany; i++)
		{
			if(i%3 == 0 || i%5 == 0)
			{
				System.out.println(i);
				total = total + i;
			}
		}
		
		//display
		System.out.println("\nTotal:" + total);
		

	}

}
