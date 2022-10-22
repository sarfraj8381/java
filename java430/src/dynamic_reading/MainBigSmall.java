package dynamic_reading;
import java.util.Scanner;
public class MainBigSmall {
	static int getBiggest(int x)
	{
		int big=x%10;
		while(x!=0)
		{
			int d=x%10;
			if(d>big)
				big=d;
			x=x/10;
		}
		return big;
	}
	static int getSmallest(int x)
	{
		int small=x%10;
		while(x!=0)
		{
			int d=x%10;
			if(d<small)
				small=d;
			x=x/10;
		}
		return small;
	}
	public static void main(String[] args) {
	Scanner ss = new Scanner(System.in);
	System.out.println("enter number");
	int n=ss.nextInt();
	System.out.println("biggest digit is : "+getBiggest(n));
	System.out.println("smallest didit is : "+getSmallest(n));

	}

}
