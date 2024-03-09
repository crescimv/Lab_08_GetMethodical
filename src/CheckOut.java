import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice;
        double totalCost=0;
        boolean moreItems;

            do {
                itemPrice=SafeInput.getRangedDouble(in, "Whats the price of your item? [0.50-10.0]", 0.50, 10.0);
                totalCost=itemPrice+totalCost;
                moreItems=SafeInput.getYNConfirm(in, "Would you like to add more items? [Y,N]");
            } while (moreItems);

        System.out.println("Total cost is "+totalCost);
    }
}
