package exceptionclass;

public class StackOverFlow {
   public void findA() {
	   findB();
   }
   public void findB() {
	   findB();
   }
   public static void main(String[] args) {
	   StackOverFlow sof = new StackOverFlow ();
	   sof.findB();
   }
}
