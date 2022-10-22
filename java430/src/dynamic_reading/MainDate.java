package dynamic_reading;
import java.util.Scanner;
public class MainDate {
	static boolean isValidDate(int dd,int mm,int yy)
	{
		if(yy<1||dd<1||dd>31||mm<1||mm>12)
			return false;
		else if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
			return false;
		else if(mm==2&&dd>29)
			return false;
		else if(!(yy%4==0&&yy%100!=0||yy%400==0)&&mm==2&&dd>28)
			return false;
		else
			return true;
	}
	
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the number");
		int dd=ss.nextInt();
		int mm=ss.nextInt();
		int yy=ss.nextInt();
		
		boolean rs=isValidDate(dd,mm,yy);
				if(rs==true)
			System.out.println("date is valid");
				else
					System.out.println("date is invalid");
	}

}
