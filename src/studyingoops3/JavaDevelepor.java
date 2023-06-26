package studyingoops3;

public class JavaDevelepor extends Develepor {
	public int salary(String designation) {
		if (designation.equalsIgnoreCase("HR")) {
			return 40000;
		}
		else if(designation.equalsIgnoreCase("JUNIOR")) {
			return 60000;
		}
		else if(designation.equalsIgnoreCase("SENIOR")) {
			return 90000;
		}
		else {
			return 0;
		}
	}
}
