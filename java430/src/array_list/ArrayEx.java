package array_list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayEx {

	public static void main(String[] args) {
		ArrayList<Integer> ss=new ArrayList<Integer>();
		ss.add(10);
		ss.add(78);
		ss.add(90);
		ss.add(65);
		ss.add(100);
		System.out.println(ss);
		System.out.println("+++++++++++++++++++++++++++");
		
		for(Integer i:ss)
			System.out.println(i);
		System.out.println("----------------------");
		
		Iterator<Integer> a=ss.iterator();
		
		while(a.hasNext())
			System.out.println(a.next());
		System.out.println("=============================");
		
		while(a.hasNext())//if you want to print again it will not execute.It it will execute only once.
			System.out.println(a.next());
		
	}

}
