package studyingoops3;

public class MuncipalGovernment extends StateGovernment {
	public String vehiclePlate() {
		  return "All states have Vehicle registration";
	}
	public String vehicleRegistration(String states) {
		if(states.equalsIgnoreCase("Tamil Nadu")) {
			return "TN";
		}
		else if(states.equalsIgnoreCase("Kerala")) {
			return "KL";
		}
		else {
			return "Not valid";
		}
	}
}
