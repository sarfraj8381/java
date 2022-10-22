package encapsulation1;

public class Driver {

	public static void main(String[] args) {
		Number1 n=new Number1("sonu ",27,"PUBG");
		System.out.println(n.getName());
		System.out.println(n.getAge());
		System.out.println(n.getGtype());
		System.out.println("================================");
		n.setName("sarfraj");
		n.setAge(27);
		n.setGtype("PUBG");
		System.out.println(n.getName());
		System.out.println(n.getAge());
		System.out.println(n.getGtype());

	}

}
