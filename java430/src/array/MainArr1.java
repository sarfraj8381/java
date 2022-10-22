package array;

public class MainArr1 {
	static int sumOfFL(int []ar) 
	{
	return ar[0]+ar[ar.length-1];
	}
	public static void main(String[] args) {
		int x[]= {23,45,67,43,57,98,12};
		int sm=sumOfFL(x);
		System.out.println("sum of first last element : "+sm);
	}

}
