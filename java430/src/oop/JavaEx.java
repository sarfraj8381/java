package oop;

public class JavaEx extends ProLanguage {
String lan;
public void showJavaEx()
{
	System.out.println("java is a programming language");
}
	public static void main(String[] args) {
		JavaEx j1 = new JavaEx();
		j1.name="Python";
		j1.brand="HTML";
		j1.lan="Programming language";
		j1.showLanguage();
		j1.showProLanguage();
		j1.showJavaEx();
		System.out.println(j1.name);
		System.out.println(j1.brand);
		System.out.println(j1.lan);
		
		

	}

}
