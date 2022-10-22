package hashMap;
import java.util.*;
class Student
{
	String name;
	int age;
	int id;
	
	Student(String name,int age,int id)
	{
		this.name=name;
		this.age=age;
		this.id=id;
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return id+" "+name+" "+age;
	}
	
}
public class MapEx {
	public static void main(String[] args) {
		HashMap<String,Object> h=new HashMap<String,Object>();
		h.put("s1",new Student("aryan",234,4));
		h.put("s10",new Student("mahilan",238,3));
		h.put("s12",new Student("golu",236,5));
		h.put("s6",new Student(11,"aryan"));
		h.put("s12",new Student("sarfraj",007,27));
		
		System.out.println(h);
		
		//TreeMap<String,Object>h1=new TreeMap<String,Object>();
		//System.out.println(h1);
		
		//Hashtable<String,Object>h2=new Hashtable<String,Object>();
		//System.out.println(h2);
	}

}
