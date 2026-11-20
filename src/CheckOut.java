import java.util.Scanner;

public class CheckOut {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        boolean cont = false;
        double itemPrice;
        double totalPrice = 0;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 99.99);
            totalPrice = totalPrice + itemPrice;
            cont = SafeInput.getYNConfirm(in, "Would you like to add another item?");
        } while (cont);
        System.out.printf("\nYour total price is $%.2f", totalPrice);
    }
}
