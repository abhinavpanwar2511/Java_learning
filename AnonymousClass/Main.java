package AnonymousClass;

abstract class Program 
{
	abstract void display1();
	abstract void display2();
}


public class Main {
	public static void main(String[] args) 
	{
		Program p = new Program() {
			@Override
			void display2() {
				System.out.println("Display1 method");
			}
			@Override
			void display1() {
				System.out.println("Display2 method");
			}
		};
		
		p.display1();
		p.display2();
	}
}
