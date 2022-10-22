package dynamic_reading;
import java.util.Scanner;

public class Two_Integer_Value {

	public static void main(String[] args) {
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter value 1: ");
		int a=s3.nextInt();
		System.out.println("enter value 2: ");
		int b=s3.nextInt(); 
		int d=a+b;
		int e=a-b;
		int f=a*b;
		int g=a/b;
		int i=a%b;
		
		System.out.println(a+" + "+b+" = " +d);
		System.out.println(a+" - "+b+" = " +e);
		System.out.println(a+" * "+b+" = " +f);
		System.out.println(a+" / "+b+" = " +g);
		System.out.println(a+" % "+b+" = " +i);
		
	}

}
