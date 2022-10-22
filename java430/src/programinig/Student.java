package programinig;

public class Student extends Person {
int sid;
double per;
public Student(int sid,String name,int age, double per) 
{
	super(name,age);
	this.sid = sid;
	this.per = per;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", per=" + per + ", name=" + name + ",  age=" + age + "]";
}

}


