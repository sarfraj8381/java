package abstraction;

public class EBulb extends ElectricSwitch {
	String bbrand;
	String type;


	EBulb(String brand,float price,String bbrand,String type)
	{
		super(brand,price);//calling parent class constructor from child class constructor
		this.bbrand=bbrand;
		this.type=type;
		
}
	
	public void SwitchOn()
	{
		System.out.println("producing light");
	}
	public void SwitchOff()
	{
		System.out.println("now the bulb is turn off");
	}
	public void view()
	{
		System.out.println("brand is "+brand);
		System.out.println("price is "+price);
		System.out.println("bbrand is "+bbrand);
		System.out.println("type is "+type);
	}

	public static void main(String[] args) {
		EBulb E=new EBulb("Anchor",200f,"Havels","LED");
		E.SwitchOff();
		System.out.println("_____________________");
		E.SwitchOn();
		System.out.println("_____________________");
		E.view();
		
	}
	}
	