package studyingcollections2;

import java.util.HashMap;
import java.util.Iterator;

public class UsingIterator {
	public static void main(String[] args) {
		HashMap<Integer, String> lms = new HashMap<>();
		lms.put(794, "durga");
		lms.put(801, "Karthik");
		lms.put(812, "Raj");
		lms.put(813, "pandiyan");
		lms.put(810, "Muthu");
		lms.put(508, "Raj");

//	Iterator<Integer> ite = lms.keySet().iterator();        //Using iterator and while to print and the values expect what we remove
//	while(ite.hasNext()) {
//		System.out.println(ite.next());
//	}

//	Iterator<String> ite1 = lms.values().iterator();
//	while(ite1.hasNext()) {
//		System.out.println(ite1.next());
//	}

//	Iterator<String> ite2 = lms.values().iterator();
//	while(ite2.hasNext()) {
//		if(ite2.next().equalsIgnoreCase("muthu")) {
//		ite2.remove();
//		}
//	}
//	System.out.println(lms);
		
	}
}