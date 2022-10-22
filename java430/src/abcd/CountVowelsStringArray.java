package abcd;

public class CountVowelsStringArray {

	public static void main(String[] args) {
		String s[]= {"mahipal","sunil","manoj"};
		for (int i =s.length-1; i >=0; i--) 
		{
		char ch[]=s[i].toCharArray();
		int count=0;
		for (int j = 0; j < ch.length; j++) 
		{
			if(ch[j]=='a'||ch[j]=='e'||ch[j]=='i'||ch[j]=='o'||ch[j]=='u')
			{
				count++;
			}
		}
		System.out.println(s[i]+"  "+count);
		}
	}

}
