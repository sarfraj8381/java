package compile_time_polymorphism;

public class Driver {

	public static void main(String[] args) {
		A a = new A();
		a.p();
		Y y = new Y();
		y.p();		

	}

}
