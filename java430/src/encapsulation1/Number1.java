package encapsulation1;

public class Number1 {
	private String name;
	private int age;
	private String gameType;
	
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String getGtype()
	{
		return gameType;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setGtype(String gameType)
	{
		this.gameType=gameType;
	}
	Number1(String name,int age,String gameType)
	{
		this.name=name;
		this.age=age;
		this.gameType=gameType;
	}

}
