package conditionisifandelse;

public class UseWatch {
  public static void main(String[] args) {
	  Watch watch = new Watch ();
	   watch.brand = "rolex";
	   watch.price = 1000000;
	   watch.color = "red";
	   watch.iswaterProof = false;
	   
	   if(watch.iswaterProof==true) {
		   System.out.println(watch.price+(watch.price*5/100));
	   }
	   else {
		   System.out.println(watch.price-(watch.price*5/100));
	   }
  }
}
