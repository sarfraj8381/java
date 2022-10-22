package constroctor_chaining;

public class Student extends Human {
	String sid;
	String stream;
	void showStudend()
	{
		System.out.println("Student ID is " +sid);
		System.out.println("Stream is " +stream);
		System.out.println("Age is " +age);
		System.out.println("Name is " +name);
	}
	Student(int age, String name,String sid,String stream)
	{
		super(age,name);
		this.sid=sid;
		this.stream=stream;
	}

}
