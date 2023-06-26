package studyingoops2;

public class Doctor extends Human {
	String license;
	int salary;
	String designation;
  public Doctor(String name,int age,String tone,String license,int salary,String designation) {
	  super(name,age,tone);
	  this.license = license;
	  this.salary = salary;
	  this.designation = designation;
  }
  public String toString() {
	  return super.toString()+license+salary+designation;
  }
}
