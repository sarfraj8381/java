package array;
import java.util.*;

public class HasSetEx {

	public static void main(String[] args) {
		Scanner wh=new Scanner(System.in);
		System.out.println("enter number");
		int a=wh.nextInt();
	
	
		HashSet<Integer> ss=new HashSet<Integer>();
		ss.add(67);
		ss.add(98);
		ss.add(77);
		ss.add(12);
		System.out.println(ss);
		ArrayList<Integer> sa=new ArrayList<Integer>(ss);
		sa.add(2,66);
		sa.add(a);
		for(Integer i:sa)
			System.out.println(i);
		System.out.println("=============================");
	
		TreeSet<Integer> j= new TreeSet<Integer>(sa);
		System.out.println(j);
		//j.descendingSet();
		TreeSet<Integer> jt= (TreeSet<Integer>)j.descendingSet();
		System.out.println(jt);
		System.out.println("+++++++++++++++++++++++++++++++++");
		

	}

}
