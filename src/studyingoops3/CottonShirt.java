package studyingoops3;

public class CottonShirt extends Shirt {
	public String checked(boolean isChecked) {
	  if(isChecked==true) {
		  return "IT IS CASUAL";
	  }
	  else if(isChecked==false) {
		  return "IT IS FORMAL";
	  }
	  else {
		  return "NOT DEFINED";
	  }
  }
}