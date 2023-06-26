package threadprocess;

public class SingleThread extends Thread{
  public void run() {
        System.out.println("Thread is running only one time");
    }
  
  public static void main(String[] args) {
     SingleThread st = new SingleThread();
            st.start();
    }
}