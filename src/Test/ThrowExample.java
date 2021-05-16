package Test;

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int age=12;
			if(age<18) {
				throw new ArithmeticException("Not valid age");
			}else {
				System.out.println("Eligible for voting");
			}
		}catch(ArithmeticException e) {
			System.out.println("Exception handled");
			
		}

	}

}
