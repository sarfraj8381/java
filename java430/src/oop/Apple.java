package oop;

public class Apple extends Fruit {
	void showApple()
	{
		System.out.println("child class method");
	}

	public static void main(String[] args) {
		
Apple a=new Apple();
a.colour="red";
a.price=150f;
a.showFruit();
a.showApple();
System.out.println(a.colour);
System.out.println(a.price);
Fruit f = new Fruit();
f.showFruit();
//f.showApple();

	}

}
