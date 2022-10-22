package dynamic_reading;

import java.util.Scanner;

public class MainIndividualSquare {
	static int sumOfSqDigit(int x)
	{
		int sum=0;
		while(x!=0)
		{
			int d=x%10;
			sum=sum+d*d;
			x=x/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int sm=sumOfSqDigit(n);
		System.out.println("sum of square of digit is "+sm);
	}

}
