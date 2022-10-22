package variable_shadawing;

public class VarShadow {
	int n=400;
	public static void  display()
	{
		System.out.println("value are printed");
	}
	void show()
	{
		System.out.println("variable shadowing ");
	}

	public static void main(String[] args) {
		int n=10;
		System.out.println(n);
		VarShadow v = new VarShadow();
		System.out.println(v.n);
		v.display();
		v.show();
		

	}
}
