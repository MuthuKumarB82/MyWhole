package studyingcollections1;

import java.util.ArrayList;
import java.util.Iterator;


public class UseEmployee {
  public static void main(String[] args) {
	  Employee emp1 = new Employee("Muthu",8907,28,30000,true);
	  Employee emp2 = new Employee("Bala",8234,26,20200,true);
	  Employee emp3 = new Employee("Sandhya",8678,25,30000,false);
	  Employee emp4 = new Employee("Ajith",8544,29,35000,true);
	  Employee emp5 = new Employee("Raj",8765,23,40000,true);
	  Employee emp6 = new Employee("Saranya",8906,28,30000,false);
	  
	  ArrayList<Employee> emp = new ArrayList<> ();
	     emp.add(emp1);
	     emp.add(emp2);
	     emp.add(emp3);
	     emp.add(emp4);
	     emp.add(emp5);
	     emp.add(emp6);
	  
//	     int max = 0;
//	     String temp = "";
//	  for(int i=0; i<emp.size(); i++) {
//		  if(emp.get(i).getEmpSalary()>20000) {
//			System.out.println(emp.get(i).getEmpName());  
//		  }
	     
//		  if(emp.get(i).getEmpAge()>max) {
//			  max = emp.get(i).getEmpAge();
//			  temp = emp.get(i).getEmpName();
//		  }
//		  System.out.println(emp.get(i).getEmpName());
//	  }
//	  System.out.println(temp);
	      
//	     int min = emp1.getEmpName().length();
//	     String temp2 = "";
//	     for(int i=0; i<emp.size(); i++) {
//	    	 if(emp.get(i).getEmpName().length()<min) {
//	    		 min = emp.get(i).getEmpName().length();
//	    		 temp2 = emp.get(i).getEmpName();
//	    	 }
//	     }
//	  System.out.println(temp2);
	  
//	  emp.forEach(name1 -> System.out.println(name1.getEmpSalary()));
//	  emp.forEach(name ->{
//		  if(name.getEmpAge()>25) {
//			  System.out.println(name.getEmpName());
//		  }
//	  });
//	  emp.forEach(starts ->{
//		  if(starts.getEmpName().startsWith("R")) {
//			  System.out.println(starts.getEmpName());
//		  }
//	  });
	     
//	  emp.forEach(female ->{
//		  if(female.getEmpIsMale()==false) {
//			  System.out.println(female.getEmpName());
//		  }
//	  });
	  
	  Iterator<Employee> ite = emp.iterator();
	  while(ite.hasNext()) {
		  if(ite.next().getEmpAge()>25) {
			  ite.remove();
		  }
	  }
      System.out.println(emp);
  }
}
