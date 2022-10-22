//create a method add() and overloaded

package polymorohism;

public class Poly {
        
	public static void main(String[] args) {
		add();
		add(10);
		add(10,20);
		add(10,20,30);
		add(200f,300f);
		
	}
	
	public static void add()
	{
		System.out.println("method with no arguments");
	}
	public static void add(int a)
	{
		System.out.println(a);
	}
	public static void add(int a, int b)
	{
		
		System.out.println(a+b);
	}
	public static void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void add(float a, float b)
	{
		System.out.println(a+b);
	}
}

		

	


