package matrix;
import java.util.Scanner;
public class MainMatSum {
	int[][] readMat()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int mat[][]=new int[row][col];
		System.out.println("enter "+row*col+" element row wise");
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
		System.out.print(mat[i][j]+"  ");	
		}
		System.out.println();
		}
	}
	int sumOfMat(int mat[][])
	{
		int sum=0;
		for (int i = 0; i < mat.length; i++)
		{
		for (int j = 0; j < mat[i].length; j++) 
		{
		sum=sum+mat[i][j];	
		}	
		}
		return sum;
	}
	public static void main(String[] args) {
		MainMatSum mt=new MainMatSum();
		int x[][]=mt.readMat();
		System.out.println("user inter matrix");
		mt.dispMat(x);
		System.out.println("sum of matrix element is  "+mt.sumOfMat(x));
	}

}
