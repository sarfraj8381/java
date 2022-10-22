package dynamic_reading;
import java.util.Scanner;
public class Result1 {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter Marks");
		int m1= ss.nextInt();
		int m2= ss.nextInt();
		int m3= ss.nextInt();
		int m4= ss.nextInt();
		
		double total=((m1+m2+m3+m4)*100)/400;
		if(total>85)
			System.out.println(total+"%"+"  distinction");
		else if(total>60)
			System.out.println(total+"%"+"  1st class");
		else if(total>50)
			System.out.println(total+"%"+"  2nd class");
		else if(total>=33)
			System.out.println(total+"%"+"  only paas");
		else
			System.out.println(total+"%"+"  fail");
	}

}
