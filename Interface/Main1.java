package Interface;

interface Calculator1 {
	void add();
	void sub();
}

interface Calculator2 {
	void mul();
	void div();
}

class MyCalc implements Calculator1, Calculator2 {
	@Override
	public void add() {
		System.out.println("Addition");
	}
	@Override
	public void sub() {
		System.out.println("Subtraction");
	}
	@Override
	public void mul() {
		System.out.println("Multiplication");
	}
	@Override
	public void div() {
		System.out.println("Division");
	}
}

public class Main1 {
	public static void main(String[] args) {
		MyCalc mc = new MyCalc();
		mc.add();
		mc.sub();
		mc.mul();
		mc.div();
	}
}