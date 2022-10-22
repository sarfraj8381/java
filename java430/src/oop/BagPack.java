package oop;

public class BagPack extends HandBag {
	String shop;
	public void showBagPack()
	{
		System.out.println("shop in bangalore");
	}

	public static void main(String[] args) {
		BagPack b1=new BagPack();
		b1.brand="GUCCI";
		b1.price=19999d;
		b1.pri=199;
		b1.shop="KING COLLECTION";
		b1.showBag();
		b1.showHandBag();
		b1.showBagPack();
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.pri);
		System.out.println(b1.shop);
		

	}

}
