package encapsulation;

public class EncpsuMain {

	public static void main(String[] args) {
		Encpsu e=new Encpsu(34, "sarfraj ahmad", 98.90);
		int n = e.getNum();
		String m = e.getName();
		double d = e.getDigit();
		System.out.println(n+"  "+m+"  "+d);
		e.setValue("mohammad");
		String na = e.getName();
		System.out.println(na);
	}

}
