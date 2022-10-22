package matrix;

public class MatrixEx {

	public static void main(String[] args) {
		int arr[][]={{12,23,45,24},{76,90,65,24},{12,6,8,60}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+"   ");
			}
			System.out.println();
		}

	}

}
