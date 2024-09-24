package abstract_assignment;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(String name, double paymentperhour) {
		super(name, paymentperhour);
	}
	
	public double calculateSalary() {
		return paymentperhour * 8;
		
	}

	public static void main(String[] args) {
		FullTimeEmployee emp = new FullTimeEmployee("Sachin", 100);
		System.out.println("Salary of Full Time Employee :" +emp.paymentperhour);

	}

}
