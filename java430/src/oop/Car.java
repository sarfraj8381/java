package oop;

class Vehicle
{
	String brand;
	void display()
	{
	System.out.println("it is vahicle");
	
	}
}




public class Car extends Vehicle
{
	public void showCar()
	{
	System.out.println("it is a car");
	
	}
	public static void main(String[] args)
	{
		
Car ob=new Car();
ob.display();
ob.brand="honda";
System.out.println(ob.brand);
ob.showCar();

	}

}
