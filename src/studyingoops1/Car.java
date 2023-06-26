package studyingoops1;

public class Car {
  private String brand;
  private int price;
  private String color;
  private Enggine engine;
  
  public void setBrand(String brand) {
	  this.brand = brand;
  }
  public String getBrand() {
	  return this.brand;
  }
  public void setPrice(int price) {
	  this.price = price;
  }
  public int getPrice() {
	  return this.price;
  }
  public void setColor(String color) {
	  this.color = color;
  }
  public String getColor() {
	  return this.color;
  }
  public void setEngine(Enggine engine) {
	  this.engine = engine;
  }
  public Enggine getEngine() {
	  return this.engine;
  }
  public Car(String brand,int price,String color,Enggine engine) {
	  this.brand = brand;
	  this.price = price;
	  this.color = color;
	  this.engine = engine;
  }
  public String toString() {
	  return brand+" "+price+" "+color;
  }
}