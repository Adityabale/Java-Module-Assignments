package Assignment3;
import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) throws NullPointerException, NumberFormatException {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter a valid Integer value: ");
			int value = Integer.parseInt(sc.nextLine());
			
		}catch (NullPointerException e) {
			System.out.println("Error: Cannot enter null values.");
		}catch (NumberFormatException e) {
			System.out.println("Error: Enter a valid Integer value, not a character.");
		}finally {
			System.out.println("Conversion attempt completed.");
		}
	}
}
