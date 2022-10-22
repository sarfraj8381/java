package dynamic_reading;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter Year");
		int y= ss.nextInt();
		if(y%4==0&&y%100!=0||y%400==0)
			System.out.println(y+" it is a Leap year");
		else 
			System.out.println(y+" it is not a Leap year");

	}

}
