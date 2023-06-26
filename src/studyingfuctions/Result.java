package studyingfuctions;

public class Result {
  public String total() {
	  int a = 10;
	  int b = 20;
	  int c = 30; 
	  int d = 25;
	  int e = 45;
	  return "TOTAL = "+(a+b+c+d+e);
  }
  public String average(int a,int b, int c, int d, int e) {
	  return "AVERAGE = " +((a+b+c+d+e)/5);
  }
 
  public static void main(String[] args) {
          Result ans = new Result();
  System.out.println(ans.total());
  System.out.println(ans.average(90,78,56,37,90));
  }
}