package dynamic_reading;
import java.util.Scanner;
public class MainPower {
static int pow(int n,int p)
{
	int prod=1;
	while(p>0)
	{
		prod=prod*n;
		p--;
	}
	return prod;
}
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int n=ss.nextInt();
		//int rs=pow(n,p);
		System.out.println(pow(5,3));
		System.out.println(pow(5,0));
		System.out.println(pow(5,2));
		System.out.println(pow(0,5));
	}

}
