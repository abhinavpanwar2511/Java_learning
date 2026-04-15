package Upcasting;

class Plane {
	void takeOff() {
		System.out.println("Plane is taking off");
	}
	
	void fly() {
		System.out.println("Plane is flying");
	}
	
	void land() {
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane {
	void fly() {
		System.out.println("Cargo plane fly at low height");
	}
}

class PassengerPlane extends Plane {
	void fly() {
		System.out.println("Passenger  plane fly at medium height");
	}
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighter plane fly at high height");
	}
}

public class Main {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		
		Plane p;
		
		p = cp;     // This is known as upcasting.
		p.takeOff();
		p.fly();
		p.land();
		System.out.println("-----------");
		
		
		
		PassengerPlane pp = new PassengerPlane();
		pp.takeOff();
		pp.fly();
		pp.land();
		System.out.println("-----------");
		
		
		
		FighterPlane fp = new FighterPlane();
		fp.takeOff();
		fp.fly();
		fp.land();
	}
}