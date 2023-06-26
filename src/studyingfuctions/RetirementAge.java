package studyingfuctions;

public class RetirementAge {
	public String retirement(int age) {
		if(age>=58) {
			return "ELIGIBLE TO RETIRE";
		}
		else {
			return "NOT ELIGIBLE TO RETIRE";
		}
	}
	public static void main(String[] args) {
		RetirementAge ra = new RetirementAge ();
		System.out.println(ra.retirement(60));
		System.out.println(ra.retirement(25));
	}
}
