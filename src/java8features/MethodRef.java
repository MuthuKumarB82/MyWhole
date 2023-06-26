package java8features;

public class MethodRef {
   
	public int mul(int a,int b) {
	  return a*b;
   }
   
  public static void main(String[] args) {
      MethodRef mf = new MethodRef();
        MethodRefrence mrf = mf :: mul;
      System.out.println(mrf.mul(29,10));
  }
}