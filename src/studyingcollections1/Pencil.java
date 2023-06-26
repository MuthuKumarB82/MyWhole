package studyingcollections1;

import java.util.ArrayList;

public class Pencil {
  public static void main(String[] args) {
	  ArrayList <String> pencilbrand = new ArrayList<> ();
    	  pencilbrand.add("Nataraj");
	      pencilbrand.add("Apsara");
	      pencilbrand.add("Faber");
	      pencilbrand.add("Cello");
	      pencilbrand.add("Montex");
	  
	  
//	  int max = 0;
//	  for(String pencil : pencilbrand) {
//		  if(pencil.length()>=max) {
//			  max = pencilbrand.size();
//	  }
//	  }
//		  System.out.println(max);

//	  int max = 0;
//	   String temp = "";
//	  for(int i=0; i<pencilbrand.size(); i++) {
//		  if(pencilbrand.get(i).length()>max) {
//			  max = pencilbrand.get(i).length();
//			  temp = pencilbrand.get(i);
//			  temp = temp+pencilbrand.get(i);
//		  }
		  
//	  System.out.println(pencilbrand.get(i).charAt(0));
//	  System.out.println(pencilbrand.get(i).charAt(pencilbrand.get(i).length()-1));  
//	  }
	      
//	  System.out.println(temp);
//	  System.out.println(max);
//	  System.out.println(temp);
	  
	  
	  
//	  for(int i=pencilbrand.size()-1; i>=0; i--) {
//		  System.out.println(pencilbrand.get(i));
//	  }
	  
//	  pencilbrand.forEach(pencil -> System.out.println(pencil);
	  
	      for(String p: pencilbrand) {
	    	  if(p.length()>5) {
	    		  System.out.println(p);
	    	  }
	      }
  }
}
