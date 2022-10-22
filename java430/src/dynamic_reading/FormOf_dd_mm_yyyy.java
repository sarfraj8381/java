package dynamic_reading;

import java.util.Scanner;

public class FormOf_dd_mm_yyyy {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter Date");
		int dd= ss.nextInt();
		int mm= ss.nextInt();
		int yy= ss.nextInt();
		if(yy<1||dd<1||dd>31||mm<1||mm>12)
			System.out.println("Invalid");
		else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
			System.out.println("Invalid");
		else if(mm==2&&dd>29)
			System.out.println("Invalid");
		else if(!(yy%4==0&&yy%100!=0||yy%400==0)&&mm==2&&dd>28)
			System.out.println("Invalid");
		else
			System.out.println("Valid");

	}

}
