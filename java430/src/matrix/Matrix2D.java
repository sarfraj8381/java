package matrix;

public class Matrix2D {

	public static void main(String[] args) {
		int sa[][]= {{2,3,5},{7,12,10,},{50,20,35},{4,5,7}};
		System.out.println("printing the array");
		for(int r=0;r<4;r++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.print(sa[r][c]+"   ");

			}
			System.out.println();
		}

	}

}
