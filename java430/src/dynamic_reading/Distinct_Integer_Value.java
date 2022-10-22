package dynamic_reading;

import java.util.Scanner;

public class Distinct_Integer_Value {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter Integer");
		int a= ss.nextInt();
		int b=ss.nextInt();
		int c=ss.nextInt();
		if(a<b&&b<c||a>c&&a<b)
			System.out.println(a+" it is the middle one");
		else if(b>c&&b<c||b>c&&b<a)
			System.out.println(b+" it is the middle one");
		else
			System.out.println(c+" it is the middle one");
	}

}
