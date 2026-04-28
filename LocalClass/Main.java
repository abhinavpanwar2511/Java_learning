package LocalClass;

class OuterClass {
	int a = 10;
	static int b = 20;
	
	void outerDisplay() {
		System.out.println("Outer class display method");
		System.out.println(a);
		System.out.println(b);
		
		class InnerClass
		{
			int c = 30;
			static int d = 40;
			
			void innerDisplay()
			{
				System.out.println("Inner class display method");
				System.out.println(c);
				System.out.println(d);
				System.out.println(a);
				System.out.println(b);
			}
		}
		
		System.out.println(InnerClass.d);
		
		InnerClass ic = new InnerClass();
		System.out.println(ic.c);
		ic.innerDisplay();
	}
}
public class Main {
	public static void main(String[] args) 
	{
		OuterClass oc = new OuterClass();
		oc.outerDisplay();
	}
}
