package abcd;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=5;
		int a=0,b=1,c=0;
		int i=0;
		System.out.println(a);
		System.out.println(b);
		while(i<=num)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			i++;
		}
	}

}
