package matrix;
import java.util.Scanner;
public class MainMatFindOddEven {
	int[][] readMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the row and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("enter "+row*col+" elements row wise");
		for (int i = 0; i < mat.length; i++)
		{
		for (int j = 0; j < mat[i].length; j++)
		{
		mat[i][j]=sc.nextInt();	
		}	
		}
		return mat;
	}
	void dispMat(int mat[][])
	{
		for (int i = 0; i < mat.length; i++) 
		{
		for (int j = 0; j < mat[i].length; j++)
		{
		System.out.print(mat[i][j]+" ");	
		}
		System.out.println();
		}
	}
	int[] countEO(int mat[][])
	{
		int ec=0,oc=0;
		for (int i = 0; i < mat.length; i++)
		{
		for (int j = 0; j < mat[i].length; j++)
		{
		if(mat[i][j]%2==0)
			ec++;
		else
			oc++;
		}	
		}
		int count[]= {ec,oc};
		return count;
	}
	public static void main(String[] args) {
		MainMatFindOddEven mt=new MainMatFindOddEven();
		int x[][]=mt.readMat();
		System.out.println("user enter matrix ");
		mt.dispMat(x);
		int c[]=mt.countEO(x);
		System.out.println("number is even : "+c[0]);
		System.out.println("number is odd : "+c[1]);
	}

}
