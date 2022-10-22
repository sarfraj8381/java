package constructor_chaining1;

public class Appliances {
	double price;
	String brand;
	String color;
	void showAppliances()
	{
		System.out.println("Appliances peice is "+price);
		System.out.println("brand is "+brand);
		System.out.println("color is "+color);
	}
	Appliances(double price,String brand,String color)
	{
		super();
		this.price=price;
		this.brand=brand;
		this.color=color;
	}

}
