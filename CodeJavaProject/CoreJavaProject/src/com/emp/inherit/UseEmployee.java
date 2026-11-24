package com.emp.inherit;
import java.util.Scanner;

public class UseEmployee {

    public static void main(String[] args) {
        PermanentEmployee p1 =
                new PermanentEmployee(100, "Bob", 9000, 3000);

        System.out.println(p1);
        p1.display();
        System.out.println(
                "Total salary of permanent employee: " + p1.calculateSalary()
        );

        TemporaryEmployee t1 =
                new TemporaryEmployee(101, "Alice", 20000, 30, 900);

        System.out.println(t1);
        System.out.println(
                "Total salary of temporary employee: " + t1.calculateSalary()
        );

        // A superclass reference can refer to a subclass object.
        Employee p2 = new PermanentEmployee(102, "Eve", 80000, 4000);
        Employee t2 = new TemporaryEmployee(103, "Adam", 3000, 60, 1000);

        p2.display();
        t2.display();

        // p2 refers to a PermanentEmployee, so the cast is valid here.
        PermanentEmployee p3 = (PermanentEmployee) p2;
        PermanentEmployee p4 = p1;

        System.out.println(p3);
        System.out.println(p4);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the employee Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println(id);
        
        System.out.println("Enter the employee Name: ");
        String name = sc.nextLine();
        System.out.println(name);
        
        System.out.println("Enter the employee Salary: ");
        double salary = sc.nextDouble();
        System.out.println(salary);
        
        
        
        
    }
}