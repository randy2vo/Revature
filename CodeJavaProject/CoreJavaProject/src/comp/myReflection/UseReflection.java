package comp.myReflection;

import java.lang.reflect.Method;

public class UseReflection {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Alice", 45000.0);
		Class<?> cls = e1.getClass();
		
		System.out.println("Class Name: " + cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackageName());
		System.out.println(cls.isInterface());
		
		System.out.println();
		
		Method[] ms = cls.getMethods();
		for(Method m : ms) {
			System.out.println(m.toString());
		}
		
		
	}
}
