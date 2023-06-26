package studyingoops1;

public class UseLibrary {
    public static void main(String[] args) {
    	
    	Book book1 = new Book ();
    	book1.author = "MuthuKumar";
    	book1.type = "Frictional";
    	book1.title = "Simba in Wonderland";
    	
    	Book book2 = new Book();
    	book2.author = "Ajith";
    	book2.type = "Science";
    	book2.title = "Think about Atom";
    	
    	Library lib1 = new Library ();
    	lib1.name = "Anna Library".toUpperCase();
    	lib1.location = "Koyambedu,Chennai";
    	lib1.since = 1997;
    	lib1.book = book1;
    	
    	Library lib2 = new Library ();
    	lib2.name = "kamarajar library".toUpperCase();
    	lib2.location = "OMR,Chennai";
    	lib2.since = 2000;
    	lib2.book = book2;
    	
    	System.out.println("LIB 2 Location :"+lib2.location);
    	System.out.println("Lib 1 author :"+lib1.book.author);
    } 
}
