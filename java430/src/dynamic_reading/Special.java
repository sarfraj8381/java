package dynamic_reading;
import java.util.Scanner;

public class Special {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Integer value : ");
		
		int num=s.nextInt();
		
		int d1=num/10;
		int d2=num%10;
		int sum= d1+d2+d1*d2;
		
		if(sum==num)
		{
			System.out.println(num+" is a Special two digit");
		}
		else
			System.out.println(num+" is not a Special two digit");

	}

}
