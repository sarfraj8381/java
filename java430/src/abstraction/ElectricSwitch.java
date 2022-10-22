package abstraction;

abstract public class ElectricSwitch {
	String brand;
	float price;
	abstract public void SwitchOn();
	abstract public void SwitchOff();

ElectricSwitch(String brand,float price)
{ 
	
	this.brand=brand;
	this.price=price;
}
}