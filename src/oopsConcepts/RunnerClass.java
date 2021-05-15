package oopsConcepts;

public class RunnerClass {
	public static void main(String[] args) {
		
	
/*	ClassA Emp1 = new ClassA();
	
	Emp1.Name="Suhjith";
	Emp1.OrgName="XYZ";
	Emp1.salary=1000;
	Emp1.Display();*/
		//method overloading by passing same para having diff datatype
		Methodoverloading1 t1=new Methodoverloading1();
		t1.add(2, 3);
		t1.add(1.1, 2.3);
		
		//method overriding
		MethodOverridChild c1=new MethodOverridChild();
		c1.display(2,3,7);
		
		//Abstraction
		
		AbstractChild c2=new AbstractChild();
		c2.method1();
		c2.method2();
		
	//Encapsulation	using getters and setters
	EncapsuEx e1= new EncapsuEx();
	e1.setEmpid(200);
	e1.setEmpname("Dinesh");
	e1.setSalary(20000);
	System.out.println("Empid: "+e1.getEmpid()+" Name: "+e1.getEmpname()+" Salary: "+e1.getSalary());
		
	}
}
