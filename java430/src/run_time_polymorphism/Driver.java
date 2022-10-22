package run_time_polymorphism;

public class Driver {

	public static void main(String[] args) {
		Song s = new Song();
		s.rhythm();//for parent class method
		RimixSong r = new RimixSong();
		r.rhythm();// child class method
	}

}
