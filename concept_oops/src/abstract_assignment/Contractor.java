package abstract_assignment;


public class Contractor extends Employee{
	int workingHours;

	public Contractor(String name, double paymentperhour, int workingHours) {
		super(name, paymentperhour);
		this.workingHours = workingHours;
	}
	
	public double calculateSalary() {
		return paymentperhour * workingHours;
		
	}

	public static void main(String[] args) {
		Contractor con = new Contractor("Anu", 50, 9);
		System.out.println("Salary of Contractor :" +con.calculateSalary());

	}

}
