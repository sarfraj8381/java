package programinig;
import java.util.ArrayList;
import java.util.List;
public class MainR {
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Student(123,"ramesh",23,78.90));
		persons.add(new Employee(201,"rakeh",35,78699.90));
		persons.add(new Customer(301,"rajesh",23,"JPnagar"));
		persons.add(new Student(124,"ramesh",23,78.90));
		persons.add(new Employee(205,"rakeh",36,78699.90));
		persons.add(new Customer(306,"rajesh",26,"JPnagar"));
		
		Person eper=getElderPerson(persons);
		System.out.println("elder person is:  "+eper);
		
		List<Student> lstd=getStudents(persons);
		System.out.println("student list");
		for (Student std : lstd) {
			System.out.println(std);
		}
		List<Employee> emps=getEmployee(persons);
		Employee emp=getHeighestSalary(emps);
		System.out.println("heighest salary is : "+emp);
	}
	private static Employee getHeighestSalary(List<Employee> emps) {
		Employee hsal=emps.get(0);
		for (int i = 1; i < emps.size(); i++)
		{
		if(hsal.sal<emps.get(i).sal)
			hsal=emps.get(i);
		}
		return hsal;
	}
	private static List<Employee> getEmployee(List<Person> persons) {
		List<Employee> emps=new ArrayList<Employee>();
		for (Person per : persons) {
			if(per instanceof Employee)
				emps.add((Employee) per);
		}
		return emps;
	}
	private static Person getElderPerson(List<Person> persons) {
		Person elder= persons.get(0);
		for (int i = 1; i < persons.size(); i++)
		{
		if(elder.age < persons.get(i).age)
			elder=persons.get(i);
		}
		return elder;
	}
	private static List<Student> getStudents(List<Person> persons) {
		List<Student> stds = new ArrayList<Student>();
		for (Person per : persons) {
			stds.add((Student)per);
		}
		return stds;
	}

}
