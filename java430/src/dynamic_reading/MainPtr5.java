package dynamic_reading;
import java.util.Scanner;
public class MainPtr5 {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n = ss.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*"+"     ");
			}
			System.out.println();
		}
	}

}
