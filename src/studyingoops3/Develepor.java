package studyingoops3;

public abstract class Develepor implements Human {
   public String eat() {
	   return "EAT 3 TIMES";
   }
   
   public String sleep(int time) {
	   if((time>=0 && time<=6) || (time>=21 && time<=24 )) {
		   return "Sleeping Time";
	   }
	   else if(time<21 && time>6) {
		   return "Working time";
	   }
	   else {
		   return "Please Use 0 to 24";
	   }
   }
   public abstract int salary(String designation);
}
