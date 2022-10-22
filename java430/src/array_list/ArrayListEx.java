package array_list;
import java.util.ArrayList;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(50);
		al.add(100);
		al.add(112);
		al.add(34);
		al.add(98);
		System.out.println(al);
		al.add(2,80);
		System.out.println(al);
		boolean b = al.contains(80);
		if(b==true)
		{
			System.out.println("85 present in the list");
		}
		else
		{
			System.out.println("not present");
		}
		int k=al.get(3);
		System.out.println("the element in 3rd index is "+k);
		System.out.println("index of the 100 in this list is "+al.indexOf(100));
		System.out.println(al.getClass());
		al.remove(3);
		System.out.println("after removing 3rd index element current list is "+al);
		System.out.println(al.remove(2));
		System.out.println("after removing, the current list is "+al);
		System.out.println("size of the list is "+al.size());
		System.out.println("100 occoring in list 2 types index of 100 is "+al.lastIndexOf(100));
		al.add(900);
		al.add(899);
		al.add(500);
		System.out.println("printing list element again  "+al);
		System.out.println(al);
		for(Integer i:al)
		{
			System.out.println("printing in loop "+i);
		}

	}

}
