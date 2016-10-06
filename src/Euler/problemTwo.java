//Purpose:
//By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//find the sum of the even-valued terms.


public class problemTwo 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		//var
		//double is needed since the numbers get to goddamn big. remember range.
		double sum = 0;
		int howMany = 100;
		int max = 4000000;
		double answer = 0;
		double pastNum = 1;
		double temp = 0;
		double otherNum = 0;
		
		for(int i = 0; i < howMany;i++)
		{
			answer = pastNum + otherNum;
			System.out.println(answer);
			
			if(answer%2 == 0 && answer < max)
			{ 
				sum = sum + answer;
			}
			
			temp = pastNum;
			pastNum = answer;
			otherNum = temp;
			
		}
		
		System.out.println("\nSum: " + sum);
		System.out.println(1836311903 + 1134903170);
	}

}
