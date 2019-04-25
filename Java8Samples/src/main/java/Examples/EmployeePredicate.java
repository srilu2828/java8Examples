package Examples;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;
import Examples.Employee;

public class EmployeePredicate {
	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Employee name");
		 * String name = sc.next(); System.out.println("Employee designation"); String
		 * designation = sc.next(); System.out.println("Employee salary"); double salary
		 * = Integer.parseInt(sc.next()); System.out.println("Employee name"); String
		 * city = sc.next();
		 */
		Predicate<Employee>  p = e->e.city.equals("Bangalore");
		ArrayList<Employee> el = populateEmployee();
		System.out.println("List of Employee having city as Bangalore");


		for(Employee e:el) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}

	}

	public static ArrayList<Employee> populateEmployee() {
		// TODO Auto-generated method stub
		ArrayList<Employee> el =new ArrayList<>();
		Employee e1= new Employee("srilu", "software", 950000, "Bangalore");
		Employee e2= new Employee("pranav", "internship", 950000, "Bangalore");
		Employee e3= new Employee("bhuvan", "Astronat", 950000, "Bangalore");
		Employee e4= new Employee("yshu", "doctor", 950000, "Bangalore");
		el.add(e1);
		el.add(e2);
		el.add(e3);
		el.add(e4);
		return el;
	}
}
