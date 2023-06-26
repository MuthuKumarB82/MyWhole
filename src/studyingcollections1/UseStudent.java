package studyingcollections1;

import java.util.ArrayList;

public class UseStudent {
  public static void main(String[] args) {
	  Student std1 = new Student("Aji",15,6,true);
	  Student std2 = new Student("Aswathy",17,7,false);  
	  Student std3 = new Student("Xavier",16,5,true);
	  Student std4 = new Student("Ahanaa",18,12,false);
	  
	  ArrayList <Student> std = new ArrayList<> ();
	       std.add(std1);
	       std.add(std2);
	       std.add(std3);
	       std.add(std4);
	  
//	  for(int i=0; i<std.size(); i++) {
//		  System.out.println(std.get(i));
//	  }
	  
//	  for(Student st : std) {
//		  System.out.println(st);
//	  }
	  
//	  std.forEach(sd -> System.out.println(sd));
	
//	  ArrayList<Student> girlStdList = new ArrayList<> ();
//	  for(Student girl : std) {
//		  if(girl.getIsMale()==false) {
//			  girlStdList.add(girl);
//		  }
//	  }
//	  girlStdList.forEach(g -> System.out.println(g));
	  
//	  ArrayList<Student> bwRollNo = new ArrayList<> ();
//	  for(Student rn : std) {
//		  if(rn.getRollNo()>=1 && rn.getRollNo()<=10) {
//			  bwRollNo.add(rn);
//		  }
//	  }
	       
//	  bwRollNo.forEach(r -> System.out.println(r));
	  
//	  ArrayList<Student> findLen = new ArrayList<> ();
//	  for(Student len : std) {
//		  if(len.getName().length()<5) {
//			  findLen.add(len);
//		  }
//	  }
//	  findLen.forEach(l -> System.out.println(l));
	  
//	  ArrayList<Student> findAge = new ArrayList<> ();
//	  for(Student age : std) {
//		  if(age.getAge()>=15 && age.getAge()<17) {
//			  findAge.add(age);
//		  }
//	  }
//	  findAge.forEach(a -> System.out.println(a));
	  
//	  ArrayList<Student> findOdd = new ArrayList <> ();
//	  for(Student odd : std) {
//		  if(odd.getName().length()%2!=0) {
//			  findOdd.add(odd);
//		  }
//	  }
//	  findOdd.forEach(od -> System.out.println(od));
  }
}