package studyingoops3;

public abstract class Bag {
  
  public abstract String use();
  
  public void quality(int price) {
	  if(price<=500) {
		  System.out.println("AVERAGE QUALITY");
	  }
	  
	  else if(price>500 && price<=1000) {
		  System.out.println("GOOD QUALITY");
	  }
	  
	  else {
		  System.out.println("SUPER QUALITY");
	  }
  }
}
