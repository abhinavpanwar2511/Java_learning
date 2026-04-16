package Downcasting;

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
	void carryGoods() {
		System.out.println("Cargo plane carry goods");
	}
}

class PassengerPlane extends Plane {
	void fly() {
		System.out.println("Passenger  plane fly at medium height");
	}
	void carryPassengers() {
		System.out.println("Passenger plane carry passenger");
	}
}

class FighterPlane extends Plane {
	void fly() {
		System.out.println("Fighter plane fly at high height");
	}
	void carryWeapons() {
		System.out.println("Fighter plane carry weapons");
	}
}

public class Main {
	public static void main(String[] args) {
		CargoPlane cp = new CargoPlane();
		PassengerPlane pp = new PassengerPlane();
		FighterPlane fp = new FighterPlane();
		Plane p;
		
		p = cp;    
		p.takeOff();
		p.fly();
		p.land();
		((CargoPlane)(p)).carryGoods();  // Downcasting.
		
		
		
		p = pp;
		p.takeOff();
		p.fly();
		p.land();
		((PassengerPlane)(p)).carryPassengers();  // Downcasting.
		
		
		
		p = fp;
		p.takeOff();
		p.fly();
		p.land();
		((FighterPlane)(p)).carryWeapons();  // Downcasting.
	}
}
