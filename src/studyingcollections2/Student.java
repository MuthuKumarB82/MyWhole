package studyingcollections2;

public class Student {
    private String name;
    private int age;
    private String qualification;
    private long aadharNo;
    
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
    public void setQualifiaction(String qualification) {
    	this.qualification = qualification;
    }
    public String getQualification() {
    	return qualification;
    }
    public void setAadharNo(long aadharNo) {
    	this.aadharNo = aadharNo;
    }
    public long getAadharNo() {
    	return aadharNo;
    }
    public Student(String name,int age,String qualification,long aadharNo) {
    	this.name = name;
    	this.age = age;
    	this.qualification = qualification;
    	this.aadharNo  = aadharNo;
    }
    public String toString() {
    	return name+" "+age+" "+qualification+" "+aadharNo;
    }
}
