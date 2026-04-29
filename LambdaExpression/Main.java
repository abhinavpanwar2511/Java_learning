package LambdaExpression;

@FunctionalInterface
// interface Demo 
// {
// 	void display();
// }


// public class Main {
// 	public static void main(String[] args) 
// 	{
// 		Demo d = () -> { System.out.println("Welcome"); };
		
// 		d.display();
// 	}

// Or we can also write

//interface Demo
//{
//	void display(int a);
//}
//
//public class Main
//{
//	public static void main(String[] args) {
//		Demo d = (int a) -> {System.out.println(a); };
//		
//		d.display(100);
//	}
//}

//interface Demo
//{
//	void display(int a);
//}
//
//public class Main
//{
//	public static void main(String[] args)
//	{
//		Demo d = (a) -> { System.out.println(a); };
//		
//		d.display(10);
//	}
//}

//interface Demo
//{
//	void display(int a);
//}
//
//public class Main
//{
//	public static void main(String[] args)
//	{
//		Demo d = a -> { System.out.println(a); };
//		
//		d.display(30);
//	}
//}

//interface Demo
//{
//	void display(int a, int b);
//}
//
//public class Main
//{
//	public static void main(String[] args)
//	{
//		Demo d = (a, b) -> { System.out.println(a + b); };
//		
//		d.display(30, 40);
//	}
//}

//interface Demo
//{
//	int display(int a, int b);
//}
//
//public class Main
//{
//	public static void main(String[] args)
//	{
//		Demo d = (a, b) -> { return a+b; };
//		
//		int res = d.display(100, 200);
//		System.out.println(res);
//	}
//}

interface Demo
{
	int display(int a, int b);
}

public class Main
{
	public static void main(String[] args)
	{
		Demo d = (a, b) -> a+b;
		
		int res = d.display(30, 40);
		System.out.println(res);
	}
	
}
