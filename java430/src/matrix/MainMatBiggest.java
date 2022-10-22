package matrix;

import java.util.Scanner;

public class MainMatBiggest {
	int[][] readMat()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row and columns");
		int row= sc.nextInt();
		int col= sc.nextInt();
		int mat[][]=new int[row][col];
		
		System.out.println("enter  "+row*col+"  element row wise");
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
	int getBiggest(int mat[][])
	{
		int big=mat[0][0];
		for (int i = 0; i < mat.length; i++)
		{
		for (int j = 0; j < mat[i].length; j++)
		{
		if(mat[i][j]>big)
			big=mat[i][j];
		}	
		
		}
		return big;
	}

public static void main(String[] args) {
	MainMatBiggest mt=new MainMatBiggest();
	int x[][]=mt.readMat();
	System.out.println("user entered matrix");
	mt.dispMat(x);
	System.out.println("biggest value is : "+mt.getBiggest(x));

}
}