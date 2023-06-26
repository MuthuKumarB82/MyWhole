package studyingoops1;

public class UseAc {
  public static void main(String[] args) {
	  Compressor compressor = new Compressor();
	  compressor.setBrand("Croma");
	  compressor.setPrice(20000);
	  
	  Ac ac = new Ac ();
	  ac.setBrand("Croma");
	  ac.setPrice(10000);
	  ac.setColor("White");
	  ac.setCompressor(compressor);
	  
	  System.out.println(ac.getBrand());
	  System.out.println(ac.getCompressor().getPrice());
	 
  }
}
