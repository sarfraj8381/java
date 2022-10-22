package interfaceEx;
class Ebulb implements ESwitchIF {
	String brand;
	int price;
	
	
	public void showEBulb()
	{
		System.out.println("brand is "+brand);
		System.out.println("price is "+price);
		
	}
	
	
	public void switchon() {
		System.out.println("bulb is on");
	}
	 public void switchoff()
	{
		System.out.println("bulb is off");
	}
	 
	 
	 Ebulb(String brand,int price)
	 {
		 System.out.println("object is created");
		 this.brand=brand;
		 this.price=price;
	 }

    public static void main(String[] args)
    	{
    	Ebulb e= new Ebulb("opera",110);
    	e.showEBulb();
    	e.switchoff();
    	e.switchon();
    	}
}
