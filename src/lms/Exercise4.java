package lms;

public class Exercise4 {
    public static void main(String[] args) {
    	
    	String[] result = args[0].split(",");
       
    	int rollno = Integer.parseInt(result[1]);
        boolean isPresent = Boolean.parseBoolean(result[2]);
        long mobNo = Long.parseLong(result[4]);
        
        System.out.println("Name: "+result[0]);
        System.out.println("RollNo.: "+rollno);
        System.out.println("Is Present: "+isPresent);
        System.out.println("Mail ID.: "+result[3]);
        System.out.println("Mob No.: "+mobNo);
    }
}