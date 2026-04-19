package PureAbstract;

abstract class Animal {
	abstract void eat();
	
	abstract void sleep();
	
	abstract void walk();
}

class Deer extends Animal {
	@Override
	void eat() {
		System.out.println("Deer is eating grass");
	}
	@Override
	void sleep() {
		System.out.println("Deer is sleeping");
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
	void sleep() {
		System.out.println("Tiger is sleeping");
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
	void sleep() {
		System.out.println("Monkey is sleeping");
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