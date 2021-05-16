package Test;

public class Throws1 {

	public static void main(String[] args) {
		
		Throws1 obj = new Throws1();
		
		try {
			obj.elegibility(17);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Exception handled");
		}

	}
	public void elegibility(int age) throws ArithmeticException{
		
		if(age<18) {
			
			throw new ArithmeticException("Not Valid Age");
			
			}else {
				
				System.out.println("Eligible for Voting");
			}
	}

}
