package dynamic_reading;
import java.util.Scanner;
public class MainPtr6 {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n = ss.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
