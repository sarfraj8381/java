package dynamic_reading;
import java.util.Scanner;
public class Month {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter month number");
		int n=ss.nextInt();
		if(n<1||n>12)
			System.out.println(n+" invalid month number");
		else
			System.out.println(n+" valid month number");

	}

}
