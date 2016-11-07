package Question1;

public class FizzBuzz {

	
	public static void main(String[] args )
	{
		int start,end;
		FizzBuzz f= new FizzBuzz();
		start=5;
		end=50;
		f.printFizzBuzz(start,end);
		
	}
public void printFizzBuzz(int start,int end)
{
    if(start>end)
    {
    	return;
    }
	for(int i=start;i<=end;i++)
	{
		if(i%3==0&&i%5==0)
			System.out.println("Fizzbuzz");		
		else if(i%3==0)
			System.out.println("Fizz");
		else if(i%5==0)
			System.out.println("Buzz");
		else
			System.out.println(i);
		
	}
}

}
