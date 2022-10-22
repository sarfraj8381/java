package exception_handling;
import java.util.*;
public class ExceptionHandling1 {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter 1st number");
		int num1=ss.nextInt();
		System.out.println("enter 2nd number");
		int num2=ss.nextInt();
		
		try
		{
			int c=num1/num2;
			System.out.println("result after divisible is  "+c);
		}
		catch(ArrayIndexOutOfBoundsException sa)
		{
			System.out.println("It is AIOOBE");
		}
		catch(ArithmeticException s)
		{
			System.out.println("Handaling");
		}
		finally
		{
		System.out.println(num1+num2);
		System.out.println("i am inside in finally");
		}
	}

}
