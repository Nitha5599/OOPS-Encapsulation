package methodoverriding2;

import java.util.Scanner;

public class Onseason extends Offseason{
	public void discount(double amt) {
        double discountAmount = amt * 0.40;
        double finalAmount = amt - discountAmount;
        System.out.println("********Offseason*******");
        System.out.println("Original Amount: " + amt);
        System.out.println("Discount (40%): " + discountAmount);
        System.out.println("Final Amount : " + finalAmount);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Amount :");
        double amt= sc.nextDouble();
        
        System.out.println("Enter the season :");
        System.out.println("1. Onseason");
        System.out.println("2. Offseason");
        int ch = sc.nextInt();
        
        switch (ch) {
		case 1: Onseason onseason = new Onseason();
				onseason.discount(amt);
				break;
		case 2: Offseason offseason = new Offseason();
				offseason.discount(amt);
				break;
		default:
			System.out.println("Invalid Input!!!!");
        }
	}

}

