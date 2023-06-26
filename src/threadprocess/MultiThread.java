package threadprocess;

public class MultiThread extends Thread {
	
  public void run() {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
  }
	
  public static void main(String[] args) {
              int n = 5; 
       for (int i=0; i<n; i++) {
            MultiThread mt = new MultiThread();
                      mt.start();
       }
  }
}