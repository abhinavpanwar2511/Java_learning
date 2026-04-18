package MethodHiding;

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
