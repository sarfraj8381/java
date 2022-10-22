package run_time_polymorphism1;

public class Driver {

	public static void main(String[] args) {
		Drink d = new Drink();
		d.addthings();
		Juice j = new Juice();
		j.addthings();
		Shake s = new Shake();
		s.addthings();
		
		Drink d1 = new Juice();
		d1.addthings();
		
		Drink d2 = new Shake();
		d2.addthings();
		

	}

}
