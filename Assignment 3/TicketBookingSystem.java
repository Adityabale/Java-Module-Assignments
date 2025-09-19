import java.util.InputMismatchException;
import java.util.Scanner;

public class TicketBookingSystem {

    public static void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter phone number: ");
            sc.nextLong();
            sc.nextLine();
            System.out.println("Enter movie name: ");
            sc.nextLine();

            System.out.println("\nEnter age: ");
            int age = sc.nextInt();
            setAge(age);

            int maxSeat = 5;

            System.out.println("\nMaximum number of tickets that can be booked: " + maxSeat);
            System.out.println("\nEnter number of tickets to be booked: ");
            int max = sc.nextInt();
            sc.nextLine();

            if (max > maxSeat) {
                throw new ArrayIndexOutOfBoundsException("Cannot book more than " + maxSeat + " tickets.");
            }

            String[] ticket = new String[maxSeat];
            int i = 0;
            while (i < max) {
                System.out.println("\nName " + (i + 1) + ": ");
                String name = sc.nextLine();
                ticket[i] = name;
                i++;
            }

            System.out.println("\nNames in ticket: ");
            for (int j = 0; j < max; j++) {
                System.out.println(ticket[j]);
            }

            sc.close();
        } catch (InputMismatchException ie) {
            System.out.println("\nException: " + ie);
        } catch (IllegalArgumentException ie) {
            System.out.println("\nException: " + ie);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("\nException: " + ae);
        }
    }
}
