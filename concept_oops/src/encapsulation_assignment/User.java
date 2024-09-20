package encapsulation_assignment;

import java.util.Scanner;

public class User {
	private int userpin;
	

	public int getUserpin() {
		return userpin;
	}


	public void setUserpin(int userpin) {
		this.userpin = userpin;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		Bank bank = new Bank();
		System.out.println("Enter the PIN : ");
		int validpin = sc.nextInt();
		
		user.setUserpin(validpin);
		bank.setPin(validpin);
		bank.withdraw();

	}

}
