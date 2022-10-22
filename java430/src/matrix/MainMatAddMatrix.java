package matrix;
import java.util.Scanner;
public class MainMatAddMatrix {
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
	int[][] addMat(int a[][],int b[][])
	{
		if(a.length!=b.length||a[0].length!=b[0].length)
		{
			System.out.println("order must be same...");
			return null;
		}
		int c[][]=new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++) 
		{
		for (int j = 0; j < c[i].length; j++)
		{
		c[i][j]=a[i][j]+b[i][j];	
		}	
		}
		return c;
	}
	public static void main(String[] args) {
		MainMatAddMatrix mt=new MainMatAddMatrix();
		System.out.println("read first matrix");
		int x[][]=mt.readMat();
		System.out.println("read second matrix");
		int y[][]=mt.readMat();
		System.out.println("user entered fist matrix ");
		mt.dispMat(x);
		System.out.println("user entered second matrix ");
		mt.dispMat(y);
		int z[][]=mt.addMat(x, y);
		if(z==null)
		{
			System.out.println("addition failed ");
		}
		else
		{
			System.out.println("added matrix ");
			mt.dispMat(z);
		}
	}
}