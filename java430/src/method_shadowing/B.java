package method_shadowing;

class B extends A
{
	static void ex()
	{
		System.out.println("child version");
	}


	public static void main(String[] args) {
		A.ex();
		B.ex();
		

	}

}

