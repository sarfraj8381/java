package array_list;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayList<Object> ss=new ArrayList<Object>();
		ss.add(100);
		ss.add("india");
		ss.add(100.89);
		ss.add("sarfraj");
		ss.add("BTM");
		System.out.println(ss);
		System.out.println("+++++++++++++++++++++++");
		
		for(Object j:ss)
			System.out.println(j);
		System.out.println("=======================");
		
		Iterator<Object> t =ss.iterator();
		while(t.hasNext())//only one time it will execute
			System.out.println(t.next());
		System.out.println("----------------------");
		while(t.hasNext()) {
			if((t.next()).equals("BTM")) {
			
			    t.remove();}}
			
			
				System.out.println(ss);
		
	}

}
