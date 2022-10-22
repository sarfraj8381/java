package array;
import java.util.*;
public class MainArrAnoArrElement {
	public int[] insertArr(int[] x, int[] y, int in)
	{
		if(in<0||in>x.length)
		{
			System.out.println("index not in the range...");
			return x;
		}
		int z[]= new int[x.length+y.length];
		for (int i = 0; i < y.length; i++)
		{
			z[in+i]=y[i];
		}
		for (int i = 0; i < x.length; i++) 
		{
			if(i<in)
				z[i]=x[i];
			else
				z[i+y.length]=x[i];
		}
		return z;
	}
	public static void main(String[] args) {
		 MainArrAnoArrElement ao=new  MainArrAnoArrElement();
		int ar[]= {22,34,65,87,92,15};
		int br[]= {45,67,54,23};
		ar=ao.insertArr(ar,br,3);
		for (int i = 0; i < ar.length; i++)
		{
			System.out.print(ar[i]+"  ");
		}
	}
}
