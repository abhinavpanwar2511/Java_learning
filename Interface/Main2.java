package Interface;

interface Calculator1 {
	void add();
	void sub();
}

interface Calculator2 {
	void mul();
	void div();
}

abstract class MyCalc implements Calculator1, Calculator2 {
	@Override
	public void add() {
		System.out.println("Addition");
	}
	@Override
	public void mul() {
		System.out.println("Multiplication");
	}
}

class Calc extends MyCalc {
	@Override
	public void sub() {
		System.out.println("Subtraction");
	}
	@Override
	public void div() {
		System.out.println("Division");
	}
}

public class Main2 {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}