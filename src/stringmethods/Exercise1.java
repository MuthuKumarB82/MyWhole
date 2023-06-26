package stringmethods;

public class Exercise1 {
   public static void main(String[] args) {
	   
	   String word = "animals";
	  
	   char value = word.charAt(0);
	   char ans = word.charAt(6);
	   System.out.println(value+" "+ans);
	   
	   String res = word.substring(0,6);
	   System.out.println(res);
	   
	   String mk = word.toUpperCase();
	   System.out.println(mk);
	   
	   String ml = word.toLowerCase();
	   System.out.println(ml);
	   
	   int aa = word.length();
	   System.out.println(aa);
	   
	   int zz = word.indexOf("n");
	   System.out.println(zz);
	   
	   String word2 = " in Zoo";
	   String rr = word.concat(word2);
	   System.out.println(rr);
	   
	   char[] yy = word.toCharArray();
	   System.out.println(yy[2]);
	   
	   String[] mm = word.split("m");
	   System.out.println(mm[1]);
   }
}