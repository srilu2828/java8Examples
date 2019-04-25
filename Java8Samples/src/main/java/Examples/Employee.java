package Examples;

public class Employee {

	String enmae;
	String designation;
	double salary;
	String city;
	public Employee(String enmae, String designation, double salary, String city) {
		super();
		this.enmae = enmae;
		this.designation = designation;
		this.salary = salary;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [enmae=" + enmae + ", designation=" + designation + ", salary=" + salary + ", city=" + city
				+ "]";
	}
	
}
