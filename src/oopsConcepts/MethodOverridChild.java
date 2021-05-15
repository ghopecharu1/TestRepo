package oopsConcepts;

public class MethodOverridChild extends MethodOverridParent{
  public void display(int a, int b, int c) {
	  int sum=a+b+c;
	  System.out.println("Child class Sum: "+sum); 
	  System.out.println("Inside child class");
  }
	
}
