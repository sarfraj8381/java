package dynamic_reading;

import java.util.Scanner;

public class MainProduct {
	static int prodOfDigit(int x)
	{
		int product=1;
		while(x!=0)
		{
			int d= x%10;
			product=product*d;
			x=x/10;
		}
		return product;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int prod=prodOfDigit(n);
		System.out.println("product of digit is "+prod);
	}

}
