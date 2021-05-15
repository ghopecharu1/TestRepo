package Test;

public class ExcepHandling {

	public static void main(String[] args) {
		int a=10;
		int b=0;   //check using b=5;could 
		
		try {
		int div=a/b;
		System.out.println("After error");  //will not execute 
		
		}catch(ArithmeticException e) {
			
			 System.out.println("Arithmetic Exception Handled");
			 
		}catch (Exception e) {
			
		
    System.out.println("Exception Handled");
	}finally {
		System.out.println("Try Catch exception successfully");
	}
	// System.out.println("Hello");
 int myarray[]= {1,2,3,4,5};
 try {
	 System.out.println("Third value in Arry:"+myarray[6]);
	 
 }catch (ArrayIndexOutOfBoundsException e) {
	 System.out.println("Array Out Bound Exception handled");
 }
}
}
