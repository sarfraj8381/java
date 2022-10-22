package dynamic_reading;
import java.util.Scanner;
public class MainMoney {

	public static void main(String[] args) {
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter the amount");
		int amt=s3.nextInt();
		
		System.out.println(amt/2000 +" 2000rs");
		amt=amt%2000;
		System.out.println(amt/500 +" 500rs");
		amt=amt%500;
		System.out.println(amt/200 +" 200rs");
		amt=amt%200;
		System.out.println(amt/100 +" 100rs");
		amt=amt%100;
		System.out.println(amt/50 +" 50rs");
		amt=amt%2000;
		System.out.println(amt/20 +" 20rs");
		amt=amt%20;
		System.out.println(amt/10 +" 10rs");
		amt=amt%10;
		System.out.println(amt/5 +" 5rs");
		amt=amt%5;
		System.out.println(amt/2 +" 2rs");
		amt=amt%2;
		System.out.println(amt +" rs");
	}

}
