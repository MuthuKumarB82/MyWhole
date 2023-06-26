package studyingfuctions;

public class Bike {
  String brand;
  String color;
  int price;
 
  public int findMax(Bike[] a) {
	     int max = 0;
	  for(Bike x : a) {
		  if(x.price>max) {
			  max = x.price;
		  }
	  }
	  return max;
  }
}