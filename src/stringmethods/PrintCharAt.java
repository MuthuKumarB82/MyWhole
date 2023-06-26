package stringmethods;

public class PrintCharAt {
	public static void main(String[] args) {
		String word = "SheWolf";
		
		char result = word.charAt(0);
		System.out.println(result);
		
		char ans = word.charAt(word.length()-1);
		System.out.println(ans);
		
		char needed = word.charAt(word.length()/2);
		System.out.println(needed);
	}
}