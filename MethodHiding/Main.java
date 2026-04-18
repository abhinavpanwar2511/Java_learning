package MethodHiding;


// Method hiding happens when the static method in the child class has the same
// name parameters as static method in the parent class. In this case, the method
// in the child class hides the method in the parent class.



class Parent {
	static void display() {
		System.out.println("Hi");
	}
}

class Child extends Parent {
	static void display() {
		System.out.println("Hello");
	}
}

public class Main {
	public static void main(String[] args) {
		Child.display();
	}
}
