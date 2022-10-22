package constructor_chaining1;

public class Television extends Appliances {
	int size;
	String type;
	void showTelevision()
	{
		System.out.println("Television size is "+size);
		System.out.println("Television type is "+type);
		System.out.println("Appliances peice is "+price);
		System.out.println("brand is "+brand);
		System.out.println("color is "+color);
	}
	Television(double price,String brand,String color,int size,String type)
	{
		super(price,brand,color);
		this.size=size;
		this.type=type;
		
	}

}
