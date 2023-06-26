package studyingcollections2;

import java.util.HashMap;

public class PrintKey {
	 public static void main(String[] args) {
		 HashMap<Integer,String> lms = new HashMap<> ();
			  lms.put(794, "durga");
			  lms.put(801,"Karthik");
			  lms.put(812, "Raj");
			  lms.put(813, "pandiyan");
			  lms.put(810, "Muthu");
			  lms.put(508, "Raj");
			  
//			  for(Integer m : lms.keySet()) {
//				  System.out.println(m);
//			  }

			  
//			  for(String x : lms.values()) {
//				  System.out.println(x);
//			  }
			  
			  
			  lms.forEach((y,b) -> System.out.println(y+" "+b));
   }
}