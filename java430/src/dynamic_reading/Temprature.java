package dynamic_reading;
import java.util.Scanner;
public class Temprature {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter temprature");
		float c=ss.nextFloat();
		System.out.println((c*1.8)+32+"Fahrenheit");
		System.out.println(c+273.15+"Kalvin");

	}

}
