package dynamic_reading;
import java.util.Scanner;

public class Check_Even_Ood {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the number");
		int num=s1.nextInt();
		if(num%2==0)
		{
			System.out.println(num+" it is even");
		}
		else
		{
			System.out.println(num+" it is odd");
		}

	}

}
