package Assignment3;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of items in cart: ");
            int no = sc.nextInt();
            sc.nextLine();
            String[] cart = new String[no];
            int i = 0;
            while (i < no) {
                System.out.println("\nItem " + (i + 1) + ": ");
                String item = sc.nextLine();

                cart[i] = item;
                i++;
            }

            System.out.println("\nItems in cart: ");
            for (int j = 0; j < no; j++) {
                System.out.println(cart[j]);
            }

            System.out.println("\n\nEnter total quantity (in numbers): ");
            String quantity = sc.nextLine();
            int stringToInt = Integer.parseInt(quantity);
            System.out.println("Quantity: " + stringToInt);

            System.out.println("\n\nEnter total items: ");
            int num1 = sc.nextInt();
            System.out.println("Number of people: ");
            int num2 = sc.nextInt();
            int res = num1 / num2;
            System.out.println("Items per person: " + res);

            sc.close();

        } catch (ArrayIndexOutOfBoundsException arre) {
            System.out.println("\nException: " + arre);
        } catch (NumberFormatException ne) {
            System.out.println("\nException: " + ne);
        } catch (ArithmeticException ae) {
            System.out.println("\nException: " + ae);
        }
    }
}
