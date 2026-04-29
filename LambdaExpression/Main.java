package LambdaExpression;

@FunctionalInterface
interface Demo 
{
	void display();
}


public class Main {
	public static void main(String[] args) 
	{
		Demo d = () -> { System.out.println("Welcome"); };
		
		d.display();
	}
}
