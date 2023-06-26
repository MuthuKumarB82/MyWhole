package staticanddefault;

public interface UsingDefaultKeyword {
    public void add(int a);
      default void give() {
    	System.out.println("Your Added result is below");
    }
}
