package oop;

public class Smartphone extends Mobile {
	
	int camCap;
	void displaySmartPhone()
	{
		System.out.println("smartphone method displaying the details");
		System.out.println(brand);
		System.out.println(price);
		System.out.println(serviceP);
		System.out.println(camCap);
	}

	public static void main(String[] args) {
		Smartphone s=new Smartphone();
		s.brand="Xoimi";
		s.price=23000d;
		s.serviceP="JIO";
		s.camCap=53;
		s.displayPapa();
		s.displayMobile();
		s.displaySmartPhone();
		Telephone t = new Telephone();
		t.displayPapa();

	}

}
