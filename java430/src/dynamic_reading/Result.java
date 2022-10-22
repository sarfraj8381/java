package dynamic_reading;
import java.util.Scanner;
public class Result {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter Marks");
		int m1= ss.nextInt();
		int m2= ss.nextInt();
		int m3= ss.nextInt();
		int m4= ss.nextInt();
		
		/*int total=(m1+m2+m3+m4)/400;
		if(total<33)
			System.out.println("paas");
		else
			System.out.println("fail");*/
		/*if(m1<33||m2<33||m3<33||m4<33)
			System.out.println("student is fail");
		else
			System.out.println("student is paas");*/
		if(m1<=33&&m2<=33&&m3<=33&&m4<=33)
			System.out.println("student is pass");
		else
			System.out.println("student is fail");

	}

}
