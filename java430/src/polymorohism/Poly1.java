
//C.T.M concept


package polymorohism;

public class Poly1 {

	public static void main(String[] args) {
		values("sarfraj");
		values("ahmad",26);
		values("ansari",25,"bangalore");
		values("sonu","bokaro steel city");
	}
		
		public static void values(String name)
		{
			System.out.println("name is "+name);
		}
		public static void values(String name,int age)
		{
			System.out.println("name is "+name);
			System.out.println("age is "+age);
		}
		public static void values(String name,int age,String place)
		{
			System.out.println("name is "+name);
			System.out.println("age is "+age);
			System.out.println("place is "+place);
		}
		public static void values(String name,String place)
		{
			System.out.println("name is "+name);
			System.out.println("place is "+place);
		}

}
