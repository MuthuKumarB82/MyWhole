package studyingoops2;

public class Human {
   String name;
   int age;
   String tone;
   public Human(String name,int age,String tone) {
	   this.name = name;
	   this.age = age;
	   this.tone = tone;
   }
   public String toString() {
	   return name+age+tone;
   }
}