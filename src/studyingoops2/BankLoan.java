package studyingoops2;

public class BankLoan {
   public int loanAvailability(long aadharNum) {
	   return 20000;
   }
   public int loanAvailability(long aadharNum,int salary) {
	   return 20000+salary;
   }
   public int loanAvailability(long aadharNum,int salary,int noOfProperties) {
	   return 20000+salary*noOfProperties;
   }
   public static void main(String[] args) {
	   BankLoan bl = new BankLoan();
	   System.out.println(bl.loanAvailability(998076543489l,46789,5));
   }
}
