package stringmethods;

public class PrintToCharArray {
	public static void main(String[] args) {
        String word = "Java";
        char[] value = word.toCharArray();
        System.out.println(value[0]=='J');
        System.out.println(value[1]);
	}
}