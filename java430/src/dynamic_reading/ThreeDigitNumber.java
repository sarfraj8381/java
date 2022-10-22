package dynamic_reading;

import java.util.Scanner;

public class ThreeDigitNumber {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter integer");
		int n= ss.nextInt();
		if(n>=100&&n<=999||n>=-999&&n<=-100||n>=-99&&n<=-10)
		
			System.out.println(n+" it is a three digit number");
		
		else 
			System.out.println(n+" it is not a three digit number");


	}

}
