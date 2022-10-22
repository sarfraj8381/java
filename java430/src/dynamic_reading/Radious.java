package dynamic_reading;
import java.util.Scanner;
public class Radious {

	public static void main(String[] args) {
		float r,area,circum;
		Scanner s3 = new Scanner(System.in);
		System.out.println("enter radious");
		 r=s3.nextFloat();
		area=(float)(3.14*r*r);
		System.out.println("area= "+area);
		circum=(float)(2*3.14*r);
		System.out.println("circum = "+circum);

	}

}
