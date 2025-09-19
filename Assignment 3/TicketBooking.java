package Assignment3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketBooking {
	
	public static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException("UnderAge: Cannot issue tickets for persons below 18");
		}
		System.out.println("You are eligible to buy tickets");
	}
	
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		String[] tickets = {"Luxury", "Premium", "Economy"};
		int[] prices = {5000, 4000, 2000};
		
		try {
			System.out.println("Enter your age: ");
			int age = Integer.parseInt(sc.nextLine());
			checkAge(age);
			
			System.out.println("Select ticket type between 0-2: ");
			System.out.println(tickets[0] + " | " + prices[0]);
			System.out.println(tickets[1] + " | " + prices[1]);
			System.out.println(tickets[2] + " | " + prices[2]);
			int option = sc.nextInt();
			String selTicket = tickets[option];
			int selPrice = prices[option];
			
			System.out.println("Enter number of tickets: ");
			int q = sc.nextInt();
			int amount = q * selPrice;
			
			System.out.println("Amount payable: " + amount);
			
		}catch (InputMismatchException e) {
			System.out.println("Exception: " + "Invalid value entered");
		}catch (IndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		}finally {
			System.out.println("Process complete!!!");
		}
	}
}
