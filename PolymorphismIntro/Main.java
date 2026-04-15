package PolymorphismIntro;

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
	@Override
	void fly() {
		System.out.println("Cargo plane fly at low height");
	}
}

class PassengerPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Passenger plane fly at medium height");
	}
}

class FighterPlane extends Plane {
	@Override
	void fly() {
		System.out.println("Fighter plane fly at high height");
	}
}

class Airport {
	void boarding(Plane p) {
		p.takeOff();
		p.fly();
		p.land();
	}
}


public class Main {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Airport a = new Airport();
		
		a.boarding(cp);
		a.boarding(pp);
		a.boarding(fp);
	}
}