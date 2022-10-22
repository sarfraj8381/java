package constroctor_chaining;

public class Emply extends Human {
	String empid;
	String designation;
	void showEmply() {
		System.out.println("ID is " +empid);
		System.out.println("Designation is " +designation);
		System.out.println("Age is " +age);
		System.out.println("Name is " +name);
	}
	Emply(int age, String name,String empid,String designation)
	{
		super(age,name);
		this.empid=empid;
		this.designation=designation;
		
	}

}
