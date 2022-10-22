package dynamic_reading;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter length");
		int length=ss.nextInt();
		System.out.println("enter breath");
		int breath = ss.nextInt();
		int area=length*breath;
		System.out.println(area+"area");
		int perimeter=2*(length+breath);
		System.out.println(perimeter+"perimeter");

	}

}
