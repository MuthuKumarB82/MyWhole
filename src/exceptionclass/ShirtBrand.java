package exceptionclass;

public class ShirtBrand {
  public static void main(String[] args) throws Exception,CheckBrandException {
	  String[] a = {"Peter","Arrow","mk"};
	  try {
		  for(int i=0; i<a.length; i++) {
			  if(a[i].contains("Arrow")) {
				  throw new CheckBrandException("Available");
			  }
			  else if(a[i].contains("Peter")){
				  throw new CheckBrandException("Available");
			  }
			  else {
				  System.out.println("NOT");
			  }
		  }
	  } catch(Exception ss) {
		  ss.printStackTrace();
	  }
  }
}
