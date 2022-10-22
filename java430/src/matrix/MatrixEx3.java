package matrix;
import java.util.Scanner;
public class MatrixEx3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter row");
		int raw=s.nextInt();
		System.out.println("enter column");
		int col=s.nextInt();
		
		int ar[][]=new int[raw][col];
		System.out.println("enter elements");
		
		for(int c=0;c<raw;c++)
		{
			for(int r=0;r<col;r++)
			{
				ar[r][c]=s.nextInt();
				for(int i=0;i<raw;i++)
				{
					for(int j=0;j<col;j++)
					{
						System.out.print(ar[i][j] +"     ");
					}
						System.out.println();
				}
			}
		}
		
	}
}
	