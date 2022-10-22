//create a string variable give a value to it apply different string operation


package string;

public class String_variable {

	public static void main(String[] args) {
		String s = "Karnataka";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(4));
		
		
		String s1=s.toLowerCase();
		System.out.println(s1);
		
		String s2= s.toUpperCase();
		System.out.println(s2);
		
		String s3=s.concat(s2);// adding both the lower case and upper case
		System.out.println(s3);
		
		String s4="India";
		System.out.println(s==s4);
		
		int i=s.indexOf(s1);
		System.out.println('a');
		
		String sub=s.substring(1);
		System.out.println(sub);
		
		String sub1=s.substring(1, 8);
		System.out.println(sub1);
		
		String sub2=s.substring(1,5);
		System.out.println(sub2);
		
		String n=new String("Jharkhand");
		System.out.println(n==s4);

	}

}
