package studyingcollections1;

public class Employee {
  private String empName;
  private int empId;
  private int empAge;
  private int empSalary;
  private boolean empIsMale;
  
  
  public void setEmpName(String empName) {
	  this.empName = empName;
  }
  public String getEmpName() {
	  return empName;
  }
  public void setEmpId(int empId) {
	  this.empId = empId;
  }
  public int getEmpId() {
	  return empId;
  }
  public void setEmpAge(int empAge) {
	  this.empAge = empAge;
  }
  public int getEmpAge() {
	  return empAge;
  }
  public void setEmpSalary(int empSalary) {
	  this.empSalary = empSalary;
  }
  public int getEmpSalary() {
	  return empSalary;
  }
  public void setEmpIsMale(boolean empIsMale) {
	  this.empIsMale = empIsMale;
  }
  public boolean getEmpIsMale() {
	  return empIsMale;
  }
  public Employee(String empName,int empId, int empAge,int empSalary,boolean empIsMale) {
	  this.empName = empName;
	  this.empId = empId;
	  this.empAge = empAge;
	  this.empSalary = empSalary;
	  this.empIsMale = empIsMale;
  }
  public String toString() {
	  return empName+" "+empId+" "+empAge+" "+empSalary+" "+empIsMale;
  }
}