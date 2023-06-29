import java.util.Scanner;

public class Exceptie {
    static int price;
    static Scanner input = new Scanner(System.in);
     static void metoda() {
        try {
            price = 0;
            System.out.println("Enter price for " + "product" + ":");
            price = input.nextInt();
            }
        catch (Exception InputMismatchException) {
            System.out.println("Invalid data type entered.");
            InputMismatchException.printStackTrace();
        }
    }
}