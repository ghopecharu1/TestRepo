package oopsConcepts;

public class Constructor {

	public int salary;
	public String Name;
	public String OrgName;
	public Constructor() {
		System.out.println("INSIDE CONSTRUCTOR");
	}
	public Constructor(int val1, String val2, String val3){
		System.out.println("Insidde parameter constructor");
		this.salary=val1;
		this.Name=val2;
		this.OrgName=val3;
	}
	
	public void Display() {
		System.out.println("Name of Emp: "+Name);
		System.out.println("Name of Organization: "+OrgName);
		System.out.println("Salary of Emp: "+salary);
	}


	

}
