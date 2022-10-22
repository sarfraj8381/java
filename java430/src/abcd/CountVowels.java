package abcd;

public class CountVowels {

	public static void main(String[] args) {
		String str="mahipal";
		str=str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) 
		{
		char vwl=str.charAt(i);
		if(vwl=='a'||vwl=='e'||vwl=='i'||vwl=='o'||vwl=='u') 
		{
			count++;
		}
		
		}
		System.out.println("total no of vowels in String are "+count);
	}

}
