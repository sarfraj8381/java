package upcasting;
/* if the child class and parent class  is having static method and non static method
we cannot create method with same method name.*/

/* if the child class and parent class is having static and non static method with 
 different method name. so it is possible to convert upcasted and downcasted. */


public class Driver {

	public static void main(String[] args) {
		Bat b = new Boll();
		b.show();
		Boll w = (Boll)b;
		w.display();
		w.show();
		

	}

}
