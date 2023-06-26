package studyingoops1;

public class Ac {
  private String brand;
  private int price;
  private String color;
  private Compressor compressor;
  
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
  public void setCompressor(Compressor compressor) {
	  this.compressor = compressor;
  }
  public Compressor getCompressor() {
	  return compressor;
  }
}