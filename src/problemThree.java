import java.util.ArrayList;
import java.util.Scanner;


//Purpose: What is the largest prime factor of the number 600851475143

public class problemThree
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> listTaken = new ArrayList<Integer>()	;
		
		//have to define long (var) = (num)l;
		
		long numGiven = 600851475143l;
		//long numGiven = 9993l;S
		double largePrime = 0;
		boolean notFound = true;
		long largestPrime = 0;
		boolean isPrime = false;
		
		//------
		long numm = 600851475143l;
		long newnumm = numm;
		long largestFact = 0;
		
		Scanner whichOne = new Scanner(System.in);
		int answer = 0;
		System.out.println("1 or 2.");
		answer = whichOne.nextInt();
		
		//timing it.
		long startTime = System.currentTimeMillis();
		
		if(answer == 1)
		{
			//check if its divisible by itself and 1 only
			//0,1 are not included.
			//go on a number between numGiven; check if its prime
			
			//when to stop
			long rotations = 0;
			long pastPrime = 0;
			
			for(int i = 2; i < numGiven; i++)
			{
				System.out.println(i);
				
				//check if Prime
				isPrime = true;
				if(i%2 == 0)
				{
					isPrime = false;
				}
				
				//go through 2 and num between 2~numGiven to see if its prime; not divisible by anything
				if(i%2 != 0)
				{
					
				for(int s = 3; s*s < i; s+=2)
				{
					if(i%s == 0)
					{
						isPrime = false;
						break;
					}	
				
				}
				
				}
				
				if(isPrime == true && numGiven%i == 0)
				{
					largestPrime = i;
					pastPrime = i;
					System.out.println("Prime: " + largestPrime);
					try
					{
					Thread.sleep(999);
					} 
						
					catch(InterruptedException e)
					{
						e.printStackTrace();
					}
				}
				
				rotations++;
				
				if(rotations == numGiven/3 && largestPrime == pastPrime)
				{
					break;
				}
					
				else if(rotations == numGiven/3 && largestPrime != pastPrime)
				{
					rotations = 0;
				}
			}
			
		}
		
		if(answer == 2)
		{
			
			 
			int counter = 2;
			while (counter * counter <= newnumm) 
			{
				System.out.println((counter*counter) +  " <= " + (newnumm) + "?");
				
			    if (newnumm % counter == 0)
			    {
					System.out.println(newnumm + " divided by " + counter + " has no remainder so..");
			        newnumm = newnumm / counter;
			        largestFact = counter;
			    }
			    
			    else
			    {
					System.out.println(newnumm + " divided by " + counter + "has a remainder so increase counter");
			        counter++;
			    }
			}
			
			if (newnumm > largestFact) { // the remainder is a prime number
			    largestFact = newnumm;
			}
		}
		
		
		
		//check if its divisible by itself and 1 only
		//0,1 are not included.
		//go on a number between numGiven; check if its prime
		
		
		
		System.out.println("\nHere: " + (answer == 1 ? largestPrime:largestFact));
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println((double)totalTime/1000);
		
	

	}
}