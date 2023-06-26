package studyingcollections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStudent {
   public static void main(String[] args) {
	   Student s1 = new Student("Muthu",25,"B.E",989876543456l);
	   Student s2 = new Student("Kumar",25,"BA",989876598706l);
	   Student s3 = new Student("Raj",23,"B.Sc",989085432456l);
	   Student s4 = new Student("Manokar",26,"B.Com",989876002150l);
	   Student s5 = new Student("Ajith",22,"B.Sc",989876802345l);
	   Student s6 = new Student("Saran",20,"B.E",904676243456l);
	   
	   HashMap<Long,Student> students = new HashMap <> ();
	     students.put(s1.getAadharNo(),s1);
	     students.put(s2.getAadharNo(),s2);
	     students.put(s3.getAadharNo(),s3);
	     students.put(s4.getAadharNo(),s4);
	     students.put(s5.getAadharNo(),s5);
	     students.put(s6.getAadharNo(),s6);
	     
//	         int max = s1.getAge();
//	         int min = s2.getAge();
//	         String temp = "";
//	         String temp1 = "";
//	     for(Long x : students.keySet()) {
//	    	 if(students.get(x).getAge()>max) {
//	    		 max = students.get(x).getAge();
//	    		 temp = students.get(x).getName();
//	    	 }
//	    	 else if(students.get(x).getAge()<min) {
//	    		 min = students.get(x).getAge();
//	    		 temp1 = students.get(x).getQualification();
//	    	 }
//	     }
//	     System.out.println(temp);
//	     System.out.println(temp1);
	     
	     
	     Iterator<Long> ite = students.keySet().iterator();
	       while(ite.hasNext()) {
	    	   System.out.println(ite.next());
	       }
	     
	     
//	     Iterator<Student> ite1 = students.values().iterator();
//	     while(ite1.hasNext()) {
//	    	 System.out.println(ite1.next());
//	     }
	     
	     
//	     Iterator<Student> ite2 = students.values().iterator();
//	     while(ite2.hasNext()) {
//	    	 if(ite2.next().getQualification().equals("B.Sc")) {
//	    		 ite2.remove();
//	    	 }
//	     }
//	     System.out.println(students);
	     
	     
//	     Iterator<Student> ite3 = students.values().iterator();
//	     while(ite3.hasNext()) {
//	    	 if(ite3.next().getName().startsWith("S")) {
//	    		 ite3.remove();
//	    	 }
//	     }
//	     System.out.println(students);
	     
	     
//	     Iterator<Student> ite4 = students.values().iterator();
//	     while(ite4.hasNext()) {
//	    	 if(ite4.next().getAadharNo()%2==0) {
//	    		ite4.remove(); 
//	    	 }
//	     }
//	     System.out.println(students);
   }
}
