package dynamic_reading;
import java.util.Scanner;
public class MainPtr8 {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n = ss.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
