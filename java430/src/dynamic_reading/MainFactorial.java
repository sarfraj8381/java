package dynamic_reading;
import java.util.Scanner;
public class MainFactorial {
	static int getFact(int x)
	{
		int fact=1;
		while(x>1)
		{
			fact=fact*x;
			x--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int f= getFact(n);
		System.out.println("factorial of "+n+" is "+f);
	}

}
