import java.util.Scanner;

public class UserDefinedMethods {
   static Scanner input = new Scanner(System.in);
    public static double GetTotal(){
        double total = 0;
        boolean moreItems = true ;
        char response;
        while (moreItems)  {
            total += getItemPrice(getItemName());
            System.out.println("More items? (y/n");
            response = input.next().charAt(0);
            if(response!='y' && response!='Y'){;
            moreItems = false;}
            input.nextLine();
        }
           return total;
    }
    public static String getItemName(){
        String name;
        System.out.println("Enter item name:");
        name = input.nextLine();
        return name;
    }
 public static double getItemPrice(String value){
        double price = 0;
        try{
            System.out.println("Enter price for "+ value + ":");
            price = input.nextDouble();
        }
        catch(Exception e){
            System.out.println("Invalid data type entered.");
            e.printStackTrace();
        }
        int quantity = getItemQuantity();
        return quantity*price;
 }
public static int getItemQuantity() {
    System.out.println("Enter the quantity for this item: ");
    int quantity = input.nextInt();
    return quantity;
}

    public static void print(){

        System.out.printf("The total for your grocery items is "+ GetTotal() + " thanks for shopping with us!");
    }
}
