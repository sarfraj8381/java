package dynamic_reading;
import java.util.Scanner;
public class Biggest_One {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter integer value");
		int a=ss.nextInt();
		int b=ss.nextInt();
		int c=ss.nextInt();
		int big=a;
		if(a>b&&a>c)
			System.out.println(a+" is the biggest value");
		else if(b>c)
			System.out.println(b+" is the biggest value");
		else
			System.out.println(c+" is the biggest value");
	}

}
