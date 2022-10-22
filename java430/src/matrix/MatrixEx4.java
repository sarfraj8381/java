package matrix;
import java.util.Scanner;
public class MatrixEx4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter row");
		int row = s.nextInt();
		System.out.println("enter colum");
		int col = s.nextInt();
		
		int sa[][]= new int [row][col];
		System.out.println("enter element");
		
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<col;c++)
			{
				sa[r][c]=s.nextInt();
			}
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
				System.out.print(sa[i][j]+"       ");
				}
				System.out.println();
			}
		}
		
	}

}
