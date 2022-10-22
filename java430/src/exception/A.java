package exception;

public class A {
	static void checkAge(int age)
	{
		if(age<=18)
		{
			throw new MyException("your age is not eligible");
		}
		else
		{
			System.out.println("eligible");
		}
	}
	static void test()
	{
		System.out.println("just for testing execution flow");
	}
		public static void main(String[] args) {
			int age=17;
			try
			{
				checkAge(age);
			}
			catch(MyException ob)
			{
				System.out.println(ob);
				System.out.println("handled");
				ob.printStackTrace();
			}
			test();
			{
				System.out.println("main ends");
			}
		}

}
          
