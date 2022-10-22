package dynamic_reading;
import java.util.Scanner;
public class Without_Modulus_Find_Even_Odd {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter number");
		int a= ss.nextInt();
		if(a/2*2==a)
			System.out.println("even number");
		else
			System.out.println("odd number");

	}

}
