package dynamic_reading;
import java.util.Scanner;
public class Divisible_by_3_4_5 {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("enter integer");
		int n=ss.nextInt();
		if(n/3==0||n/4==0||n/5==0)
			System.out.println(n+" divisible by 3 or 4 or 5");
		else
			System.out.println(n+" is not divisible by 3 or 4 or 5");

	}

}
