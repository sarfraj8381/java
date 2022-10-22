package dynamic_reading;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter number");
		int n= ss.nextInt();
		switch(n%2)
		{
		case 0: System.out.println(n+" is even");
		break;
		case 1:System.out.println(n+" is odd");
		}
	}

}
