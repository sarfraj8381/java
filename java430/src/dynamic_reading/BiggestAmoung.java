package dynamic_reading;
import java.util.Scanner;
public class BiggestAmoung {
	static int big(int a, int b, int c)
	{
		if(a>b&&a>c)
			return a;
		else if(b>a&&b>c)
			return b;
		else
			return c;
	}
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int a=ss.nextInt();
		int b=ss.nextInt();
		int c=ss.nextInt();
		System.out.println("biggest no. is "+big(a,b,c));
	}

}
