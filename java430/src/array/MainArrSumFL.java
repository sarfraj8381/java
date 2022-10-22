package array;

public class MainArrSumFL {
	static int sumOfFL(int ar[])
	{
		return ar[0]+ar[ar.length-1];
	}
	
	public static void main(String[] args) {
		int x[]= {12,34,56,78,98,76};
		int sm=sumOfFL(x);
		System.out.println("sum of first and last : "+sm);
	}

}
