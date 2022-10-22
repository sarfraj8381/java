package dynamic_reading;
import java.util.Scanner;
public class PrimeDigitFind {
	static int countPrimeDigit(int n)
	{
		int pcount=0;
		do {
			int r=n%10;
			if(r==1||r==2||r==3||r==5||r==7)
				pcount++;
			n=n/10;
		}
		while(n!=0);
		return pcount;
	}
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		int rs=countPrimeDigit(n);
		System.out.println(rs+" count the prime number");
	}
}
