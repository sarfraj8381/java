package dynamic_reading;

import java.util.Scanner;

public class Distinct_Integer_Value1 {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter Integer");
		int a= ss.nextInt();
		int b=ss.nextInt();
		int c=ss.nextInt();
		if(a<b&&b<c||c<b&&b<a)
			System.out.println(b);
		else if(b<c&&c<a||a<c&&c<b)
			System.out.println(c);
		else
			System.out.println(a);

	}

}
