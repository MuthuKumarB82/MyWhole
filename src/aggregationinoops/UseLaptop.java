package aggregationinoops;

public class UseLaptop {
  public static void main(String[] args) {
	  Display dis = new Display(11,"LED");
	  Processor pro = new Processor("i3","INTEL",12);
	  Battery  bat = new Battery(5500,"LITHIUM");
	  Laptop lap = new Laptop("DELL",34000,bat,pro,dis);
	  System.out.println("BRAND: "+lap.getBrand()+", Price: "+lap.getPrice()+
			             ", BATTERY Mah: "+lap.getBattery().getMah()+", BATTERY TYPE: "+lap.getBattery().getBatteryType()+
			             ", PROCESSOR MODEL: "+lap.getProcessor().getModel()+", PROCESSOR BRAND: "+lap.getProcessor().getBrand()+
			             ", PROCESSOR Gen.: "+lap.getProcessor().getGen()+", DISPLAY SIZE: "+lap.getDisplay().getSize()+
			             ", DISPLAY TYPE: "+lap.getDisplay().getType());
  }
}
