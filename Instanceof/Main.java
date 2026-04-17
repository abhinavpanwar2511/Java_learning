package Instanceof;

class Parent {
	void display1() {
		System.out.println("Parent class display1");
	}
	
	void display2() {
		System.out.println("Parent class display2");
	}
}

class Child1 extends Parent {
	@Override
	void display2() {
		System.out.println("Child class display2");
	}
	
	void child1Display() {
		System.out.println("Child1 specific method");
	}
}

class Child2 extends Parent {
	@Override
	void display2() {
		System.out.println("Child2 class display2");
	}
	
	void child2Display() {
		System.out.println("Child2 specific method");
	}
}

public class Main {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		accessDisplay(c1);
		accessDisplay(c2);
	}
	
	static void accessDisplay(Parent p) {
		p.display1();
		p.display2();
		if(p instanceof Child1) {
			((Child1)(p)).child1Display();
		}
		else if(p instanceof Child2) {
			((Child2)(p)).child2Display();
		}
	}
}