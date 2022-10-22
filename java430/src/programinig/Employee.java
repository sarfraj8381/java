package programinig;

public class Employee extends Person {
int eid;
double sal;
public Employee(int eid,String name,int age, double sal) {
	super(name,age);
	this.eid = eid;
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", sal=" + sal + ", name=" + name + ", age=" + age + "]";
}

}
