package upcasting1;

public class Driver {

	public static void main(String[] args) {
		Chair c = new Table();
		c.display();
		c.show();

	}

}
