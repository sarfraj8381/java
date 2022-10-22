package constructor_chaining1;

public class ElectricItem {

	public static void main(String[] args) {
		Appliances a = new Appliances(35000d,"samsung","white");
		Television t = new Television(35000d,"samsung","white",36,"flat");
		WashingMachine w = new WashingMachine(35000d,"samsung","white",10,"automatic");
		
		
		a.showAppliances();
		System.out.println("_____________________");
	    t.showTelevision();
	    System.out.println("_____________________");
	    w.showWashingMachine();
	    System.out.println("_____________________");
	    
	    t.showAppliances();
	    System.out.println("_____________________");
	    w.showAppliances();
	    System.out.println("_____________________");
		

	}

}
