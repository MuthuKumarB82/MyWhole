package studyingcollections3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEven {
   public static void main(String[] args) {
	   ArrayList<Integer> a  = new ArrayList <> ();
	       a.add(145);
	       a.add(348);
	       a.add(011);
	       a.add(432);
	       a.add(222);
	       
	    a.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x));
	       
//	    List<Integer> even = a.stream().filter(x -> x%2==0).collect(Collectors.toList());
//	    even.forEach(x -> System.out.println(even));                          // to print the even values n collectors.
	       
//	      Long c = a.stream().filter(x -> x%2==0).count();
//	      System.out.println(c);                           // to print the stored value we use sysout    
   }
}
