package dynamic_reading;
import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
		Scanner ss= new Scanner(System.in);
		System.out.println("enter side");
		int side=ss.nextInt();
		int area=side*side;
		System.out.println(area+"area");
		int perimeter=4*side;
		System.out.println(perimeter+"perimeter");

	}

}
