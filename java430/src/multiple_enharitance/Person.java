package multiple_enharitance;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
	this.name=name;
	this.age=age;
	
	}
	public void display()
	{
		System.out.println("name is "+name);
		System.out.println("age is "+age);
	}

}
