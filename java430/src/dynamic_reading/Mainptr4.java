package dynamic_reading;
import java.util.Scanner;
public class Mainptr4 {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter the no");
		int n=ss.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j=n; j>=1; j--)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

}
