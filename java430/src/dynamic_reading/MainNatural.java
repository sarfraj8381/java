package dynamic_reading;

import java.util.Scanner;

public class MainNatural {
	static int sumOfN(int x)
	{
		int sum=0;
		for(int i=1;i<=x;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int sm=sumOfN(n);
		System.out.println("sum of first "+n+" natural number is "+sm);

	}

}
