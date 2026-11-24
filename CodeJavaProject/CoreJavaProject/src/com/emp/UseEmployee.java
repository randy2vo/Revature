package com.emp;

public class UseEmployee {

	static {
		System.out.println("static block of UseEmployee class");
	}
	
	public static void main(String[] args) {
		Employee empObj = new Employee();
		
		System.out.println(empObj.id);
		System.out.println(empObj.getName());
		System.out.println(empObj.getSalary());
		
		Employee empObj1 = new Employee(2, "bob", 80000d);
		System.out.println(empObj1.id);
		System.out.println(empObj1.getName());
		System.out.println(empObj1.getSalary());
		
		Employee empObj2 = new Employee();

		System.out.println(empObj2.id);
		System.out.println(empObj2.getName());
		System.out.println(empObj2.getSalary());
		
		empObj1.setSalary(9000);
		System.out.println(empObj);
		System.out.println(empObj1);
		System.out.println(empObj2);
		
		
		System.out.println(empObj1.incrementSalary());


		System.out.println("------------------------------");
		
		Employee e1 = new Employee(105, "Joe", 3000);
		Employee e2 = new Employee(105, "Joe", 3000);
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

		e1 = null;
		e2 = null;
		
		System.gc(); //requesting JVM for garbage collection 
		
		System.out.println("main method completed");
		
		
	}
}