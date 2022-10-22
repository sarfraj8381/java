package dynamic_reading;
import java.util.Scanner;
public class Smallest_One {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter integer value: ");
		int a= ss.nextInt();
		int b= ss.nextInt();
		int c= ss.nextInt();
		int d= ss.nextInt();
		int small=a;
		if(a<b&&a<c&&a<d)
			System.out.println(a+" is the smallest value");
		else if(b<c&&b<d)
			System.out.println(b+" is the smallest value");
		else if(c<d)
			System.out.println(c+" is the smallest value");
		else
			System.out.println(d+" is the smallest value");
	}

}
