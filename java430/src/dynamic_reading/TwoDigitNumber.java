package dynamic_reading;

import java.util.Scanner;

public class TwoDigitNumber {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter integer");
		int n= ss.nextInt();
		if(n>=10&&n<=99||n>=-99&&n<=-10)
		
			System.out.println(n+" it is a two digit number");
		
		else 
			System.out.println(n+" it is not a two digit number");


	}

}
