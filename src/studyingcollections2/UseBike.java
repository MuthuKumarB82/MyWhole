package studyingcollections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseBike {
   public static void main(String[] args) {
	   Bike b1 = new Bike("Yamaha",9876,"Blue+Black",180000,true);
	   Bike b2 = new Bike("Hero",2800,"Black",75000,true);
	   Bike b3 = new Bike("TVS",3376,"Red",150000,true);
	   Bike b4 = new Bike("Ather",6342,"Green",72000,false);
	   Bike b5 = new Bike("Revolt",8585,"Orange",70000,false);
	   Bike b6 = new Bike("Honda",5640,"Black",60000,false);
	   
	HashMap<Integer,Bike> bikes = new HashMap <> ();
	        bikes.put(b1.getRegNo(),b1);
	        bikes.put(b2.getRegNo(),b2);
	        bikes.put(b3.getRegNo(),b3);
	        bikes.put(b4.getRegNo(),b4);
	        bikes.put(b5.getRegNo(),b5);
	        bikes.put(b6.getRegNo(),b6);
	        
//	   System.out.println(bikes);
	        
//	   System.out.println(bikes.keySet());
	        
//	   System.out.println(bikes.values());
	   
	        for(Integer x:bikes.keySet()){                       // Key iteration            
	        	System.out.println(x);
	        }
	        
	        
//	        for(Bike y:bikes.values()) {                        // Value iteration
//	        	System.out.println(y);
//	        }
	        
	        
//	        for(Integer z : bikes.keySet()) {                    //using key and to get vales
//	        	System.out.println(bikes.get(z));
//	        }
	        
	        
//	        bikes.forEach((m,n) -> System.out.println(m+" "+n));
	        
	      Iterator<Bike> ite = bikes.values().iterator();
	        while(ite.hasNext()) {
	        	if(ite.next().getIsPetrol()==true) {
	        		ite.remove();
	        	}
	        }
	        System.out.println(bikes);
	        
   }
}