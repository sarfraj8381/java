package dynamic_reading;
import java.util.Scanner;
public class MainPtr1 {
	public static void main(String[] args) {
	Scanner ss =new Scanner(System.in);
	System.out.println("enter the number");
	int n=ss.nextInt();
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
	}
	}

}
