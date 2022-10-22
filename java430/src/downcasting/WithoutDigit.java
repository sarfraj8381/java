package downcasting;

public class WithoutDigit {

	public static void main(String[] args) {
		int a = 'B'/'B';
		String j = "**********";
		//without using any integer  value print 1 to 100
		for(int i=a; i<=(j.length()*j.length());i++ ) {
			System.out.println(i);// output 1,2,3,4,5.....100
		}
	}

}
