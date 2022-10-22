package static_initializer_non_static_initializer;

public class Fruit {
	String name;
	String colour;
	int price;
	static
	{
		System.out.println("class loading");
	}
	{
		System.out.println("object created");
	}
	Fruit()
	{
	}
	Fruit(String name)
	{
		this.name=name;
	}
	Fruit(String name,String colour)
	{
		this.name=name;
		this.colour=colour;
	}
	Fruit(String name,String colour,int price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
	void display()
	{
		System.out.println("name is "+name);
		System.out.println("colour is "+colour);
		System.out.println("price is "+price);
	}
	public static void main(String[] args) {
		Fruit f=new Fruit();
		Fruit f1=new Fruit("Apple");
		Fruit f2=new Fruit("Charry","red");
		Fruit f3=new Fruit("Orange","yellow",201);
		f.display();
		System.out.println("+++++++++++++++++++++++++");
		f1.display();
		System.out.println("+++++++++++++++++++++++++");
		f2.display();
		System.out.println("+++++++++++++++++++++++++");
		f3.display();
	}

}
