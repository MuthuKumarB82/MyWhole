package studyingcollections3;

public class Players {
   private String name;
   private int age;
   private int jerseyNo;
   private int runs;
   private String team;
   
   public void setName(String name) {
	   this.name = name;
   }
   public String getName() {
	   return name;
   }
   public void setAge(int age) {
	   this.age = age;
   }
   public int getAge() {
	   return age;
   }
   public void setJerseyNo(int jerseyNo) {
	   this.jerseyNo = jerseyNo;
   }
   public int getJerseyNo() {
	   return jerseyNo;
   }
   public void setRuns(int runs) {
	   this.runs =runs;
   }
   public int getRuns() {
	   return runs;
   }
   public void setteam(String team) {
	   this.team = team;
   }
   public String getTeam() {
	   return team;
   }
   public Players(String name,int age,int jerseyNo,int runs,String team) {
	   this.name = name;
	   this.age = age;
	   this.jerseyNo = jerseyNo;
	   this.team = team;
	   this.runs = runs;
   }
   public String toString() {
	   return "NAME: "+name.toUpperCase()+", AGE: "+age+", JERSEY No.: "+jerseyNo+", TEAM NAME: "+team.toUpperCase()+", RUNS: "+runs;
   }
}
