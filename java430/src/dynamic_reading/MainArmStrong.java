package dynamic_reading;
import java.util.Scanner;
public class MainArmStrong {
	static boolean isArmStrong(int x)
	{
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum=sum+d*d*d;
			x=x/10;
		}
		while(x!=0);
		return sum==temp;
	}
	public static void main(String[] args) {
		 Scanner ss=new Scanner(System.in);
			System.out.println("enter the number");
			int n=ss.nextInt();
			boolean rs=isArmStrong(n);
			if(rs==true)
				System.out.println("it is armstrong number");
			else
				System.out.println("it is not armstrong number");
	}

}
