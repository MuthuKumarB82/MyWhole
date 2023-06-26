package forloopswihcondition;

public class PrintLetters {
  public static void main(String[] args) {
	  String[] words = {"onesoft","tecnological","instiute","placement"};
	  
	  for(int i=0; i<words.length; i++) {
		  System.out.println(words[i].toUpperCase().charAt(i));
	  }
  }
}
