package array_list;
import java.util.*;
public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,String>ss=new HashMap<String,String>();
		ss.put("Studentname7", "Putturaj");
		ss.put("Studentname34", "Alex");
		ss.put("Studentname35", "Sam");
		
		ss.put("Studentname30", "Joerge");
		
		ss.put("Studentname86", "Mahi");
		System.out.println(ss);
		ss.put("Studentname90", "Mike");
		System.out.println(ss);
		ss.put("Studentname78", "Mike");
		System.out.println(ss);
		
		//ss.put("Student3name", null);
		
		//ss.put(null, "Kiran");
		
		//ss.put(null, null);//in a HashMap key and value can be null 
		System.out.println(ss);
		
		ss.put("Studentname98", "Shubham");
		System.out.println(ss);
		System.out.println(ss.entrySet());
		System.out.println(ss.keySet());
		System.out.println(ss.values());
		
		System.out.println(ss.get(ss));
		
		TreeMap<String,String>sa=new TreeMap<String,String>(ss);
		System.out.println(sa);
		System.out.println(sa.get(ss));
		
		/*HashMap<String,Object>s=new HashMap<String,Object>();
		s.put("name", "kiran");
		s.put("Age", 27);
		s.put("phone", 777798765);
		s.put("Place","chennai");
		s.put("pin code", 765489);
		
		System.out.println(s);
		System.out.println(s.entrySet());
		System.out.println(s.keySet());
		System.out.println(s.values());*/
		
	}

}
