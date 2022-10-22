package method_value;

public class Student {
	int id;
	Student(int id)
	{
		this.id=id;
	}
	void display()
	{
		System.out.println("id is "+id);
	}
	public boolean equals(Object o)
	{
		Student p= (Student)o;
		return p.id==this.id;
	}

	public static void main(String[] args) {
		Student s= new Student(500);
		Student t= new Student(500);
		s.display();
		t.display();
		System.out.println(s.equals(t));
		

	}

}
