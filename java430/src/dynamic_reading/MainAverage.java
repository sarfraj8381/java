package dynamic_reading;
import java.util.Scanner;
public class MainAverage {
	static double avgDigit(int x)
	{
		double sum=0;
		int count=0;
		do {
			int d=x%10;
			sum=sum+d;
			count++;
			x=x/10;
		}
		while(x!=0);
		return sum/count;
	}
  public static void main(String[] args) {
	  Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		double a=avgDigit(n);
		System.out.println(a+" is the average of digits");
	}

}
