package Interface;

// We can have empty interface. It is also called as Marker interface or Tagged interface.

// Interface can have default methods int it.

// Interface can have static methods, private methods.

interface Demo
{
	void display1();
	
	default void display2()
	{
		System.out.println("Welcome");
	}
}

class Program implements Demo
{
	@Override
	public void display1() {
		System.out.println("Good morning");
	}
}

public class Main4 
{
	public static void main(String[] args)
	{
		Program p = new Program();
		p.display1();
		p.display2();
	}

}
