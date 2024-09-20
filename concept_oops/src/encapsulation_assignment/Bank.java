package encapsulation_assignment;

import java.util.Scanner;

public class Bank {
	private int pin;

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public boolean validatePin() {
        if (pin == 1001 || pin == 1234 || pin == 1212) {
            return true;
        }
        return false;
    }
	
	public void withdraw() {
        if (validatePin()) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the amount to withdraw: ");
            double amount = sc.nextDouble();
            System.out.println("*****Withdrawal successfull******");
        } else {
            System.out.println("Invalid Pin Number!!!!");
        }
    }

}
