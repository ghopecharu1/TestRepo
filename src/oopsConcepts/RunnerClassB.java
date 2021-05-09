package oopsConcepts;

public class RunnerClassB {

	public static void main(String[] args) {
		Constructor Emp1=new Constructor(1000,"Sujith","xyz");
		Constructor Emp2= new Constructor();
		Emp1.Display();
		
		ClassB obj1= new ClassB();
		obj1.Name="Raj";
		obj1.salary=2000;
		obj1.OrgName="TTTT";
		obj1.Display();
		obj1.show();
		ClassC obj2= new ClassC();
		obj2.Name="RaM";
		obj2.salary=6000;
		obj2.OrgName="XXXX";
		obj2.Display();
		obj2.run();

	}

}
