package dynamic_reading;

import java.util.Scanner;

public class Reverse {
	static int reverse(int x)
	{
		int rev=0;
		do
		{
			int d=x%10;
	        rev=(rev*10)+d;
	        x=x/10;
		}while(x!=0);
		return rev;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int sa=reverse(n);
		System.out.println("sum of natural no is "+sa);
	}

}
