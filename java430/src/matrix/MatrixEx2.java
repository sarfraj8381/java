package matrix;
import java.util.Scanner;
public class MatrixEx2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter row size");
		int raw=s.nextInt();
		System.out.println("enter column size");
		int col=s.nextInt();
		
		
		int arr[][]=new int[raw][col];
		System.out.println("enter element");
		
		 
		for(int r=0;r<raw;r++)
		{
			for(int c=0;c<col;c++)
			{
				arr[r][c]=s.nextInt();
			}
			for(int i=0;i<raw;i++)
			{
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+"  ");
				}
				System.out.println();
			}
		}
		

	}

}
