package studyingcollections3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsePlayersForHashMap {
   public static void main(String[] args) {
	   Players p1 = new Players("dhoni",35,7,14000,"India");
	   Players p2 = new Players("virat",30,256,12000,"India");
	   Players p3 = new Players("sachin",38,172,19000,"India");
	   Players p4 = new Players("Kumar",39,8,20000,"Australia");
	   Players p5 = new Players("Aji",35,67,19800,"Isreal");
	   
	 HashMap<Integer,Players> p = new HashMap <> ();
	        p.put(p1.getJerseyNo(),p1);
	        p.put(p2.getJerseyNo(),p2);
	        p.put(p3.getJerseyNo(),p3);
	        p.put(p4.getJerseyNo(),p4);
	        p.put(p5.getJerseyNo(),p5);
	        
//	        System.out.println(p);
	        
	    List<Players> name =  p.values().stream().filter(x -> x.getRuns()>12000).collect(Collectors.toList());
	        for(Players v : name) {
	        	System.out.println(v);
	        }
//	        name.forEach(y -> System.out.println(y));
	        
//	    Map<Integer,Players> names = p.values().stream().filter(x -> x.getName().length()%2!=0).collect(Collectors.toMap(x -> x.getJerseyNo(), y -> y));  
//	        names.forEach((v,w) -> System.out.println(v+" "+w));
	    
//	    List<String> namecon =  p.values().stream().filter(x -> x.getRuns()>=10000).map(x -> x.getName().concat("Kumar")).collect(Collectors.toList());
//	        namecon.forEach(w -> System.out.println(w));
	        
   }
}