package studyingoops3;

public class UseAuditoriumRoom {
  public static void main(String[] args) {
	  AuditoriumRoom ar = new AuditoriumRoom();
	  System.out.println(ar.useOfRoom());
	  System.out.println(ar.holdingCapacity(1000));
  }
}
