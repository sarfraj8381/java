package dynamic_reading;
import java.util.Scanner;

public class ValueNagPosi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the integer value:");
		int num= s.nextInt();
		
		if(num>=0)
		{
		System.out.println(num+ " : it is positive");	
		}
		else if(num<0)
		{
			System.out.println(num+ " : it is nagative");
		}
		
		

	}

}
