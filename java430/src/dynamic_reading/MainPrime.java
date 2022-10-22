package dynamic_reading;
import java.util.Scanner;
public class MainPrime {
	static boolean isPrimeN(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		boolean rs=isPrimeN(n);
		if(rs==true)
		{
			System.out.println(n+" is prime number");
		}
		else
			System.out.println(n+" is  not prime number");
	}

}
