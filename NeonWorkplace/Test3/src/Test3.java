
public class Test3 {
	
	public static void main(String[] args)
	{
		Parent p=new Parent();
		p.property();
		p.marriage();
		Parent c=new Child();
		c.property();
		c.marriage();		
	}

}


class Parent
{
	public void property()
	{
		System.out.println("Land + Gold");
	}
	public void marriage()
	{
		System.out.println("subba laxmi");
	}
}


class Child extends Parent
{
	public void property()
	{
		System.out.println("Salary");
	}
	public void marriage()
	{
		System.out.println("Samantha");
	}
	public void byke()
	{
		System.out.println("Royal Enfield");
	}
}