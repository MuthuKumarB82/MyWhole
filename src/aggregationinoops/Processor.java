package aggregationinoops;

public class Processor {
   private String model;
   private String brand;
   private int gen;
    public void setModel(String model) {
    	this.model = model;
    }
    public String getModel() {
    	return model;
    }
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    public String getBrand() {
    	return brand;
    }
    public void setGen(int gen) {
    	this.gen = gen;
    }
    public int getGen() {
    	return gen;
    }
    public Processor(String model,String brand,int gen) {
    	this.model = model;
    	this.brand = brand;
    	this.gen = gen;
    }
    public String toString() {
    	return model+" "+brand+" "+gen;
    }
}
