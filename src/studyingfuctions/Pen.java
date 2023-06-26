package studyingfuctions;

public class Pen {
	  String brand;
	  int price;
	  String color;
	  
	  public String findStartsWithA(Pen a, Pen b, Pen c) {
		  if(a.brand.startsWith("A") ) {
			  return a.brand;
		  }
		  else if(b.brand.startsWith("A")) {
			  return a.brand;
		  }
		  else {
			  return c.brand;
		  }
	  }
}