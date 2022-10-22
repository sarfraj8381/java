package dynamic_reading;
import java.util.Scanner;
public class Wire {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter centimeter");
		float cm=ss.nextFloat();
		System.out.println((cm/30.48)+"feets");
		System.out.println((cm/2.54)+"inch");
		System.out.println((cm/100)+"meter");
		

	}

}
