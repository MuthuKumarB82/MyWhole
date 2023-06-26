package studyingfuctions;

public class FindMaxinString {
  public String maxLength () {
	  String[] words = {"Animalss","Fruits","Plants","Planets"};
	  int max = 0;
	  String temp = "";
	  for(int i=0; i<words.length; i++) {
		  if(words[i].length()>max) {
			  max = words[i].length();
			  temp = temp+words[i];
		  }
	  }
	  return temp;
  }
	  public static void main(String[] args) {
		  FindMaxinString max = new FindMaxinString ();
		  System.out.println(max.maxLength());
	  }
  }