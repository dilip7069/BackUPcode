package Fibionnic;
import javax.jws.WebService;

@WebService
public class Fibionnic {
	public void constructor()
	{}
	public int Fib(int val)
	{
		int x[] = new int[val];
		x[0]=0;
		x[1]=1;
		for(int i=2;i<val;i++)
		{
			x[i]=x[i-1]+x[i-2];
		}
		return x[val-1]+x[val-2];
		
	}

	
}
