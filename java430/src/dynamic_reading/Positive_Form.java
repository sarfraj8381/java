package dynamic_reading;
import java.util.Scanner;

public class Positive_Form {

	public static void main(String[] args) {
		Scanner ob= new Scanner(System.in);
		System.out.println("enter the number");
		int num= ob.nextInt();
		if(num>=0)
		{
			System.out.println(num+" it is positive");
		}
		else
		{
			int a= num*-1;
			System.out.println(a+" it is positive");
		}
	}

}
