package constroctor_chaining;

public class Human {
	int age;
	String name;
	void showHuman()
	{
		System.out.println("Age is " +age);
		System.out.println("Name is " +name);
	}
	
	Human(int age, String name)

	{
		super();
		this.age=age;
		this.name=name;
	}

}
