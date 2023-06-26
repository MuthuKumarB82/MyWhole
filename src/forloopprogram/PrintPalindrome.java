package forloopprogram;

public class PrintPalindrome {
	public static void main(String[] args) {
		String name = "malayalam";
		String need = "";
		for(int i=name.length()-1; i>=0; i--) {
			need = need+name.charAt(i);
		}
		 if(need.equalsIgnoreCase(name)) {
			 System.out.println("IT IS A PALINDROME");
		 }
		 else {
			 System.out.println("NOT A PALINDROME");
		 }
		}
	}
