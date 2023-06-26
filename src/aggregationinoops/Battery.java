package aggregationinoops;

public class Battery {
  private int mah;
  private String batteryType;
  public void setMah(int mah) {
	  this.mah = mah;
  }
  public int getMah() {
	  return mah;
  }
  public void setBatteryType(String batteryType) {
	  this.batteryType = batteryType;
  }
  public String getBatteryType() {
	  return batteryType;
  }
  public Battery(int mah,String batteryType) {
	  this.mah = mah;
	  this.batteryType = batteryType;
  }
  public String toString() {
	  return mah+" "+batteryType;
  }
}
