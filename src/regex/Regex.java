package regex;

public class Regex {
	public static void main(String[] args) {
		String a = "Mut786H78U00kum54236ar898BCC";
//		String[] b = a.split("\\d+");
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]);
//		}
//		System.out.println(a.replaceAll("[a-z A-Z]", ""));
		System.out.println(a.replaceAll("[0-9]", ""));
	}
}
