package conditionisifandelse;

public class CheckVowels {
   public static void main(String[] args) {
	   String word = "MuthuKUMar".toLowerCase();
	   if(word.contains("a")||word.contains("e")||word.contains("i")||
		   word.contains("o")||word.contains("u")) {
			   System.out.println("Vowels");
		   }
	  else {
		  System.out.println("Consonants");
	  }
   }
}
