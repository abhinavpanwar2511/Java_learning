package ImpureAbstract;

abstract class Animal {
	abstract void eat();
	void sleep() {
		System.out.println("Animal is sleeping");
	}
	abstract void walk();
}

class Deer extends Animal {
	@Override
	void eat() {
		System.out.println("Deer is eating grass");
	}
	@Override
	void walk() {
		System.out.println("Deer is running");
	}
}

class Tiger extends Animal {
	@Override
	void eat() {
		System.out.println("Tiger is eating meal");
	}
	@Override
	void walk() {
		System.out.println("Tiger is walking");
	}
}

class Monkey extends Animal {
	@Override
	void eat() {
		System.out.println("Monkey is eating fruits");
	}
	@Override
	void walk() {
		System.out.println("Monkey is jumping");
	}
}



public class Main {
	public static void main(String[] args) {
		forest(new Deer());
		forest(new Tiger());
		forest(new Monkey());
	}
	
	static void forest(Animal a) {
		a.eat();
		a.sleep();
		a.walk();
	}
}