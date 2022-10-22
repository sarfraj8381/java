package method_shadowing1;
// we can create method shadowing by create object creation or by direct call with classname.
public class SmartPhone extends Phone {
	static void use()
	{
		System.out.println("latest technology is here");
	}

	public static void main(String[] args) {
		Phone.use();
		SmartPhone.use();
		

	}

}
