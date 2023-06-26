package conditioniselseandifelse;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1 = new Ac ();
		ac1.brand = "croma";
		ac1.price = 25000;
		ac1.color = "black";
		
		Ac ac2 = new Ac ();
		ac2.brand = "Daiken";
		ac2.price = 28000;
		ac2.color = "blue";
		
		Ac ac3 = new Ac ();
		ac3.brand = "Whirlpool";
		ac3.price = 55000;
		ac3.color = "green";
		
		Ac ac4 = new Ac ();
		ac4.brand = "Mk";
		ac4.price = 45000;
		ac4.color = "yellow";
		
		if(ac4.price>ac1.price && ac4.price>ac2.price && ac4.price>ac3.price ) {
			System.out.println(ac4.brand.toUpperCase());
		}
		else if(ac3.price>ac4.price && ac3.price>ac2.price && ac3.price>ac1.price) {
			System.out.println(ac3.brand.toUpperCase());
		}
		else if (ac2.price>ac4.price && ac2.price>ac3.price && ac2.price>ac1.price) {
			System.out.println(ac2.brand.toUpperCase());
		}
		else if (ac1.price>ac4.price && ac1.price>ac3.price && ac1.price>ac2.price) {
			System.out.println(ac1.brand.toUpperCase());
		}
		else {
			System.out.println("Not Define");
		}
	}
}