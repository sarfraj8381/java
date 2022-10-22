package abcd;

import java.util.Arrays;
import java.util.Scanner;

public class AnnagramNumber1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st string");
		String s=sc.nextLine();
		System.out.println("enter 2nd string");
		String s1=sc.nextLine();
		s=s.toLowerCase();
		s1=s1.toLowerCase();
		char ch[]=s.toCharArray();
		char ch1[]=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String s2=String.valueOf(ch);
		String s3=String.valueOf(ch1);
		if(s2.equals(s3)) {
			System.out.println("string is annagram number");
		}else {
			System.out.println("string is no annagram");
		}
	}

}
