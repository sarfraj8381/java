package abstraction1;

public class Coffiee extends VendingMachin {
		//String place;
		public void GetDrink()
		{
			System.out.println("ready to drink..");
		}
		public void AddElement()
		{
			System.out.println("adding element in machine..");
		}

	public static void main(String[] args) {
		Tea t= new Tea();
		Coffiee c = new Coffiee();
		t.GetDrink();
		t.AddElement();
		System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_");
		c.GetDrink();
		c.AddElement();

	}

}
