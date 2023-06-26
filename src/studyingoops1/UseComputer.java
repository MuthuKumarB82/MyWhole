package studyingoops1;

public class UseComputer {
  public static void main(String[] args) {
	  Cpu cpu = new Cpu("Dell",2000);
	  Computer computer = new Computer("Lenovo", 38999,cpu);
	  
	  System.out.println(computer.cpu.brand+" "+cpu.price);
	  System.out.println(computer.brand+" "+computer.price);
  }
}
