package dynamic_reading;
import java.util.Scanner;
public class MainPerfect {
	static boolean isPerfectN(int x)
	{
		int sum=0;
		for(int i=1;i<=x/2;i++)
		{
			if(x%i==0)
			sum=sum+i;
		}
		return sum==x;
	}
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		boolean rs=isPerfectN(n);
		if(rs==true)
		{
			System.out.println(n+" is perfect number");
		}
		else
			System.out.println(n+" is  not perfect number");
	}

}
