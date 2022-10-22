package array_list;
import java.util.ArrayList;
public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList<Object>ar=new ArrayList<Object>();
		ar.add(10);
		ar.add("Sarfraj");
		ar.add(100.98);
		ar.add(true);
		ar.add(70000d);
		System.out.println(ar);
		ar.add(100,"Sonu");
		System.out.println(ar);
		boolean b = ar.contains(100);
		if(b==true)
		{
			System.out.println("100 present in the list");
		}
		else
		{
			System.out.println("not present");
		}
		

	}

}
