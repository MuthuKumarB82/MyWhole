package studyingoops3;

public class AuditoriumRoom implements Room {
  public String useOfRoom() {
	  return "It is used for annual day celebration";
  }
  
  public String holdingCapacity(int person) {
	  if(person>=1 && person<=800) {
		  return "Space Available";
	  }
	  else if(person==1000) {
		  return "Space is Full";
	  }
	  else {
		  return "No Space";
	  }
  }
}