package constructor_chaining1;

public class WashingMachine extends Appliances {
	int capacity;
	String typee;
	void showWashingMachine()
	{
		System.out.println("Capacity of Washing Machine is "+capacity);
		System.out.println("type of Washing Machine is "+typee);
		System.out.println("Appliances peice is "+price);
		System.out.println("brand is "+brand);
		System.out.println("color is "+color);
	}
	WashingMachine(double price,String brand,String color,int capacity,String typee)
	{
		super(price,brand,color);
		this.capacity=capacity;
		this.typee=typee;
		
		
	}

}
