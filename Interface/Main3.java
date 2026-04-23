package Interface;

// One interface can extend another interface.
// But cannot implements another interface.

// A class can extends another class and also implements interface at the same time.

// We can only have static final variables in interface.

interface Calculator1
{
	void add();
	void sub();
}

class Calculator2
{
	void mul() {
		System.out.println("Multiplication");
	}
	void div() {
		System.out.println("Division");
	}
}

class MyCalc extends Calculator2 implements Calculator1
{
	@Override
	public void add() {
		System.out.println("Addition");
	}
	@Override
	public void sub() {
		System.out.println("Subtraction");
	}
}

public class Main3
{
	public static void main(String[] args)
	{
		MyCalc mc = new MyCalc();
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}
