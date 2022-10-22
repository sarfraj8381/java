package oop;

class Vehicle1{
	String brand;
	double price;
  public void display()
	{
		System.out.println("it is also a vehicle");
	}
}

public class Car1 extends Vehicle1 {
	public void showCar1()
	{
		System.out.println("it is a CAR");
	}

	public static void main(String[] args) {
		Car1 c1=new Car1();
		c1.display();
		c1.brand="enfeild";
		c1.price=5000000d;
		System.out.println("c1.brand");
		System.out.println(c1.price);
		c1.showCar1();
		

	}

}
