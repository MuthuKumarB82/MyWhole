package studyingcollections1;

public class Student {
  private String name;
  private int age;
  private int rollNo;
  private boolean isMale;
  
  public void setName(String name) {
	  this.name = name;
  }
  public String getName() {
	  return name;
  }
  public void setAge(int age) {
	  this.age = age;
  }
  public int getAge() {
	  return age;
  }
  public void setRollNo(int rollNo) {
	  this.rollNo = rollNo;
  }
  public int getRollNo() {
	  return rollNo;
  }
  public void setIsMale(boolean isMale) {
	  this.isMale = isMale;
  }
  public boolean getIsMale() {
	  return isMale;
  }
  public Student(String name,int age,int rollNo,boolean isMale) {
	  this.name = name;
	  this.age = age;
	  this.rollNo = rollNo;
	  this.isMale = isMale;
  }
  public String toString() {
	  return "NAME:"+name+" AGE:"+age+" ROLL No."+rollNo+" IS MALE:"+isMale;
  }
}
