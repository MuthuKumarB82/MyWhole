package stringmethods;

public class PrintStartsWith {
	public static void main(String[] args) {
		String name = "Manoj";
		boolean value = name.startsWith("M");
		System.out.println(value);
		
		boolean res = name.startsWith("j");
		System.out.println(res);
	}
}