package staticanddefault;

public class UsingDefault implements UsingDefaultKeyword{
   public void add(int a) {
    	System.out.println(a+a);
   }
    
   public static void main(String[] args) {
	   UsingDefault use = new UsingDefault();
	           use.give();
	           use.add(9);
   }
}
