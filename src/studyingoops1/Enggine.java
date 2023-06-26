package studyingoops1;

public class Enggine {
  private String brand;
  private int price;
   
  public void setBand(String brand) {
	  this.brand = brand;
  }
  public String getBrand() {
	  return brand;
  }
  public void setPrice(int price) {
	  this.price = price;
  }
  public int getPrice() {
	  return price;
  }
public Enggine(String brand,int price) {
	this.brand = brand;
	this.price = price;
}
public String toString() {
	return brand+price;
}
}
