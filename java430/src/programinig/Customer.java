package programinig;

public class Customer extends Person {
int cid;
String add;
public Customer(int cid,String name,int age, String add) {
	super(name,age);
	this.cid = cid;
	this.add = add;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", add=" + add + ", name=" + name + ", age=" + age + "]";
}

}
