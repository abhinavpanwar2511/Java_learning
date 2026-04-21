package Interface;


// An Interface in Java programming language is defined as an abstract type used to specify the behaviour of a class. An interface in Java is a blueprint of a behaviour(method). A Java interface contains static constants static constants and abstract methods.


interface Robot {
	void work();
	void charge();
}

class TeacherRobot implements Robot {
	@Override
	public void work() {
		System.out.println("Teacher robot is teaching");
	}
	@Override
	public void charge() {
		System.out.println("Teacher robot is charging");
	}
}

class DoctorRobot implements Robot {
	@Override
	public void work() {
		System.out.println("Doctor robot is doing surgery");
	}
	@Override
	public void charge() {
		System.out.println("Doctor robot is charging");
	}
}

public class Main {
	public static void main(String[] args) {
		accessRobot(new TeacherRobot());
		accessRobot(new DoctorRobot());
	}
	static void accessRobot(Robot r) {
		r.work();
		r.charge();
	}
}