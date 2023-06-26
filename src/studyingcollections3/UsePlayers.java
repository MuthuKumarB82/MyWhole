package studyingcollections3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UsePlayers {
   public static void main(String[] args) {
	   
	   Players p1 = new Players("dhoni",35,17,10000,"India");
	   Players p2 = new Players("virat",30,256,12000,"India");
	   Players p3 = new Players("sachin",38,172,19000,"India");
	   Players p4 = new Players("Kumar",35,7,20000,"Australia");
	   Players p5 = new Players("Aji",35,67,19800,"Isreal");
	   
	   ArrayList<Players> players = new ArrayList<>  ();
	         players.add(p1);
	         players.add(p2);
	         players.add(p3);
	         players.add(p4);
	         players.add(p5);
	      
	   List<Players> seniors = players.stream().filter(x -> x.getAge()>30 ).collect(Collectors.toList());
//	   System.out.println(seniors);                                              // print in single line within{}
	    seniors.forEach(y -> System.out.println(y));                             // to get output in next to next we use forloop it gives line by line Outpu
   
//	    List<String> name30 = players.stream().filter(x -> x.getAge()>30).map(x -> x.getName()).collect(Collectors.toList());    
//	        name30.forEach(z -> System.out.println(z));
	      
//	     List<String> nameRun = players.stream().filter(x -> x.getAge()>30).map(x -> x.getName()+" "+x.getRuns()).collect(Collectors.toList());    
//	        nameRun.forEach(z -> System.out.println(z));
	         
//	     List<String> name = players.stream().map(x -> x.getName()).filter(x -> x.startsWith("K")).collect(Collectors.toList());
//	        name.forEach(a -> System.out.println(a));
	         
//	     Long c = players.stream().map(x -> x.getName()).filter(x -> x.startsWith("K")).count();
//	        System.out.println(c);
	         
//	     Map<Integer,Players> ar = players.stream().filter(y -> y.getAge()>30 && y.getRuns()>10000).collect(Collectors.toMap(x -> x.getJerseyNo(), y -> y));
//	        ar.forEach((a,b) -> System.out.println(a+" "+b));
	        
	        
//	     List<Players> xy = players.stream().filter(cc -> cc.getName().length()>4).collect(Collectors.toList());
//	        xy.forEach(a -> System.out.println(a));
   }
}
