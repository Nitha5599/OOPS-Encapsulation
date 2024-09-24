package abstract_assignment;

public abstract class Employee {
	String name;
	double paymentperhour;
	
	public Employee(String name, double paymentperhour) {
		this.name = name;
		this.paymentperhour = paymentperhour;
	}
	
	public abstract double calculateSalary();

}
