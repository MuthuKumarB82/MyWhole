package studyingcollections1;

import java.util.ArrayList;

public class Student1 {
  public static void main(String[] args) {
	 
	ArrayList<String> studName = new ArrayList<> ();
	  
	  studName.add("Muthu");
	  studName.add("Kumar");
	  studName.add("Ajith");
	  studName.add("Bala");
	  studName.add("Senthil");
	  
//	  to change the values we use set:
	  studName.set(1, "Manoj");
	  studName.set(2, "Raj");  
	  
//	  to remove the values what we don't need:
	  studName.remove(2);
	  
	  
//	  for(String student : studName) {
//		  System.out.println(student);
//	  }
	  
	  for(int i=0; i<studName.size(); i++) {
		  System.out.println(studName.get(i));
	  }
	  
//	  for(int i<studName.size()-1; i>=0; i--) {
//		  System.out.println(studName.get(i));
//	  }
	  
  }
}