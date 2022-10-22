//to calculate sum of digits

package dynamic_reading;
import java.util.Scanner;
public class MainSum {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum of digits : "+sum);
	}

}
